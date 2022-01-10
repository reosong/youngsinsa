package project.youngsinsa.member.Service;

import project.youngsinsa.member.domain.Member;

public interface MemberService {

    public String join(Member member);

    void findId();

    public String login(Member member);


    //회원정보 업데이트
    String memberUpdate(Member member);
}
