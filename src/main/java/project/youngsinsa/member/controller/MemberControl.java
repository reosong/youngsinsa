package project.youngsinsa.member.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.member.domain.Member;
import project.youngsinsa.member.domain.SessionManager;
import project.youngsinsa.member.Service.MemberService;
import project.youngsinsa.member.Service.MemberServiceImp;

import javax.servlet.http.HttpServletRequest;
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

    //로그인 화면이동
    @GetMapping("/login")
    public String login(HttpServletRequest request) {
//        if (request.getSession()==null) {
//            return "hhhh/login";
//        } else if (request.getSession() != null) {
//            return "redirect:/";
//        }
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


        return "hhhh/main";
    }

    //회원가입 화면이동
    @GetMapping("/login/member")
    public String joinFrom( HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("userID") == null) {
            return "hhhh/member";
        }else{
            return "redirect:/";
        }
    }
    //회원가입
    @PostMapping("/login/member")
    public String JoinMember(Member member, @RequestParam String userPasswordOK) {

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

    //로그아웃
    @GetMapping("/login/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();

        return "hhhh/main";
    }

    //마이페이지 이동
    @GetMapping("/login/myPage")
    public String myPage(){
        return "hhhh/myPage";
    }
    //정보 업데이트
    @PostMapping("/login/myPage")
    public ModelAndView memberUpdate(Member member) {
        memberService.memberUpdate(member);
        ModelAndView mv = new ModelAndView("hhhh/main");
        return mv;
    }


}
