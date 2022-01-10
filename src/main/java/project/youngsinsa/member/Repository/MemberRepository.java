package project.youngsinsa.member.Repository;

import project.youngsinsa.member.domain.Member;

import java.util.List;

public interface MemberRepository {



    void save(Member member);

    void findUser();


    List<Member> login(Member member);

    Member memberUpdate(Member member);
}
