package project.youngsinsa.category.Dao;


import org.springframework.stereotype.Component;
import project.youngsinsa.category.domain.Category;

import java.util.List;

@Component
public interface CategoryDao {

    public List<Category> showList(Category category);

}
