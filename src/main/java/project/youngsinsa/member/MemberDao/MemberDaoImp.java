package project.youngsinsa.member.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project.youngsinsa.member.MemberDto.Member;
import project.youngsinsa.member.memberRepository.MemberRepository;
import project.youngsinsa.member.memberRepository.MyMemberRepository;

import java.util.List;

@Component
public class MemberDaoImp implements MemberDao{


    private MemberRepository memberRepository;

    @Autowired
    public MemberDaoImp(MyMemberRepository MymemberRepository) {
        this.memberRepository = MymemberRepository;
    }




    @Override
    public String findID(String userID) {
        return null;
    }

    @Override
    public List<Member> loginOK(Member member) {
         return memberRepository.login(member);

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
    public Member memberUpdate(String id) {
        return null;
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
