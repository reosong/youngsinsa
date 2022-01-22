package project.youngsinsa.buy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class BuyController {

    @GetMapping("/success")
    public String buy(HttpServletRequest request) {
        String token = request.getParameter("pg_token");
        System.out.println(token);
        return ("hhhh/main");
    }
}
