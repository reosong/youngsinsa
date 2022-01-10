package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService{

    private CategoryRepository categoryRepository;
    private CategoryDao categoryDao;

    public CategoryServiceImp(CategoryRepository categoryRepository, CategoryDao categoryDao) {
        this.categoryRepository = categoryRepository;
        this.categoryDao = categoryDao;
    }
}
