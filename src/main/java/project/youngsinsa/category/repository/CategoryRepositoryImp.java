package project.youngsinsa.category.repository;


import org.springframework.stereotype.Repository;
import project.youngsinsa.category.domain.Category;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Locale;

@Repository
public class CategoryRepositoryImp implements CategoryRepository {

    private final EntityManager em;

    public CategoryRepositoryImp(EntityManager em) {
        this.em = em;
    }



    public List<Category> showList(Category category) {
        return em.createQuery("select c from Category c order by like desc limit 0,10")
                .getResultList();

    }





}
