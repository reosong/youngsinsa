package project.youngsinsa.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @GetMapping("/hhhh/category")
    public ModelAndView showTop(Model model) {

        List<Category> list = categoryService.showTopList();

        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    //top 상품 상세 페이지
    @GetMapping("/hhhh/top")
    public ModelAndView showOne(HttpServletRequest request, Model model) {
        int modelNum = Integer.parseInt(request.getParameter("modelNum"));

        int num = Integer.parseInt(request.getParameter("modelNum"));
        Category product = categoryService.showOne(num);

        ModelAndView mv = new ModelAndView("hhhh/product");
        mv.addObject("product", product);


        return mv;
    }

    //댓글쓰기
    //로그인 유무 따져야함
    @PostMapping("hhhh/top")
    public ModelAndView writeComment(HttpServletRequest request, Comment comment) {

        if (request.getSession().getAttribute("userID") != null) {
            HttpSession session = request.getSession();
            String id = (String) session.getAttribute("userID");
            comment.setUserID(id);

            categoryService.writeComment(comment);
//        String url = "./hhhh/top?modelNum=" + request.getParameter("modelNum");
            String url = "redirect:/";
            ModelAndView mv = new ModelAndView(url);

            return mv;
        }else if(request.getSession().getAttribute("userID")==null){
            return new ModelAndView("redirect:/");
        }
        return new ModelAndView("redirect:/");
    }
}
