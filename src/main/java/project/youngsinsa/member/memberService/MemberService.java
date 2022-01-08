package project.youngsinsa.member.memberService;

import project.youngsinsa.member.MemberDto.Member;

public interface MemberService {

    public String join(Member member);

    void findId();

    public String login(Member member);


}
