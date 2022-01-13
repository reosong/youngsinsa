package project.youngsinsa.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;
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
@RequestMapping("hhhh/category")
public class CategoryController {

    private CategoryRepository categoryRepository;
    private CategoryService categoryService;
    private SessionManager sessionManager;


    public CategoryController(CategoryServiceImp categoryServiceImp
            , SessionManager sessionManager, CategoryRepositoryImp categoryRepository) {
        this.categoryRepository= categoryRepository;
        this.categoryService = categoryServiceImp;
        this.sessionManager = sessionManager;
    }

    //top카테고리 상품리스트 불러오기
    @GetMapping("/top")
    public ModelAndView showTop(Model model) {

        List<Category> list = categoryService.showTopList();
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    @GetMapping("/bottom")
    public ModelAndView showBottom(Model model) {

        List<Category> list = categoryService.showTopList();
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }













}
