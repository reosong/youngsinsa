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
import project.youngsinsa.member.memberRepository.MemberRepository;
import project.youngsinsa.member.memberRepository.MyMemberRepository;

@Controller
@RequestMapping("/hhhh/login")
@RequiredArgsConstructor
public class MemberControl {


    private MemberRepository memberRepository;

    @Autowired
    public MemberControl(MyMemberRepository myMemberRepository) {
        this.memberRepository= myMemberRepository;
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
    public String JoinMember(@RequestParam String userID,
                             @RequestParam String userPassword,
                             @RequestParam String email,
                             Model model) {
        Member member = new Member();
        member.setUserID(userID);
        member.setUserPassword(userPassword);
        member.setEmail(email);

        memberRepository.save(member);
        model.addAttribute("model", model);
        return "hhhh/login";
    }
}
