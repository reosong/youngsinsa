package project.youngsinsa.order.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.order.domain.OrderList;

import java.util.List;

@Repository
public interface OrderRepository {
    //마지막 주문번호 가져오기
    int LastNum();

    //주문 업로드
    @Transactional
    void upload(OrderList orderList);

    //주문 가져오기
    @Transactional
    List<OrderList> readOrder(String userID);

    //주문 지우기
    @Transactional
    void remove(int orderNum);

    //전체 장바구니 보기
    List<OrderList> showAll();
}
