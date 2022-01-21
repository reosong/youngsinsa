package project.youngsinsa.order.service;

import org.springframework.stereotype.Repository;
import project.youngsinsa.order.domain.OrderList;
import project.youngsinsa.order.repository.OrderRepository;
import project.youngsinsa.order.repository.OrderRepositoryImp;

import java.util.List;

@Repository
public class OrderServiceImp implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImp(OrderRepositoryImp orderRepositoryImp) {
        this.orderRepository = orderRepositoryImp;
    }

    //장바구니
    @Override
    public void order(OrderList orderList, String form) {
//        int num = orderRepository.LastNum();
//        orderList.setOrderNum(num);
        orderRepository.upload(orderList);

    }

    //장바구니 목록 보기
    @Override
    public List<OrderList> readOrder(String userID){
        return orderRepository.readOrder(userID);
    }

    //장바구니 지우기
    @Override
    public void removeOrder(int orderNum) {
        orderRepository.remove(orderNum);
    }


    //전체 장바구니 보기
    @Override
    public List<OrderList> showList(){
        return orderRepository.showAll();
    }
}
