package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.domain.Category;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> showTopList(Category category);

    List<Category> showTopList();
}
