package project.youngsinsa.member.memberRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.member.MemberDto.Member;
import project.youngsinsa.member.MemberMapper;

import javax.persistence.EntityManager;

@Repository
public class MyMemberRepository implements MemberRepository {


    private final EntityManager em;

    public MyMemberRepository(EntityManager em) {
        this.em = em;
    }


    @Override
    @Transactional
    public Member save(Member member) {
        em.persist(member);


        return member;
    }

    @Override
    public void findUser() {

    }
//    @Autowired
//    MemberMapper memberMapper;


}
