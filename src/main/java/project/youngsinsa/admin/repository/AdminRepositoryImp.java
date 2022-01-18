package project.youngsinsa.admin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.category.domain.*;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Repository
public class AdminRepositoryImp implements AdminRepository{

    private final EntityManager em;

    public AdminRepositoryImp(EntityManager em) {
        this.em = em;
    }


    @Override
    @Transactional
    public void insertTOP(CategoryTop categoryTop, HttpServletRequest HttpServletRequest) {

        List<CategoryTop> categoryTops = em.createQuery("select m from CategoryTop m order by length(modelNum) desc, modelNum desc", CategoryTop.class)
                .getResultList();
        String num = (categoryTops.get(0).getModelNum()).substring(3);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryTop.setModelNum("top"+modelNum);


        em.persist(categoryTop);
    }

    //pants
    @Override
    @Transactional
    public void insertPants(CategoryPants categoryPants, HttpServletRequest HttpServletRequest){
        List<CategoryPants> categoryPants1 = em.createQuery("select m from CategoryPants m order by length(modelNum) desc, modelNum desc", CategoryPants.class)
                .getResultList();
        String num = (categoryPants1.get(0).getModelNum()).substring(5);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryPants.setModelNum("pants"+modelNum);

        em.persist(categoryPants);
    }

    //outer
    @Override
    @Transactional
    public void insertOuter(CategoryOuter categoryOuter, HttpServletRequest HttpServletRequest){
        List<CategoryOuter> category = em.createQuery("select m from CategoryOuter m order by length(modelNum) desc, modelNum desc", CategoryOuter.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(5);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryOuter.setModelNum("outer"+modelNum);
        em.persist(categoryOuter);
    }
    //onepiece
    @Override
    @Transactional
    public void insertOnepiece(CategoryOnepiece categoryOnepiece, HttpServletRequest HttpServletRequest){
        List<CategoryOnepiece> category = em.createQuery("select m from CategoryOnepiece m order by length(modelNum) desc, modelNum desc", CategoryOnepiece.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(8);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryOnepiece.setModelNum("onepiece"+modelNum);
        em.persist(categoryOnepiece);
    }



    //sunglass
    @Override
    @Transactional
    public void insertSunglass(CategorySunglass categorySunglass, HttpServletRequest HttpServletRequest){
        List<CategorySunglass> category = em.createQuery("select m from CategorySunglass m order by length(modelNum) desc, modelNum desc", CategorySunglass.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(8);
        int modelNum = Integer.parseInt(num) +1 ;
        categorySunglass.setModelNum("sunglass"+modelNum);
        em.persist(categorySunglass);
    }



    //bag
    @Override
    @Transactional
    public void insertBag(CategoryBag categoryBag, HttpServletRequest HttpServletRequest){
        List<CategoryBag> category = em.createQuery("select m from CategoryBag m order by length(modelNum) desc, modelNum desc", CategoryBag.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(3);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryBag.setModelNum("bag"+modelNum);
        em.persist(categoryBag);
    }

    //accessory
    @Override
    @Transactional
    public void insertAccessory(CategoryAccessory categoryAccessory, HttpServletRequest HttpServletRequest){
        List<CategoryAccessory> category = em.createQuery("select m from CategoryAccessory m order by length(modelNum) desc, modelNum desc", CategoryAccessory.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(9);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryAccessory.setModelNum("accessory"+modelNum);
        em.persist(categoryAccessory);
    }

    //watch
    @Override
    @Transactional
    public void insertWatch(CategoryWatch categoryWatch, HttpServletRequest HttpServletRequest){
        List<CategoryWatch> category = em.createQuery("select m from CategoryWatch m order by length(modelNum) desc, modelNum desc", CategoryWatch.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(5);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryWatch.setModelNum("watch"+modelNum);
        em.persist(categoryWatch);
    }

    @Override
    @Transactional
    public void insertJewelry(CategoryJewelry categoryJewelry, HttpServletRequest HttpServletRequest){
        List<CategoryJewelry> category = em.createQuery("select m from CategoryJewelry m order by length(modelNum) desc, modelNum desc", CategoryJewelry.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(7);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryJewelry.setModelNum("jewelry"+modelNum);
        em.persist(categoryJewelry);
    }

    @Override
    @Transactional
    public void insertShoes(CategoryShoes categoryShoes, HttpServletRequest HttpServletRequest){
        List<CategoryShoes> category = em.createQuery("select m from CategoryShoes m order by length(modelNum) desc, modelNum desc", CategoryShoes.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(5);
        int modelNum = Integer.parseInt(num) +1 ;
        categoryShoes.setModelNum("shoes"+modelNum);
        em.persist(categoryShoes);
    }

    @Override
    @Transactional
    public void insertSneakers(CategorySneakers categorySneakers, HttpServletRequest HttpServletRequest){
        List<CategorySneakers> category = em.createQuery("select m from CategorySneakers m order by length(modelNum) desc, modelNum desc", CategorySneakers.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(8);
        int modelNum = Integer.parseInt(num) +1 ;
        categorySneakers.setModelNum("sneakers"+modelNum);
        em.persist(categorySneakers);
    }

    @Override
    @Transactional
    public void insertSkirt(CategorySkirt categorySkirt, HttpServletRequest HttpServletRequest){
        List<CategorySkirt> category = em.createQuery("select m from CategorySkirt m order by length(modelNum) desc, modelNum desc", CategorySkirt.class)
                .getResultList();
        String num = (category.get(0).getModelNum()).substring(5);
        int modelNum = Integer.parseInt(num) +1 ;
        categorySkirt.setModelNum("skirt"+modelNum);
        em.persist(categorySkirt);
    }






}
// top  pantsouter onepiece sunglass bag accessory
// skirt sheos sneakers