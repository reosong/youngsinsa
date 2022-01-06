package project.youngsinsa.member.memberRepository;


import org.springframework.stereotype.Repository;
import project.youngsinsa.member.MemberDto.Member;

@Repository
public class MyMemberRepository implements MemberRepository {



    @Override
    public void save(Member member) {
        String sql = "insert into ";

    }

    @Override
    public void findUser() {

    }
}
