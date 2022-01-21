package project.youngsinsa.style.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.style.dao.Style;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StyleRepositoryImp implements StyleRepository{

    private EntityManager em;

    public StyleRepositoryImp(EntityManager em) {
        this.em = em;
    }

    //스타일 가져오기
    @Override
    @Transactional
    public List<Style> getList(){
      List<Style> list =  em.createQuery("select s from Style s ").getResultList();
      return list;
    }

}
