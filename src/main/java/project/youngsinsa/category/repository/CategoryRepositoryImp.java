package project.youngsinsa.category.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.category.domain.Category;
import project.youngsinsa.category.domain.Comment;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CategoryRepositoryImp implements CategoryRepository {

    private final EntityManager em;

    public CategoryRepositoryImp(EntityManager em) {
        this.em = em;
    }



    //상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showOne(String modelNum) {
       Category category= (Category) em.createQuery("select c from CategoryTop c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
       return category;

    }
    //상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showPants(String modelNum) {
        Category category=  (Category) em.createQuery("select c from CategoryPants c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }

    //outer 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showOuter(String modelNum) {
        Category category= (Category) em.createQuery("select c from CategoryOuter c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }
    //Accessory 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showAccessory(String modelNum) {
        Category category=  (Category) em.createQuery("select c from CategoryAccessory c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }

    //Bag 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showBag(String modelNum) {
        Category category=  (Category) em.createQuery("select c from CategoryBag c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }


    //Jewelry 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showJewelry(String modelNum) {
        Category category=  (Category) em.createQuery("select c from CategoryJewelry c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }

    //onpiece 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showOnepiece(String modelNum) {
        Category category= (Category) em.createQuery("select c from CategoryOnepiece c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }
    //shoes 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showShoes(String modelNum) {
        Category category=  (Category) em.createQuery("select c from CategoryShoes c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }

    //skirt 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showSkirt(String modelNum) {
        Category category= (Category) em.createQuery("select c from CategorySkirt c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }
    //sneakers 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showSneakers(String modelNum) {
        Category category=  (Category) em.createQuery("select c from CategorySneakers c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }

    //sunglass 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showSunglass(String modelNum) {
        Category category= (Category) em.createQuery("select c from CategorySunglass c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }
    //whach 상품 상세페이지
    @Override
    @Modifying
    @Transactional
    public Category showWatch(String modelNum) {
        Category category= (Category) em.createQuery("select c from CategoryWatch c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();
        category.setCountNum(category.getCountNum()+1);
        return category;

    }

    //댓글 쓰기
    @Override
    @Transactional
    public void writeComment(Comment comment) {
        em.persist(comment);
    }

    //댓글 마지막 번호 가져오기
    @Override
    @Transactional
    public int LastCommentNum() {
        List<Comment> list = em.createQuery("select c from Comment c order by num desc").getResultList();
        int num = list.get(0).getNum();
        return num;
    }

    //댓글 불러오기
    @Override
    public List<Comment> loadComment(String modelNum) {
        List<Comment> list = em.createQuery("select c from Comment c where modelNum = :modelNum")
                .setParameter("modelNum", modelNum)
                .getResultList();
        return list;

    }












    //카테고리 화면
    @Override
    public List<Category> showList(Category category) {

        if(category.getForm().equals("top")) {
            return em.createQuery("select c from CategoryTop c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("pants")) {
            return em.createQuery("select c from CategoryPants c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("outer")) {
            return em.createQuery("select c from CategoryOuter c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("onepiece")) {
            return em.createQuery("select c from CategoryOnepiece c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("skirt")) {
            return em.createQuery("select c from CategorySkirt c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("sneakers")) {
            return em.createQuery("select c from CategorySneakers c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("shoes")) {
            return em.createQuery("select c from CategoryShoes c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("bag")) {
            return em.createQuery("select c from CategoryBag c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("sunglass")) {
            return em.createQuery("select c from CategorySunglass c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("accessory")) {
            return em.createQuery("select c from CategoryAccessory c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("watch")) {
            return em.createQuery("select c from CategoryWatch c order by likeNum desc ")
                    .getResultList();
        }else if (category.getForm().equals("jewelry")) {
            return em.createQuery("select c from CategoryJewelry c order by likeNum desc ")
                    .getResultList();
        }

        return  null;
    }





//    //카테고리 화면 pants
//    @Override
//    public List<Category> showPantsList(Category category) {
//        return em.createQuery("select c from CategoryPants c order by likeNum desc ")
//                .getResultList();
//
//    }


}
