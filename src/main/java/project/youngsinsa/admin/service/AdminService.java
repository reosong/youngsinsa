package project.youngsinsa.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.category.domain.Category;

@Service
public interface AdminService {
    //상품업로드
    void insertUpload(Category category, MultipartHttpServletRequest multipartHttpServletRequest);
}
