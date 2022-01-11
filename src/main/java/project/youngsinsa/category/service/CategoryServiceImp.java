package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;
import project.youngsinsa.category.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{

    private CategoryRepository categoryRepository;
    private CategoryDao categoryDao;

    public CategoryServiceImp(CategoryRepository categoryRepository, CategoryDao categoryDao) {
        this.categoryRepository = categoryRepository;
        this.categoryDao = categoryDao;
    }

    @Override
    public List<Category> showTopList(Category category) {
        return null;
    }

    //top 상품리스트 불러오기
    @Override
    public List<Category> showTopList(){
        CategoryTop ct = new CategoryTop();

        return categoryDao.showList(ct);

    }



}
