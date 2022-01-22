package project.youngsinsa.member.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.style.dao.Style;
import project.youngsinsa.category.service.CategoryService;
import project.youngsinsa.category.service.CategoryServiceImp;
import project.youngsinsa.member.domain.Member;
import project.youngsinsa.member.domain.SessionManager;
import project.youngsinsa.member.Service.MemberService;
import project.youngsinsa.member.Service.MemberServiceImp;
import project.youngsinsa.style.service.StyleService;
import project.youngsinsa.style.service.StyleServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/hhhh")
@RequiredArgsConstructor

public class MemberControl {


    private MemberService memberService;
    private SessionManager sessionManager;
    private CategoryService categoryService;
    private StyleService styleService;

    @Autowired
    public MemberControl(MemberServiceImp memberServiceImp, SessionManager sessionManager,
                         CategoryServiceImp categoryServiceImp, StyleServiceImp styleServiceImp) {
        this.memberService = memberServiceImp;
        this.sessionManager = sessionManager;
        this.categoryService = categoryServiceImp;
        this.styleService = styleServiceImp;
    }

    @GetMapping
    public ModelAndView main() {
        Category category= new Category();
        category.setForm("top");
        List<Category> list=categoryService.showList(category);
        List<Style> list2 = styleService.showList();
        ModelAndView mv = new ModelAndView("hhhh/main");
        System.out.println(list2.size());
        mv.addObject("list", list);
        mv.addObject("styleList", list2);

        return mv;
    }

    @PostMapping
    public ModelAndView ch(HttpServletRequest request){
        System.out.println("ssss");
        System.out.println(request.getParameter("form"));

        return null;
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
    public ModelAndView loginTry(Member member, HttpServletRequest request) {
        String result = memberService.login(member);
        ModelAndView mv = new ModelAndView();
        if (result == null) {
         mv.setViewName("error");
            return mv;
        }

        int level =memberService.findLevel(member.getUserID());
        if(level == 99){
            mv.setViewName("redirect:http://localhost:8080/admin");
            return  mv;
        }
        HttpSession session = request.getSession();
        session.setAttribute("userID", member.getUserID());
        mv.setViewName("redirect:http://localhost:8080/hhhh");

        return mv;
    }

    //회원가입 화면이동
    @GetMapping("/login/member")
    public String joinFrom( HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("userID") == null) {
            return "hhhh/member";
        }else{
            return "hhhh/member";
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
        return "redirect:/hhhh";
    }


    @GetMapping("/login/home")
    public String back() {
        return "redirect:/";
    }

    //로그아웃
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();

        System.out.println("cont");
        return "hhhh/main";
    }

    //마이페이지 이동
    @GetMapping("/myPage")
    public String myPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        if (session.getAttribute("userID") == null) {
            return "hhhh/member";
        }else{
            return "hhhh/myPage";
        }

    }

    //정보 업데이트
    @PostMapping("/myPage")
    public ModelAndView memberUpdate(Member member) {
        memberService.memberUpdate(member);
        ModelAndView mv = new ModelAndView("hhhh/main");
        return mv;
    }






}
