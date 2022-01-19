package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.Comment;
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
    public List<Category> showList(Category category){


        return categoryRepository.showList(category);

    }

    //상세페이지보기
    @Override
    public Category showOne(String modelNum,String category) {
        if(category=="top") {
            return categoryRepository.showOne(modelNum);
        }else if(category=="pants"){
            return categoryRepository.showPants(modelNum);
        }else if(category=="accessory"){
            return categoryRepository.showAccessory(modelNum);
        }else if(category=="bag"){
            return categoryRepository.showBag(modelNum);
        }else if(category=="onepiece"){
            return categoryRepository.showOnepiece(modelNum);
        }else if(category=="jewelry"){
            return categoryRepository.showJewelry(modelNum);
        }else if(category=="outer"){
            return categoryRepository.showOuter(modelNum);
        }else if(category=="shoes"){
            return categoryRepository.showShoes(modelNum);
        }else if(category=="skirt"){
            return categoryRepository.showSkirt(modelNum);
        }else if(category=="sneakers"){
            return categoryRepository.showSneakers(modelNum);
        }else if(category=="sunglass"){
            return categoryRepository.showSneakers(modelNum);
        }else if(category=="watch"){
            return categoryRepository.showWatch(modelNum);
        }
        return null;
    }


    //if로 나눠서 뿌려주기


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
