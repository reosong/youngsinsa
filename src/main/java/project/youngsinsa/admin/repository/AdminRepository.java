package project.youngsinsa.admin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.category.domain.Category;

import javax.persistence.EntityManager;

@Repository
public interface AdminRepository {

    public void insertTOP(Category category, MultipartHttpServletRequest multipartHttpServletRequest);

    public void insertPants(Category category,MultipartHttpServletRequest multipartHttpServletRequest);

    public void insertOuter(Category category,MultipartHttpServletRequest multipartHttpServletRequest);
    public void insertOnepiece(Category category,MultipartHttpServletRequest multipartHttpServletRequest);
    public void insertSunglass(Category category,MultipartHttpServletRequest multipartHttpServletRequest);
    public void insertBag(Category category,MultipartHttpServletRequest multipartHttpServletRequest);
    public void insertAccessory(Category category,MultipartHttpServletRequest multipartHttpServletRequest);
    public void insertWatch(Category category,MultipartHttpServletRequest multipartHttpServletRequest);
    public void insertJewelry(Category category,MultipartHttpServletRequest multipartHttpServletRequest);

}
