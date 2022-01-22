package project.youngsinsa.order.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.youngsinsa.order.domain.OrderList;
import project.youngsinsa.order.service.OrderService;
import project.youngsinsa.order.service.OrderServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Controller
@RequestMapping("/hhhh/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderServiceImp orderServiceImp) {
        this.orderService = orderServiceImp;
    }


    @GetMapping
    public ModelAndView cart(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<OrderList> list = orderService.readOrder((String) session.getAttribute("userID"));
        ModelAndView mv = new ModelAndView("hhhh/order");
        mv.addObject("order", list);

        return mv;
    }

    @GetMapping("/remove")
    public ModelAndView remove(HttpServletRequest request) {
        int orderNum = Integer.parseInt(request.getParameter("orderNum"));
        orderService.removeOrder(orderNum);
        ModelAndView mv = new ModelAndView("redirect:/hhhh/order");

        return mv;
    }

//
//    @PostMapping("/buy")
//    public String kakao() {
//        System.out.println("hi");
//        try {
//            URL url = new URL("http://kapi.kakao.com/v1/payment/ready");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("post");
//            con.setRequestProperty("Authorization","KakaoAK 29b90193cb5deaa0d4cdc52d67b005d0");
//            con.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
//
//            con.setDoOutput(true);
//            String param = "cid=TC0ONETIME&partner_order_id=partner_order_id&partner_user_id=partner_user_id&" +
//                    "item_name=초코파이&quantity=1&total_amount=2200&vat_amount=200&tax_free_amount=0" +
//                    "&approval_url=https://developers.kakao.com/success" +
//                    "&fail_url=https://developers.kakao.com/fail" +
//                    "&cancel_url=https://developers.kakao.com/cancel";
//            OutputStream outputStream =con.getOutputStream();
//            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//            dataOutputStream.writeBytes(param);
//            dataOutputStream.flush();
//            dataOutputStream.close();
//
//            int result = con.getResponseCode();
//            InputStream inputStream;
//            System.out.println(result);
//            if(result==200){
//                inputStream = con.getInputStream();
//            }else{
//                inputStream= con.getErrorStream();
//            }
//            InputStreamReader reader = new InputStreamReader(inputStream);
//            BufferedReader br = new BufferedReader(reader);
//            return br.readLine();
//
//
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    @GetMapping("/buy")
    @ResponseBody
    public String kakao1() {

        try {
            URL url = new URL("https://kapi.kakao.com/v1/payment/ready");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization","KakaoAK 29b90193cb5deaa0d4cdc52d67b005d0");
            con.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
            con.setDoOutput(true);
            String param = "cid=TC0ONETIME&partner_order_id=partner_order_id&partner_user_id=partner_user_id&item_name=초코파이&quantity=1&total_amount=100&tax_free_amount=0&approval_url=https://localhost:8080/success&fail_url=https://localhost:8080/fail&cancel_url=https://localhost:8080/cancel";
            OutputStream outputStream =con.getOutputStream();

            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeBytes(param);
            dataOutputStream.close();

            int result = con.getResponseCode();
            InputStream inputStream;

            if(result==200){
                inputStream = con.getInputStream();
            }else{
                inputStream= con.getErrorStream();
            }
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(reader);

            return br.readLine();



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ("hhhh/order");
    }




}
