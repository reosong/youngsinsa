package project.youngsinsa.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.repository.CategoryRepository;
import project.youngsinsa.category.repository.CategoryRepositoryImp;
import project.youngsinsa.category.service.CategoryService;
import project.youngsinsa.category.service.CategoryServiceImp;
import project.youngsinsa.member.domain.SessionManager;

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
    public ModelAndView showTop(Model model,Category category) {
        category.setForm("top");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    @GetMapping("/pants")
    public ModelAndView showBottom(Model model,Category category) {
        category.setForm("pants");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    @GetMapping("/outer")
    public ModelAndView showOuter(Model model,Category category) {
        category.setForm("outer");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    @GetMapping("/onepiece")
    public ModelAndView showOnepiece(Model model,Category category) {
        category.setForm("onepiece");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    @GetMapping("/skirt")
    public ModelAndView showSkirt(Model model,Category category) {
        category.setForm("skirt");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }
    @GetMapping("/sneakers")
    public ModelAndView showSneakers(Model model,Category category) {
        category.setForm("sneakers");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }
    @GetMapping("/shoes")
    public ModelAndView showShoes(Model model,Category category) {
        category.setForm("shoes");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }
    @GetMapping("/bag")
    public ModelAndView showBag(Model model,Category category) {
        category.setForm("bag");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }


    @GetMapping("/sunglass")
    public ModelAndView showSunglass(Model model,Category category) {
        category.setForm("sunglass");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    @GetMapping("/accessory")
    public ModelAndView showAccessory(Model model,Category category) {
        category.setForm("accessory");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }

    @GetMapping("/watch")
    public ModelAndView showWatch(Model model,Category category) {
        category.setForm("watch");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }
    @GetMapping("/jewelry")
    public ModelAndView showJewelry(Model model,Category category) {
        category.setForm("jewelry");
        List<Category> list = categoryService.showList(category);
        ModelAndView mv = new ModelAndView("hhhh/category");
        mv.addObject("list", list);
        return mv;

    }






}
