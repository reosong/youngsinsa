package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;
import project.youngsinsa.category.domain.Comment;
import project.youngsinsa.category.domain.Style;
import project.youngsinsa.category.repository.CategoryRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{

    private CategoryRepository categoryRepository;
    private CategoryDao categoryDao;

    public CategoryServiceImp(CategoryRepository categoryRepository, CategoryDao categoryDao) {
        this.categoryRepository = categoryRepository;
        this.categoryDao = categoryDao;
    }

    int count =0;
    @Override
    public List<Category> showTopList(Category category) {
        return null;
    }

    //top 상품리스트 불러오기
    @Override
    public List<Category> showTopList(){
        CategoryTop ct = new CategoryTop();

        return categoryRepository.showList(ct);

    }
    //상세페이지보기
    @Override
    public Category showOne(String modelNum) {
        return categoryRepository.showOne(modelNum);
    }


    //댓글쓰기
    @Override
    public Comment writeComment(Comment comment) {
//        String date = categoryRepository.getDate();
//        comment.setDate(date);
        count = categoryRepository.LastCommentNum()+1;
        comment.setNum(count);
        String a= String.valueOf(LocalDateTime.now());
        String date = a.substring(0, 10) +" "+a.substring(11, 19);
        comment.setDate(date);
        categoryRepository.writeComment(comment);
        return comment;
    }

    //스타일 리스트 가져오기
//    @Override
//    public List<Style> loadStyle() {
//        return categoryRepository.loadStyle();
//    }

}
