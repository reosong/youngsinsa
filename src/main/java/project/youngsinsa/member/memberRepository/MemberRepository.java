package project.youngsinsa.member.memberRepository;

import project.youngsinsa.member.MemberDto.Member;

public interface MemberRepository {



    void save(Member member);

    void findUser();




}
