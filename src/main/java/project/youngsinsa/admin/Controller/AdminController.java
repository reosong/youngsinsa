package project.youngsinsa.admin.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.admin.Dao.ImageUp;
import project.youngsinsa.admin.service.AdminService;
import project.youngsinsa.admin.service.AdminServiceImp;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;
import project.youngsinsa.order.domain.OrderList;
import project.youngsinsa.order.service.OrderService;
import project.youngsinsa.order.service.OrderServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminController {


    private AdminService adminService;
    private OrderService orderService;
    @Autowired
    private ImageUp imageUp;

    public AdminController(AdminServiceImp adminService, ImageUp imageUp, OrderServiceImp orderServiceImp) {
        this.imageUp = imageUp;
        this.adminService = adminService;
        this.orderService = orderServiceImp;
    }

    @GetMapping
    public ModelAndView admin() {
        ModelAndView mv = new ModelAndView("hhhh/admin");
        return mv;
    }

    @GetMapping("/upload")
    public ModelAndView upload() {
        ModelAndView mv = new ModelAndView("hhhh/adminUpload");
        return mv;
    }




    @PostMapping("/upload")
    public ModelAndView uploadOk(Category category, MultipartHttpServletRequest HttpServletRequest){



        adminService.insertUpload(category,HttpServletRequest);
        ModelAndView mv = new ModelAndView("hhhh/adminUpload");
        return mv;
    }





    @GetMapping("/orderList")
    public ModelAndView orderList() {
        List<OrderList> list = orderService.showList();
        ModelAndView mv = new ModelAndView("hhhh/adminOrderList");
        mv.addObject("order", list);
        return mv;
    }



    @GetMapping("/logout")
    public ModelAndView logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        ModelAndView mv = new ModelAndView("redirect:http://localhost:8080");
        return mv;

    }






    }
