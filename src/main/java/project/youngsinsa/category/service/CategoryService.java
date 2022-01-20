package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.Comment;
import project.youngsinsa.category.domain.Style;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> showTopList(Category category);

    List<Category> showList(Category category);

    //pants 상품리스트 불러오기
//    List<Category> showPantsList();

    Category showOne(String modelNum,String category);


    Comment writeComment(Comment comment);

    void likeUp(String form, String num);

    //스타일 리스트 가져오기
//    List<Style> loadStyle();
}
