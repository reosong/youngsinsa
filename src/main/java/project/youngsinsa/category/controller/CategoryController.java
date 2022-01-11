package project.youngsinsa.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;
import project.youngsinsa.category.service.CategoryService;
import project.youngsinsa.category.service.CategoryServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CategoryController {

    private CategoryDao categoryDao;
    private CategoryService categoryService;

    public CategoryController(CategoryDao categoryDao, CategoryServiceImp categoryServiceImp
    ) {
        this.categoryDao = categoryDao;
        this.categoryService = categoryServiceImp;
    }

    //top카테고리 상품리스트 불러오기
    @GetMapping("/hhhh/category")
    public ModelAndView showTop(Model model){

        List<Category> list = categoryService.showTopList();

        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list",list);
        return mv;

    }
    //top 상품 상세 페이지
    @GetMapping("/hhhh/top")
    public ModelAndView showOne(HttpServletRequest request,Model model) {
        int modelNum = Integer.parseInt(request.getParameter("modelNum"));

        int num = Integer.parseInt(request.getParameter("modelNum"));
        Category product = categoryDao.showOne(num);

        ModelAndView mv = new ModelAndView("hhhh/product");
        mv.addObject("product",product);
        return mv;
    }
}
