package project.youngsinsa.member.Service;

import project.youngsinsa.member.Dto.Member;

public interface MemberService {

    public String join(Member member);

    void findId();

    public String login(Member member);


}
