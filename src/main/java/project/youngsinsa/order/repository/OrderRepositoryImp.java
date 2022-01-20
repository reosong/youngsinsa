package project.youngsinsa.order.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.order.domain.OrderList;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class OrderRepositoryImp implements OrderRepository{


    private final EntityManager em;

    public OrderRepositoryImp(EntityManager em) {
        this.em = em;
    }


    //마지막 주문번호 가져오기
    @Override
    public int LastNum(){
        List<OrderList> list = em.createQuery("select c from OrderList c order by orderNum desc").getResultList();
        int num = list.get(0).getOrderNum();
        return num;
    }

    //주문 업로드
    @Override
    @Transactional
    public void upload(OrderList orderList) {
        em.persist(orderList);
    }


}
