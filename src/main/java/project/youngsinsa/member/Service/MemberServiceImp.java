package project.youngsinsa.member.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.youngsinsa.member.Dao.MemberDao;
import project.youngsinsa.member.Dao.MemberDaoImp;
import project.youngsinsa.member.Dto.Member;
import project.youngsinsa.member.Repository.MemberRepository;
import project.youngsinsa.member.Repository.MyMemberRepository;

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
        List<Member> result =  memberDao.loginOK(member);
        Member m = result.get(0);
        String id = m.getUserID();
        String password = m.getUserPassword();
        if(id.equals(userID)||password.equals(userPassword)) {
            return userID;
        }else{
            return null;
        }
    }



}
