package project.youngsinsa.order.service;

import org.springframework.stereotype.Service;
import project.youngsinsa.order.domain.OrderList;

@Service
public interface OrderService {
    //장바구니
    void order(OrderList orderList,String form);
}
