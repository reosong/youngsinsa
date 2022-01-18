package project.youngsinsa.admin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;
import project.youngsinsa.member.domain.Member;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Repository
public class AdminRepositoryImp implements AdminRepository{

    private final EntityManager em;

    public AdminRepositoryImp(EntityManager em) {
        this.em = em;
    }


    @Override
    @Transactional
    public void insertTOP(CategoryTop categoryTop, HttpServletRequest HttpServletRequest) {

        List<CategoryTop> categoryTops = em.createQuery("select m from CategoryTop m order by length(modelNum) desc, modelNum desc", CategoryTop.class)
                .getResultList();
        String num = (categoryTops.get(0).getModelNum()).substring(3);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryTop.setModelNum("top"+modelNum);
//        categoryTop.setModelNum("top4");

        em.persist(categoryTop);
    }


    @Override
    @Transactional
    public void insertPants(Category category, HttpServletRequest HttpServletRequest){
    em.persist(category);
    }

    @Override
    @Transactional
    public void insertOuter(Category category, HttpServletRequest HttpServletRequest){
        em.persist(category);
    }

    @Override
    @Transactional
    public void insertOnepiece(Category category, HttpServletRequest HttpServletRequest){
        em.persist(category);
    }

    @Override
    @Transactional
    public void insertSunglass(Category category, HttpServletRequest HttpServletRequest){
        em.persist(category);
    }

    @Override
    @Transactional
    public void insertBag(Category category, HttpServletRequest HttpServletRequest){
        em.persist(category);
    }

    @Override
    @Transactional
    public void insertAccessory(Category category, HttpServletRequest HttpServletRequest){
        em.persist(category);
    }

    @Override
    @Transactional
    public void insertWatch(Category category, HttpServletRequest HttpServletRequest){
        em.persist(category);
    }

    @Override
    @Transactional
    public void insertJewelry(Category category, HttpServletRequest HttpServletRequest){
        em.persist(category);
    }


}
