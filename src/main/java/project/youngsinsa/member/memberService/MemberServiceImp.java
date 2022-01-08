package project.youngsinsa.member.memberService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.youngsinsa.member.MemberDao.MemberDao;
import project.youngsinsa.member.MemberDao.MemberDaoImp;
import project.youngsinsa.member.MemberDto.Member;
import project.youngsinsa.member.memberRepository.MemberRepository;
import project.youngsinsa.member.memberRepository.MyMemberRepository;

import java.util.List;

@Service
public class MemberServiceImp implements MemberService{

    private MemberRepository memberRepository;
    private MemberDao memberDao;

    @Autowired
    public MemberServiceImp(MyMemberRepository MymemberRepository, MemberDaoImp memberDaoImp) {
        this.memberRepository = MymemberRepository;
        this.memberDao = memberDaoImp;
    }


    //회원가입
    @Override
    public String join(Member member) {
        memberRepository.save(member);
      return member.getUserID();
    }

    @Override
    public void findId() {

    }

    @Override
    public String login(Member member ) {

        String userID = member.getUserID();
        String userPassword = member.getUserPassword();
        List<Member> loginMember =  memberDao.loginOK(member);
        Member id = loginMember.get(1);
        Member password = loginMember.get(2);

        return userID;
    }



}
