package project.youngsinsa.category.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.category.domain.*;

import javax.persistence.EntityManager;

@Repository
public class CategoryRepositoryElseImp implements CategoryRepositoryElse{

    private final EntityManager em;

    public CategoryRepositoryElseImp(EntityManager em) {
        this.em = em;
    }

    @Override
    @Modifying
    @Transactional
    public void TopLike(String modelNum, int like){
        CategoryTop ca = em.find(CategoryTop.class, modelNum);
        ca.setLikeNum(like);

    }


    //가방 좋아요
    @Override
    @Modifying
    @Transactional
    public void BagLike(String modelNum, int like){
        CategoryBag ca = em.find(CategoryBag.class, modelNum);
        ca.setLikeNum(like);

    }
    //주얼리 좋아요
    @Override
    @Modifying
    @Transactional
    public void JewelryLike(String modelNum, int like){
        Category ca = em.find(CategoryJewelry.class, modelNum);
        ca.setLikeNum(like);

    }
    //onpiece 좋아요
    @Override
    @Modifying
    @Transactional
    public void OnepieceLike(String modelNum, int like){
        Category ca = em.find(CategoryOnepiece.class, modelNum);
        ca.setLikeNum(like);

    }

    //outer 좋아요
    @Override
    @Modifying
    @Transactional
    public void OuterLike(String modelNum, int like){
        Category ca = em.find(CategoryOuter.class, modelNum);
        ca.setLikeNum(like);

    }

    //Pant 좋아요
    @Override
    @Modifying
    @Transactional
    public void PantsLike(String modelNum, int like){
        Category ca = em.find(CategoryPants.class, modelNum);
        ca.setLikeNum(like);

    }
    //Shoew 좋아요
    @Override
    @Modifying
    @Transactional
    public void ShoesLike(String modelNum, int like){
        Category ca = em.find(CategoryShoes.class, modelNum);
        ca.setLikeNum(like);

    }
    //Skirt 좋아요
    @Override
    @Modifying
    @Transactional
    public void SkirtLike(String modelNum, int like){
        Category ca = em.find(CategorySkirt.class, modelNum);
        ca.setLikeNum(like);

    }
    //Sneakers 좋아요
    @Override
    @Modifying
    @Transactional
    public void SneakersLike(String modelNum, int like){
        Category ca = em.find(CategorySneakers.class, modelNum);
        ca.setLikeNum(like);

    }
    //Sunglass 좋아요
    @Override
    @Modifying
    @Transactional
    public void SungalssLike(String modelNum, int like){
        Category ca = em.find(CategorySunglass.class, modelNum);
        ca.setLikeNum(like);

    }
    //watch 좋아요
    @Override
    @Modifying
    @Transactional
    public void WatchLike(String modelNum, int like){
        Category ca = em.find(CategoryWatch.class, modelNum);
        ca.setLikeNum(like);

    }

}
