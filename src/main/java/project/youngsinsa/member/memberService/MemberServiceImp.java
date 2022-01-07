package project.youngsinsa.member.memberService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import project.youngsinsa.member.MemberDto.Member;
import project.youngsinsa.member.memberRepository.MemberRepository;
import project.youngsinsa.member.memberRepository.MyMemberRepository;

@Service
public class MemberServiceImp implements MemberService{

    private MemberRepository memberRepository;

    @Autowired
    public MemberServiceImp(MyMemberRepository MymemberRepository) {
        this.memberRepository = MymemberRepository;
    }

    @Override
    public Member join(Member member) {

      return memberRepository.save(member);
    }

    @Override
    public void findId() {

    }
}
