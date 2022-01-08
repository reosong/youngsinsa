package project.youngsinsa.member.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.youngsinsa.member.Dto.Member;
import project.youngsinsa.member.Service.MemberService;
import project.youngsinsa.member.Service.MemberServiceImp;

@Controller
@RequestMapping("/hhhh/login")
@RequiredArgsConstructor
public class MemberControl {


    private MemberService memberService;

    @Autowired
    public MemberControl(MemberServiceImp memberServiceImp) {
        this.memberService = memberServiceImp;
    }


    @GetMapping
    public String login() {
        return "hhhh/login";
    }


    //로그인
    @PostMapping
    public String loginTry(Member member) {


        String result =memberService.login(member);

        if (result == null) {
            return "hhhh/error";
        }
        return "redirect:/";
    }


    @GetMapping("/member")
    public String joinFrom() {
        return "hhhh/member";
    }

    //  회원가입
    @PostMapping("/member")
    public String JoinMember(Member member, @RequestParam String userPasswordOK) {

        System.out.println(userPasswordOK);
        System.out.println(member.getUserPassword());
        if (member.getUserPassword().equals(userPasswordOK)) {
            memberService.join(member);
        } else {
            return "hhhh/error";
        }
        return "redirect:/";
    }

    @GetMapping("/home")
    public String back(){return "redirect:/";}
}
