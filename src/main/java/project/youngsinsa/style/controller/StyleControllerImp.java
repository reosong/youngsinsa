package project.youngsinsa.style.controller;

import org.springframework.stereotype.Controller;
import project.youngsinsa.style.service.StyleService;
import project.youngsinsa.style.service.StyleServiceImp;

@Controller
public class StyleControllerImp implements StyleController{

    private StyleService styleService;

    public StyleControllerImp(StyleServiceImp styleService) {
        this.styleService = styleService;
    }




}
