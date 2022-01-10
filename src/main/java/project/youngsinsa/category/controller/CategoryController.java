package project.youngsinsa.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.service.CategoryService;

@Controller
public class CategoryController {

    private CategoryDao categoryDao;
    private CategoryService categoryService;

    public CategoryController(CategoryDao categoryDao, CategoryService categoryService) {
        this.categoryDao = categoryDao;
        this.categoryService = categoryService;
    }

    @GetMapping("/category/top")
    public ModelAndView showTop(Model model){
        model.addAttribute(categoryService.showTopList());
        ModelAndView mv = new ModelAndView("hhhh/top");

        return mv;

    }
}
