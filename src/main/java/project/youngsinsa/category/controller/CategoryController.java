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

    @GetMapping("/hhhh/top")
    public ModelAndView showTop(Model model){

        List<Category> list = categoryService.showTopList();

        ModelAndView mv = new ModelAndView("hhhh/top");
        mv.addObject("list",list);
        return mv;

    }
}
