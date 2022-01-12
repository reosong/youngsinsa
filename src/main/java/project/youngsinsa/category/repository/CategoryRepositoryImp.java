package project.youngsinsa.category.repository;


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




    //카테고리 화면
    public List<Category> showList(Category category) {
        return em.createQuery("select c from CategoryTop c order by likeNum desc ")
                .getResultList();

    }

    //상품 상세페이지
    @Override
    public Category showOne(int modelNum) {
        return (Category) em.createQuery("select c from CategoryTop c where modelNum = : modelNum")
                .setParameter("modelNum", modelNum)
                .getSingleResult();

    }
//
//    @Override
//    public String getDate() {
//        return null;
//    }

    //현재시간 가져오기
//    @Override
//    public String getDate() {
//
//        String date = (String) em.createQuery("select n from now()").getSingleResult();
//        return date;
//    }

    //댓글 쓰기
    @Override
    @Transactional
    public void writeComment(Comment comment){
        em.persist(comment);
    }

    //댓글 마지막 번호 가져오기
    @Override
    @Transactional
    public int LastCommentNum(){
        List<Comment> list = em.createQuery("select c from Comment c order by num desc").getResultList();
        int num = list.get(0).getNum();
        return num;
    }
    //댓글 불러오기
    @Override
    public List<Comment> loadComment(int modelNum) {
        List<Comment> list =  em.createQuery("select c from Comment c where modelNum = :modelNum")
                .setParameter("modelNum",modelNum)
                .getResultList();
        return list;

    }



}
