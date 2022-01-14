package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.Comment;
import project.youngsinsa.category.domain.Style;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> showTopList(Category category);

    List<Category> showTopList();

    Category showOne(String modelNum);

    Comment writeComment(Comment comment);

    //스타일 리스트 가져오기
//    List<Style> loadStyle();
}
