package project.youngsinsa.category.Dao;


import org.springframework.stereotype.Component;
import project.youngsinsa.category.domain.Category;

import java.util.List;

@Component
public interface CategoryDao {
    //카테고리별 리스트 보여주기 like 정렬
    public List<Category> showList(Category category);
    //각자의 상품 세부 페이지
    public Category showOne(Category category);

    //좋아요 수 올리기
    public void like(Category category);



}
