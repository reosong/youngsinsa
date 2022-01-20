package project.youngsinsa.order.service;

import org.springframework.stereotype.Repository;
import project.youngsinsa.order.domain.OrderList;
import project.youngsinsa.order.repository.OrderRepository;
import project.youngsinsa.order.repository.OrderRepositoryImp;

@Repository
public class OrderServiceImp implements OrderService{

    private OrderRepository orderRepository;

    public OrderServiceImp(OrderRepositoryImp orderRepositoryImp){
        this.orderRepository =orderRepositoryImp;
    }
    //장바구니
    @Override
    public void order(OrderList orderList,String form) {
        int num = orderRepository.LastNum();
        orderList.setOrderNum(num);
        orderRepository.upload(orderList);

    }


}
