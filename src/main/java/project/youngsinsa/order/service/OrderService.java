package project.youngsinsa.order.service;

import org.springframework.stereotype.Service;
import project.youngsinsa.order.domain.OrderList;

import java.util.List;

@Service
public interface OrderService {
    //장바구니
    void order(OrderList orderList,String form);

    //장바구니 목록 보기
    List<OrderList> readOrder(String userID);

    //장바구니 지우기
    void removeOrder(int orderNum);

    //전체 장바구니 보기
    List<OrderList> showList();
}
