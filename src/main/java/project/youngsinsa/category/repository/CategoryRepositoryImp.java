package project.youngsinsa.category.repository;


import org.springframework.stereotype.Repository;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CategoryRepositoryImp implements CategoryRepository {

    private final EntityManager em;

    public CategoryRepositoryImp(EntityManager em) {
        this.em = em;
    }



    public List<Category> showList(Category category) {
        return em.createQuery("select c from CategoryTop c order by likeNum desc ")
                .getResultList();

    }

    @Override
    public Category showOne(int modelNum) {
        return (Category) em.createQuery("select c from CategoryTop c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();

    }





}
