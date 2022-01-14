package project.youngsinsa.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.admin.repository.AdminRepository;
import project.youngsinsa.admin.repository.AdminRepositoryImp;
import project.youngsinsa.category.domain.*;

@Service
public class AdminServiceImp implements AdminService{
    private AdminRepository adminRepository;

    public AdminServiceImp(AdminRepositoryImp adminRepository) {
        this.adminRepository = adminRepository;
    }




    //상품업로드
    @Override
    public void insertUpload(Category category, MultipartHttpServletRequest multipartHttpServletRequest) {

        if (category.getForm().equals("top")) {
            CategoryTop ca = (CategoryTop) category;
            adminRepository.insertTOP(ca,multipartHttpServletRequest);
        }
        else if(category.getForm().equals("pants")){
            CategoryPants ca = (CategoryPants) category;
            adminRepository.insertPants(ca,multipartHttpServletRequest);
        }
        else if(category.getForm().equals("outer")){
            CategoryOuter ca = (CategoryOuter) category;
            adminRepository.insertOuter(ca,multipartHttpServletRequest);
        }
        else if(category.getForm().equals("onepiece")){
            CategoryOnepiece ca = (CategoryOnepiece) category;
            adminRepository.insertOnepiece(ca,multipartHttpServletRequest);
        }
        else if(category.getForm().equals("sunglass")){
            CategorySunglass ca = (CategorySunglass) category;
            adminRepository.insertSunglass(ca,multipartHttpServletRequest);
        }
        else if (category.getForm().equals("bag")) {
            CategoryBag ca = (CategoryBag) category;
            adminRepository.insertBag(ca, multipartHttpServletRequest);
        }
        else if (category.getForm().equals("accessory")) {
            CategoryAccessory ca = (CategoryAccessory) category;
            adminRepository.insertAccessory(ca, multipartHttpServletRequest);
        }
        else if (category.getForm().equals("watch")) {
            CategoryWatch ca = (CategoryWatch) category;
            adminRepository.insertWatch(ca, multipartHttpServletRequest);
        }
        else if (category.getForm().equals("jewelry")) {
            CategoryJewelry ca = (CategoryJewelry) category;
            adminRepository.insertJewelry(ca, multipartHttpServletRequest);
        }



    }




}
