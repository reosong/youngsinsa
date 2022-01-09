package project.youngsinsa.member.Dao;

import project.youngsinsa.member.Dto.Member;

import java.util.List;

public interface MemberDao {


     public String findID(String userID);

     List<Member> loginOK(Member member);

     public int memberInsert(Member member) ;

     public int memberIdCheck(String id);



     //정보 업데이트
     Member memberUpdate(Member member);

     public int memberUpdateOk(Member member);

     public int memberDelete(String id, String password);

     public List<Member> memberList() ;

     public String memberFindId(String name, String phone);

     public int checkIdAndEmail(String id, String email) ;

     public int changePassword(String id, String password, String authKey) ;

}
