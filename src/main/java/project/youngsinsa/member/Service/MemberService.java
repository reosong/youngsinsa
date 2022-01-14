package project.youngsinsa.member.Service;

import project.youngsinsa.member.domain.Member;

import java.util.List;

public interface MemberService {

    public String join(Member member);

    void findId();

    public String login(Member member);


    //회원정보 업데이트
    String memberUpdate(Member member);

    String findID(String userID);

    //아이디찾기
    int findLevel(String userID);

    int memberInsert(Member member);

    int memberIdCheck(String id);

    int memberUpdateOk(Member member);

    int memberDelete(String id, String password);

    List<Member> memberList();

    String memberFindId(String name, String phone);

    int checkIdAndEmail(String id, String email);

    int changePassword(String id, String password, String authKey);
}
