package project.youngsinsa.admin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.category.domain.Category;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

@Repository
public interface AdminRepository {

    public void insertTOP(Category category, HttpServletRequest HttpServletRequest);

    public void insertPants(Category category,HttpServletRequest HttpServletRequest);

    public void insertOuter(Category category, HttpServletRequest HttpServletRequest);
    public void insertOnepiece(Category category, HttpServletRequest HttpServletRequest);
    public void insertSunglass(Category category, HttpServletRequest HttpServletRequest);
    public void insertBag(Category category, HttpServletRequest HttpServletRequest);
    public void insertAccessory(Category category, HttpServletRequest HttpServletRequest);
    public void insertWatch(Category category, HttpServletRequest HttpServletRequest);
    public void insertJewelry(Category category, HttpServletRequest HttpServletRequest);

}
