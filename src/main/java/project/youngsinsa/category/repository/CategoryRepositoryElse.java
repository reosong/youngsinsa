package project.youngsinsa.category.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CategoryRepositoryElse {
    void TopLike(String modelNum, int like);

    //가방 좋아요
    void BagLike(String modelNum, int like);

    //주얼리 좋아요
    @Modifying
    @Transactional
    void JewelryLike(String modelNum, int like);

    //onpiece 좋아요
    @Modifying
    @Transactional
    void OnepieceLike(String modelNum, int like);

    //outer 좋아요
    @Modifying
    @Transactional
    void OuterLike(String modelNum, int like);

    //Pant 좋아요
    @Modifying
    @Transactional
    void PantsLike(String modelNum, int like);

    //Shoew 좋아요
    @Modifying
    @Transactional
    void ShoesLike(String modelNum, int like);

    //Skirt 좋아요
    @Modifying
    @Transactional
    void SkirtLike(String modelNum, int like);

    //Sneakers 좋아요
    @Modifying
    @Transactional
    void SneakersLike(String modelNum, int like);

    //Sunglass 좋아요
    @Modifying
    @Transactional
    void SungalssLike(String modelNum, int like);

    //watch 좋아요
    @Modifying
    @Transactional
    void WatchLike(String modelNum, int like);
}
