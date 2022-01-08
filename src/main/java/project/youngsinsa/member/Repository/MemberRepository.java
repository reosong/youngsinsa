package project.youngsinsa.member.Repository;

import project.youngsinsa.member.Dto.Member;

import java.util.List;

public interface MemberRepository {



    void save(Member member);

    void findUser();


    List<Member> login(Member member);
}
