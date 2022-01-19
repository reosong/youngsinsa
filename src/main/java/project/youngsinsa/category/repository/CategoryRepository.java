package project.youngsinsa.category.repository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryPants;
import project.youngsinsa.category.domain.Comment;
import project.youngsinsa.category.domain.Style;

import java.util.List;

@Repository
public interface CategoryRepository {

    //카테고리 화면
    public List<Category> showList(Category category);




//    List<Category> showPantsList(Category category);

    //상품 상세페이지
    Category showOne(String modelNum);

    //상품 상세페이지
    Category showPants(String modelNum);

    //outer 상품 상세페이지
    Category showOuter(String modelNum);

    //Accessory 상품 상세페이지
    Category showAccessory(String modelNum);

    //Bag 상품 상세페이지
    Category showBag(String modelNum);

    //Jewelry 상품 상세페이지
    Category showJewelry(String modelNum);

    //onpiece 상품 상세페이지
    Category showOnepiece(String modelNum);

    //shoes 상품 상세페이지
    Category showShoes(String modelNum);

    //skirt 상품 상세페이지
    Category showSkirt(String modelNum);

    //sneakers 상품 상세페이지
    Category showSneakers(String modelNum);

    //sunglass 상품 상세페이지
    Category showSunglass(String modelNum);

    //whach 상품 상세페이지
    Category showWatch(String modelNum);

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
