package project.youngsinsa.category.Dao;

import org.springframework.stereotype.Component;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.repository.CategoryRepository;

import java.util.List;

@Component
public class CategoryDaoImp implements CategoryDao{

    private CategoryRepository categoryRepository;

    public CategoryDaoImp(CategoryRepository categoryRepositoryImp) {
        this.categoryRepository = categoryRepositoryImp;
    }

    @Override
    public List<Category> showList(Category category) {

        return categoryRepository.showList(category);
    }

    @Override
    public Category showOne(int modelNum) {
        return categoryRepository.showOne(modelNum);
    }

    @Override
    public void like(Category category) {

    }
}
