package project.youngsinsa.order.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.order.domain.OrderList;

@Repository
public interface OrderRepository {
    //마지막 주문번호 가져오기
    int LastNum();

    //주문 업로드
    @Transactional
    void upload(OrderList orderList);
}
