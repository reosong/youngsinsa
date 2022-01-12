package project.youngsinsa.member.Repository;

import project.youngsinsa.member.domain.Member;

import java.util.List;

public interface MemberRepository {



    void save(Member member);

    void findUser();




    //로그인
    List<Member> loginOK(Member member);

    Member memberUpdate(Member member);
}
