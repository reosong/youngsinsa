package project.youngsinsa.category.service;


import org.springframework.stereotype.Service;
import project.youngsinsa.category.Dao.CategoryDao;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.Comment;
import project.youngsinsa.category.repository.CategoryRepository;
import project.youngsinsa.category.repository.CategoryRepositoryElse;
import project.youngsinsa.category.repository.CategoryRepositoryElseImp;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{

    private CategoryRepository categoryRepository;
    private CategoryDao categoryDao;
    private CategoryRepositoryElse categoryRepositoryElse;

    public CategoryServiceImp(CategoryRepository categoryRepository, CategoryDao categoryDao,
                              CategoryRepositoryElseImp categoryRepositoryElse) {
        this.categoryRepository = categoryRepository;
        this.categoryDao = categoryDao;
        this.categoryRepositoryElse =categoryRepositoryElse;
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

    @Override
    public void likeUp(String form, String num){
        if(form.equals("top")){
            int like =categoryRepository.showOne(num).getLikeNum()+1;
            categoryRepositoryElse.TopLike(num,like);
        }else if (form.equals("bag")) {
            int like =categoryRepository.showBag(num).getLikeNum()+1;
            categoryRepositoryElse.BagLike(num,like);
        }else if (form.equals("jewelry")) {
            int like =categoryRepository.showJewelry(num).getLikeNum()+1;
            categoryRepositoryElse.JewelryLike(num,like);
        } else if (form.equals("onepiece")) {
            int like = categoryRepository.showOnepiece(num).getLikeNum()+1;
            categoryRepositoryElse.JewelryLike(num, like);
        }else if (form.equals("outer")) {
            int like = categoryRepository.showOuter(num).getLikeNum()+1;
            categoryRepositoryElse.OuterLike(num, like);
        }else if (form.equals("pants")) {
            int like = categoryRepository.showPants(num).getLikeNum()+1;
            categoryRepositoryElse.PantsLike(num, like);
        }else if (form.equals("shoes")) {
            int like = categoryRepository.showShoes(num).getLikeNum()+1;
            categoryRepositoryElse.ShoesLike(num, like);
        }else if (form.equals("skirt")) {
            int like = categoryRepository.showSkirt(num).getLikeNum()+1;
            categoryRepositoryElse.SkirtLike(num, like);
        }else if (form.equals("sneakers")) {
            int like = categoryRepository.showSneakers(num).getLikeNum()+1;
            categoryRepositoryElse.SneakersLike(num, like);
        }else if (form.equals("sunglass")) {
            int like = categoryRepository.showSunglass(num).getLikeNum()+1;
            categoryRepositoryElse.SungalssLike(num, like);
        }else if (form.equals("watch")) {
            int like = categoryRepository.showWatch(num).getLikeNum()+1;
            categoryRepositoryElse.WatchLike(num, like);
        }



    }















}
