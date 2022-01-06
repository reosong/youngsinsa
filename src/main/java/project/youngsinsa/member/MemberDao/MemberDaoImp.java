package project.youngsinsa.member.MemberDao;

import project.youngsinsa.member.MemberDto.Member;

import java.util.List;

public class MemberDaoImp implements MemberDao{


    @Override
    public String findID() {
        return null;
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
