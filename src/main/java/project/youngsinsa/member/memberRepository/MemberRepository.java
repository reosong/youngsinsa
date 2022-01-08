package project.youngsinsa.member.memberRepository;

import project.youngsinsa.member.MemberDto.Member;

import java.util.List;

public interface MemberRepository {



    void save(Member member);

    void findUser();


    List<Member> login(Member member);
}
