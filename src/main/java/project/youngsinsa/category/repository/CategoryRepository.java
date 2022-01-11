package project.youngsinsa.category.repository;


import org.springframework.stereotype.Repository;
import project.youngsinsa.category.domain.Category;

import java.util.List;

@Repository
public interface CategoryRepository {


    public List<Category> showList(Category category);

    Category showOne(int modelNum);
}
