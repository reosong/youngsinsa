package project.youngsinsa.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import project.youngsinsa.admin.Dao.ImageUp;
import project.youngsinsa.admin.repository.AdminRepository;
import project.youngsinsa.admin.repository.AdminRepositoryImp;
import project.youngsinsa.category.domain.*;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService{
    private AdminRepository adminRepository;

    @Autowired
    private ImageUp imageUp;


    public AdminServiceImp(AdminRepositoryImp adminRepository, ImageUp imageUp) {

        this.adminRepository = adminRepository;
        this.imageUp = imageUp;
    }




    //상품업로드
    @Override
    public void insertUpload(Category category, MultipartHttpServletRequest HttpServletRequest) {

        //top
            if (category.getForm().equals("top")) {
                  CategoryTop categoryTop = new CategoryTop();

                  categoryTop.setForm(category.getForm());
                  categoryTop.setModelName(category.getModelName());
                  categoryTop.setModelBrand(category.getModelBrand());
                  categoryTop.setPrice(category.getPrice());
                  categoryTop.setSeason(category.getSeason());
                  categoryTop.setSex(category.getSex());
                try {//주소값 잘라서 넣어주기
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categoryTop.setPhoto1(list.get(0).substring(25));
                    categoryTop.setPhoto2(list.get(1).substring(25));
                    categoryTop.setPhoto3(list.get(2).substring(25));
                    categoryTop.setPhoto4(list.get(3).substring(25));
                    categoryTop.setPhoto5(list.get(4).substring(25));
                    categoryTop.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                    adminRepository.insertTOP(categoryTop, HttpServletRequest);

            //pants
            } else if (category.getForm().equals("pants")) {
                CategoryPants categoryPants = new CategoryPants();

                categoryPants.setForm(category.getForm());
                categoryPants.setModelName(category.getModelName());
                categoryPants.setModelBrand(category.getModelBrand());
                categoryPants.setPrice(category.getPrice());
                categoryPants.setSeason(category.getSeason());
                categoryPants.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categoryPants.setPhoto1(list.get(0).substring(25));
                    categoryPants.setPhoto2(list.get(1).substring(25));
                    categoryPants.setPhoto3(list.get(2).substring(25));
                    categoryPants.setPhoto4(list.get(3).substring(25));
                    categoryPants.setPhoto5(list.get(4).substring(25));
                    categoryPants.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }

                adminRepository.insertPants(categoryPants, HttpServletRequest);

           //outer
            } else if (category.getForm().equals("outer")) {
                CategoryOuter categoryOuter = new CategoryOuter();

                categoryOuter.setForm(category.getForm());
                categoryOuter.setModelName(category.getModelName());
                categoryOuter.setModelBrand(category.getModelBrand());
                categoryOuter.setPrice(category.getPrice());
                categoryOuter.setSeason(category.getSeason());
                categoryOuter.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categoryOuter.setPhoto1(list.get(0).substring(25));
                    categoryOuter.setPhoto2(list.get(1).substring(25));
                    categoryOuter.setPhoto3(list.get(2).substring(25));
                    categoryOuter.setPhoto4(list.get(3).substring(25));
                    categoryOuter.setPhoto5(list.get(4).substring(25));
                    categoryOuter.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }

                adminRepository.insertOuter(categoryOuter, HttpServletRequest);


            //categoryOnepiece
            } else if (category.getForm().equals("onepiece")) {
                CategoryOnepiece categoryOnepiece = new CategoryOnepiece();

                categoryOnepiece.setForm(category.getForm());
                categoryOnepiece.setModelName(category.getModelName());
                categoryOnepiece.setModelBrand(category.getModelBrand());
                categoryOnepiece.setPrice(category.getPrice());
                categoryOnepiece.setSeason(category.getSeason());
                categoryOnepiece.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categoryOnepiece.setPhoto1(list.get(0).substring(25));
                    categoryOnepiece.setPhoto2(list.get(1).substring(25));
                    categoryOnepiece.setPhoto3(list.get(2).substring(25));
                    categoryOnepiece.setPhoto4(list.get(3).substring(25));
                    categoryOnepiece.setPhoto5(list.get(4).substring(25));
                    categoryOnepiece.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertOnepiece(categoryOnepiece, HttpServletRequest);



                //categorySunglass
            } else if (category.getForm().equals("sunglass")) {
                CategorySunglass categorySunglass = new CategorySunglass();

                categorySunglass.setForm(category.getForm());
                categorySunglass.setModelName(category.getModelName());
                categorySunglass.setModelBrand(category.getModelBrand());
                categorySunglass.setPrice(category.getPrice());
                categorySunglass.setSeason(category.getSeason());
                categorySunglass.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categorySunglass.setPhoto1(list.get(0).substring(25));
                    categorySunglass.setPhoto2(list.get(1).substring(25));
                    categorySunglass.setPhoto3(list.get(2).substring(25));
                    categorySunglass.setPhoto4(list.get(3).substring(25));
                    categorySunglass.setPhoto5(list.get(4).substring(25));
                    categorySunglass.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertSunglass(categorySunglass, HttpServletRequest);

            //categoryBag
            } else if (category.getForm().equals("bag")) {
                CategoryBag categoryBag = new CategoryBag();

                categoryBag.setForm(category.getForm());
                categoryBag.setModelName(category.getModelName());
                categoryBag.setModelBrand(category.getModelBrand());
                categoryBag.setPrice(category.getPrice());
                categoryBag.setSeason(category.getSeason());
                categoryBag.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categoryBag.setPhoto1(list.get(0).substring(25));
                    categoryBag.setPhoto2(list.get(1).substring(25));
                    categoryBag.setPhoto3(list.get(2).substring(25));
                    categoryBag.setPhoto4(list.get(3).substring(25));
                    categoryBag.setPhoto5(list.get(4).substring(25));
                    categoryBag.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertBag(categoryBag, HttpServletRequest);

            //categoryAccessory
            } else if (category.getForm().equals("accessory")) {
                CategoryAccessory categoryAccessory = new CategoryAccessory();

                categoryAccessory.setForm(category.getForm());
                categoryAccessory.setModelName(category.getModelName());
                categoryAccessory.setModelBrand(category.getModelBrand());
                categoryAccessory.setPrice(category.getPrice());
                categoryAccessory.setSeason(category.getSeason());
                categoryAccessory.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categoryAccessory.setPhoto1(list.get(0).substring(25));
                    categoryAccessory.setPhoto2(list.get(1).substring(25));
                    categoryAccessory.setPhoto3(list.get(2).substring(25));
                    categoryAccessory.setPhoto4(list.get(3).substring(25));
                    categoryAccessory.setPhoto5(list.get(4).substring(25));
                    categoryAccessory.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertAccessory(categoryAccessory, HttpServletRequest);


            //Watch
            } else if (category.getForm().equals("watch")) {
                CategoryWatch categoryWatch = new CategoryWatch();

                categoryWatch.setForm(category.getForm());
                categoryWatch.setModelName(category.getModelName());
                categoryWatch.setModelBrand(category.getModelBrand());
                categoryWatch.setPrice(category.getPrice());
                categoryWatch.setSeason(category.getSeason());
                categoryWatch.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);
                    categoryWatch.setPhoto1(list.get(0).substring(25));
                    categoryWatch.setPhoto2(list.get(1).substring(25));
                    categoryWatch.setPhoto3(list.get(2).substring(25));
                    categoryWatch.setPhoto4(list.get(3).substring(25));
                    categoryWatch.setPhoto5(list.get(4).substring(25));
                    categoryWatch.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertWatch(categoryWatch, HttpServletRequest);

            //categorySkirt
            } else if (category.getForm().equals("skirt")) {
                CategorySkirt categorySkirt = new CategorySkirt();

                categorySkirt.setForm(category.getForm());
                categorySkirt.setModelName(category.getModelName());
                categorySkirt.setModelBrand(category.getModelBrand());
                categorySkirt.setPrice(category.getPrice());
                categorySkirt.setSeason(category.getSeason());
                categorySkirt.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);

                    categorySkirt.setPhoto1(list.get(0).substring(25));
                    categorySkirt.setPhoto2(list.get(1).substring(25));
                    categorySkirt.setPhoto3(list.get(2).substring(25));
                    categorySkirt.setPhoto4(list.get(3).substring(25));
                    categorySkirt.setPhoto5(list.get(4).substring(25));
                    categorySkirt.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertSkirt(categorySkirt, HttpServletRequest);


            }else if (category.getForm().equals("jewelry")) {
                CategoryJewelry categoryJewelry = new CategoryJewelry();

                categoryJewelry.setForm(category.getForm());
                categoryJewelry.setModelName(category.getModelName());
                categoryJewelry.setModelBrand(category.getModelBrand());
                categoryJewelry.setPrice(category.getPrice());
                categoryJewelry.setSeason(category.getSeason());
                categoryJewelry.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);

                    categoryJewelry.setPhoto1(list.get(0).substring(25));
                    categoryJewelry.setPhoto2(list.get(1).substring(25));
                    categoryJewelry.setPhoto3(list.get(2).substring(25));
                    categoryJewelry.setPhoto4(list.get(3).substring(25));
                    categoryJewelry.setPhoto5(list.get(4).substring(25));
                    categoryJewelry.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertJewelry(categoryJewelry, HttpServletRequest);


            }else if (category.getForm().equals("shoes")) {
                CategoryShoes categoryShoes = new CategoryShoes();

                categoryShoes.setForm(category.getForm());
                categoryShoes.setModelName(category.getModelName());
                categoryShoes.setModelBrand(category.getModelBrand());
                categoryShoes.setPrice(category.getPrice());
                categoryShoes.setSeason(category.getSeason());
                categoryShoes.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);

                    categoryShoes.setPhoto1(list.get(0).substring(25));
                    categoryShoes.setPhoto2(list.get(1).substring(25));
                    categoryShoes.setPhoto3(list.get(2).substring(25));
                    categoryShoes.setPhoto4(list.get(3).substring(25));
                    categoryShoes.setPhoto5(list.get(4).substring(25));
                    categoryShoes.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertShoes(categoryShoes, HttpServletRequest);


            }else if (category.getForm().equals("sneakers")) {
                CategorySneakers categorySneakers = new CategorySneakers();

                categorySneakers.setForm(category.getForm());
                categorySneakers.setModelName(category.getModelName());
                categorySneakers.setModelBrand(category.getModelBrand());
                categorySneakers.setPrice(category.getPrice());
                categorySneakers.setSeason(category.getSeason());
                categorySneakers.setSex(category.getSex());

                try {
                    List<String> list = imageUp.parseFileInfo(1,HttpServletRequest);

                    categorySneakers.setPhoto1(list.get(0).substring(25));
                    categorySneakers.setPhoto2(list.get(1).substring(25));
                    categorySneakers.setPhoto3(list.get(2).substring(25));
                    categorySneakers.setPhoto4(list.get(3).substring(25));
                    categorySneakers.setPhoto5(list.get(4).substring(25));
                    categorySneakers.setPhoto6(list.get(5).substring(25));

                }catch (Exception e){
                    e.printStackTrace();
                }
                adminRepository.insertSneakers(categorySneakers, HttpServletRequest);


            }


        }
    }
