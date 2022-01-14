package project.youngsinsa.category.repository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.Comment;
import project.youngsinsa.category.domain.Style;

import java.util.List;

@Repository
public interface CategoryRepository {

    //카테고리 화면
    public List<Category> showList(Category category);



    //현재시간 가져오기
//    String getDate();

    //상품 상세페이지
    Category showOne(String modelNum);

    //댓글 쓰기
    void writeComment(Comment comment);

    //댓글 마지막 번호 가져오기
    @Transactional
    int LastCommentNum();

    //댓글 불러오기
    List<Comment> loadComment(String modelNum);

    //스타일 불러오기
//    List<Style> loadStyle();
}
