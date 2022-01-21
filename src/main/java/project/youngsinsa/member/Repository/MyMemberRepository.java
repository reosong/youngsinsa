package project.youngsinsa.member.Repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.member.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MyMemberRepository implements MemberRepository {


    private final EntityManager em;

    public MyMemberRepository(EntityManager em) {
        this.em = em;
    }


    @Override
    @Transactional
    //회원가입
    public void save(Member member) {
        em.persist(member);

    }

    @Override
    public void findUser() {

    }

    @Override
    public int findLevel(String userID) {
        List<Member> member = em.createQuery("select m from Member m where m.userID = :name", Member.class)
                .setParameter("name", userID)
                .getResultList();

     return member.get(0).getLevel();
    }



    @Override
    //로그인
    public List<Member> loginOK(Member member) {
        return  em.createQuery("select m from Member m where m.userID = :name", Member.class)
                .setParameter("name", member.getUserID())
                .getResultList();

    }


    @Override
    @Modifying
    @Transactional
    //회원정보 업데이트
    public Member memberUpdate(Member member) {
        Member member1 =em.find(Member.class,member.getUserID());
        System.out.println(member.getAddress());
        member1.setAddress(member.getAddress());
        member1.setUserName(member.getUserName());
        member1.setPhone(member.getPhone());
//        em.createQuery("update Member m set m.userName = :name, m.address = :address, m.phone =:phone where m.userID = :userID",Member.class)
//            .setParameter("name", member.getUserName())
//            .setParameter("address",member.getAddress())
//            .setParameter("phone",member.getPhone())
//            .setParameter("userID",member.getUserID());


        return member;
    }
//    @Autowired
//    MemberMapper memberMapper;


}
