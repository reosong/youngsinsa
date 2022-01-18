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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminController {
    private AdminService adminService;
    @Autowired
    private ImageUp imageUp;

    public AdminController(AdminServiceImp adminService, ImageUp imageUp) {
        this.imageUp = imageUp;
        this.adminService = adminService;
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
    public ModelAndView uploadOk(CategoryTop categoryTop, MultipartHttpServletRequest HttpServletRequest){

try {
    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
    categoryTop.setPhoto1(list.get(0).substring(25));
    System.out.println(list.get(0).substring(25));

    categoryTop.setPhoto2(list.get(1).substring(25));
    categoryTop.setPhoto3(list.get(2).substring(25));
    categoryTop.setPhoto4(list.get(3).substring(25));
    categoryTop.setPhoto5(list.get(4).substring(25));
    categoryTop.setPhoto6(list.get(5).substring(25));

}catch (Exception e){
    e.printStackTrace();
}

        adminService.insertUpload(categoryTop,HttpServletRequest);
        ModelAndView mv = new ModelAndView("hhhh/adminUpload");
        return mv;
    }

    @GetMapping("/orderList")
    public ModelAndView orderList() {
        ModelAndView mv = new ModelAndView("hhhh/adminOrderList");
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
