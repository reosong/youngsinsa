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
    @Transactional
    public int LastNum(){
        List<OrderList> list = em.createQuery("select c from OrderList c order by orderNum desc").getResultList();
        int num = list.get(0).getOrderNum();
        return num;
    }

    //주문 업로드
    @Override
    @Transactional
    public void upload(OrderList orderList) {
        List<OrderList> list = em.createQuery("select o from OrderList o order by orderNum desc").getResultList();
        orderList.setOrderNum(list.get(0).getOrderNum()+1);
        em.persist(orderList);
    }

    //주문 가져오기
    @Override
    @Transactional
    public List<OrderList> readOrder(String userID){
        List<OrderList> list = em.createQuery("select o from OrderList o where o.userID =:name")
                .setParameter("name",userID).getResultList();
        return  list;
    }

    //주문 지우기
    @Override
    @Transactional
    public void remove(int orderNum) {
        em.createQuery("delete from OrderList o where o.orderNum = :name")
                .setParameter("name",orderNum);
    }

    //전체 장바구니 보기
    @Override
    public List<OrderList> showAll(){
        List<OrderList> list = em.createQuery("select o from OrderList o ").getResultList();
        return list;
    }
}
