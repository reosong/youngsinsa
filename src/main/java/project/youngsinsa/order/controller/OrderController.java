package project.youngsinsa.order.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.order.domain.OrderList;
import project.youngsinsa.order.service.OrderService;
import project.youngsinsa.order.service.OrderServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/hhhh/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderServiceImp orderServiceImp) {
        this.orderService = orderServiceImp;
    }



    @GetMapping
    public ModelAndView cart(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<OrderList> list=orderService.readOrder((String) session.getAttribute("userID"));
        ModelAndView mv = new ModelAndView("hhhh/order");
        mv.addObject("order",list);

        return mv;
    }
    @GetMapping("/remove")
    public ModelAndView remove(HttpServletRequest request){
        int orderNum = Integer.parseInt(request.getParameter("orderNum"));
        orderService.removeOrder(orderNum);
        ModelAndView mv = new ModelAndView("redirect:/hhhh/order");

        return mv;
    }



}
