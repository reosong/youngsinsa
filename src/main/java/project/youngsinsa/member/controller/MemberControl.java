package project.youngsinsa.member.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.youngsinsa.member.MemberDto.Member;
import project.youngsinsa.member.memberService.MemberService;
import project.youngsinsa.member.memberService.MemberServiceImp;

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


    @PostMapping("/login")
    public String loginTry(@RequestParam String userID,
                           @RequestParam String userPassword) {
        return "/index";
    }


    @GetMapping("/member")
    public String joinFrom() {
        return "hhhh/member";
    }


    @PostMapping("/member")
    public String JoinMember(Member member) {
        System.out.println(member.getUserID());
       memberService.join(member);
        return "hhhh/login";
    }
}
