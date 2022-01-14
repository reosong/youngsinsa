package project.youngsinsa.member.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.youngsinsa.member.Dao.MemberDao;
import project.youngsinsa.member.Dao.MemberDaoImp;
import project.youngsinsa.member.domain.Member;
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

    //로그인
    @Override
    public String login(Member member ) {

        String userID = member.getUserID();
        String userPassword = member.getUserPassword();
        List<Member> result =  memberRepository.loginOK(member);
        Member m = result.get(0);
        String id = m.getUserID();
        String password = m.getUserPassword();
        if(id.equals(userID)||password.equals(userPassword)) {
            return userID;
        }else{
            return null;
        }
    }

    //회원정보 업데이트
    @Override
    public String memberUpdate(Member member) {
        memberRepository.memberUpdate(member);

        return member.getUserID();
    }

    @Override
    public String findID(String userID) {
        return null;
    }

    //관리자 아이디 찾기
    @Override
    public int findLevel(String userID) {
        return  memberRepository.findLevel(userID);
    }

    @Override
    public int memberInsert(Member member) {
        return 0;
    }

    @Override
    public int memberIdCheck(String id) {
        return 0;
    }


    @Override
    public int memberUpdateOk(Member member) {
        return 0;
    }

    @Override
    public int memberDelete(String id, String password) {
        return 0;
    }

    @Override
    public List<Member> memberList() {
        return null;
    }

    @Override
    public String memberFindId(String name, String phone) {
        return null;
    }

    @Override
    public int checkIdAndEmail(String id, String email) {
        return 0;
    }

    @Override
    public int changePassword(String id, String password, String authKey) {
        return 0;
    }


}
