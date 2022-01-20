package project.youngsinsa.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.Comment;
import project.youngsinsa.category.repository.CategoryRepository;
import project.youngsinsa.category.repository.CategoryRepositoryImp;
import project.youngsinsa.category.service.CategoryService;
import project.youngsinsa.category.service.CategoryServiceImp;
import project.youngsinsa.member.domain.SessionManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/hhhh/category/onepiece")
public class ProductControllerOnepiece {

    private CategoryRepository categoryRepository;
    private CategoryService categoryService;
    private SessionManager sessionManager;


    public ProductControllerOnepiece(CategoryServiceImp categoryServiceImp
            , SessionManager sessionManager, CategoryRepositoryImp categoryRepository) {
        this.categoryRepository= categoryRepository;
        this.categoryService = categoryServiceImp;
        this.sessionManager = sessionManager;
    }



    //top 상품 상세 페이지
    @GetMapping("/Num")
    public ModelAndView showOne(HttpServletRequest request, Model model) {

        String num = request.getParameter("modelNum");
        String category = "onepiece";
        Category product = categoryService.showOne(num,category);
        List<Comment> com = categoryRepository.loadComment(num);

        ModelAndView mv = new ModelAndView("hhhh/product");
        mv.addObject("product", product);
        mv.addObject("comment",com);
        return mv;
    }



    //댓글쓰기
    @PostMapping("/Num")
    public ModelAndView writeComment(HttpServletRequest request, Comment comment) {

        if (request.getSession().getAttribute("userID") != null) {
            HttpSession session = request.getSession();
            String id = (String) session.getAttribute("userID");
            comment.setUserID(id);

            categoryService.writeComment(comment);
            ModelAndView mv = new ModelAndView("hhhh/product");
            String num = request.getParameter("modelNum");
            String category ="onepiece";
            Category product = categoryService.showOne(num,category);
            List<Comment> com = categoryRepository.loadComment(num);
            mv.addObject("product", product);
            mv.addObject("comment", com);

            return mv;
        }else if(request.getSession().getAttribute("userID")==null){
            return new ModelAndView("redirect:/localhost:8080/hhhh");
        }
        return new ModelAndView("redirect:/localhost:8080/hhhh");
    }

    // 좋아요
    @GetMapping("/like")
    public ModelAndView likeUp(HttpServletRequest request){
        String num = request.getParameter("modelNum");
        String url ="redirect:/hhhh/onepiece/bag/Num?modelNum="+num;
        String form = request.getParameter("form");
        categoryService.likeUp(form,num);
        ModelAndView mv = new ModelAndView(url);
        return mv;
    }









}
