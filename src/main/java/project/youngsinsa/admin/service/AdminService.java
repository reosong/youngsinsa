package project.youngsinsa.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.CategoryTop;

import javax.servlet.http.HttpServletRequest;

@Service
public interface AdminService {
    //상품업로드
    void insertUpload(CategoryTop category, MultipartHttpServletRequest HttpServletRequest) ;

}
