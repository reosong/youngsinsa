package project.youngsinsa.admin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.category.domain.*;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

@Repository
public interface AdminRepository {

    public void insertTOP(CategoryTop category, HttpServletRequest HttpServletRequest);

    public void insertPants(CategoryPants categoryPants, HttpServletRequest HttpServletRequest);

    public void insertOuter(CategoryOuter categoryOuter, HttpServletRequest HttpServletRequest);
    public void insertOnepiece(CategoryOnepiece categoryOnepiece, HttpServletRequest HttpServletRequest);
    public void insertSunglass(CategorySunglass categorySunglass, HttpServletRequest HttpServletRequest);
    public void insertBag(CategoryBag categoryBag, HttpServletRequest HttpServletRequest);
    public void insertAccessory(CategoryAccessory categoryAccessory, HttpServletRequest HttpServletRequest);
    public void insertWatch(CategoryWatch categoryWatch, HttpServletRequest HttpServletRequest);
    public void insertJewelry(CategoryJewelry categoryJewelry, HttpServletRequest HttpServletRequest);

    @Transactional
    void insertShoes(CategoryShoes categoryShoes, HttpServletRequest HttpServletRequest);

    @Transactional
    void insertSneakers(CategorySneakers categorySneakers, HttpServletRequest HttpServletRequest);

    @Transactional
    void insertSkirt(CategorySkirt categorySkirt, HttpServletRequest HttpServletRequest);
}
