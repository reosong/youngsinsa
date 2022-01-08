package project.youngsinsa.member.memberRepository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.member.MemberDto.Member;

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
    public void save(Member member) {
        em.persist(member);

    }

    @Override
    public void findUser() {

    }

    @Override
    public List<Member> login(Member member) {
        return em.createQuery("select m.userID, m.userPassword from Member m where m.name = :name", Member.class)
                .setParameter("name", member.getUserID())
                .getResultList();

    }



//    @Autowired
//    MemberMapper memberMapper;


}
