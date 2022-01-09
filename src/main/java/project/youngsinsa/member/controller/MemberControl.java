package project.youngsinsa.member.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.member.Dto.Member;
import project.youngsinsa.member.Dto.SessionManager;
import project.youngsinsa.member.Service.MemberService;
import project.youngsinsa.member.Service.MemberServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/hhhh")
@RequiredArgsConstructor
public class MemberControl {


    private MemberService memberService;
    private SessionManager sessionManager;

    @Autowired
    public MemberControl(MemberServiceImp memberServiceImp, SessionManager sessionManager) {
        this.memberService = memberServiceImp;
        this.sessionManager = sessionManager;
    }


    @GetMapping("/login")
    public String login() {
        return "hhhh/login";
    }


    //로그인
    @PostMapping("/login")
    public String loginTry(Member member, HttpServletRequest request) {
        String result = memberService.login(member);
        if (result == null) {
//            ModelAndView mv = new ModelAndView("error");
            return "hhhh/error";
        }
        HttpSession session = request.getSession();
        session.setAttribute("userID", member.getUserID());
//        ModelAndView mv = new ModelAndView("hhhh/index");
        System.out.println(session.getAttribute("userID"));
        
        return "hhhh/index";
    }


    @GetMapping("/login/member")
    public String joinFrom() {
        return "hhhh/member";
    }

    //  회원가입
    @PostMapping("/login/member")
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

    @GetMapping("/login/home")
    public String back() {
        return "redirect:/";
    }

    @GetMapping("/login/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "hhhh/index";
    }
}
