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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping("/admin")
@Controller
public class AdminController {
    private AdminService adminService;
    @Autowired
    private ImageUp imageUp;

    public AdminController(AdminServiceImp adminService) {
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
    public ModelAndView uploadOk(Category category, MultipartHttpServletRequest HttpServletRequest){

try {
    category.setPhoto1(imageUp.parseFileInfo(1,HttpServletRequest));
}catch (Exception e){
    e.printStackTrace();
}
        adminService.insertUpload(category,HttpServletRequest);
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
