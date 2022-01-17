package project.youngsinsa.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.admin.Dao.ImageUp;
import project.youngsinsa.admin.repository.AdminRepository;
import project.youngsinsa.admin.repository.AdminRepositoryImp;
import project.youngsinsa.category.domain.*;

@Service
public class AdminServiceImp implements AdminService{
    private AdminRepository adminRepository;
    private ImageUp imageUp;

    public AdminServiceImp(AdminRepositoryImp adminRepository, ImageUp imageUp) {

        this.adminRepository = adminRepository;
        this.imageUp = imageUp;
    }




    //상품업로드
    @Override
    public void insertUpload(Category category, MultipartHttpServletRequest HttpServletRequest) {

        try {



            if (category.getForm().equals("top")) {
                CategoryTop ca = (CategoryTop) category;
                adminRepository.insertTOP(ca, HttpServletRequest);
            } else if (category.getForm().equals("pants")) {
                CategoryPants ca = (CategoryPants) category;
                adminRepository.insertPants(ca, HttpServletRequest);
            } else if (category.getForm().equals("outer")) {
                CategoryOuter ca = (CategoryOuter) category;
                adminRepository.insertOuter(ca, HttpServletRequest);
            } else if (category.getForm().equals("onepiece")) {
                CategoryOnepiece ca = (CategoryOnepiece) category;
                adminRepository.insertOnepiece(ca, HttpServletRequest);
            } else if (category.getForm().equals("sunglass")) {
                CategorySunglass ca = (CategorySunglass) category;
                adminRepository.insertSunglass(ca, HttpServletRequest);
            } else if (category.getForm().equals("bag")) {
                CategoryBag ca = (CategoryBag) category;
                adminRepository.insertBag(ca, HttpServletRequest);
            } else if (category.getForm().equals("accessory")) {
                CategoryAccessory ca = (CategoryAccessory) category;
                adminRepository.insertAccessory(ca, HttpServletRequest);
            } else if (category.getForm().equals("watch")) {
                CategoryWatch ca = (CategoryWatch) category;
                adminRepository.insertWatch(ca, HttpServletRequest);
            } else if (category.getForm().equals("jewelry")) {
                CategoryJewelry ca = (CategoryJewelry) category;
                adminRepository.insertJewelry(ca, HttpServletRequest);
            }
        }catch(Exception e){
            e.printStackTrace();
        }


        }



}
