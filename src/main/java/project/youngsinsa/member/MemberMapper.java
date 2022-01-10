package project.youngsinsa.member;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import project.youngsinsa.member.domain.Member;

public interface MemberMapper {
    @Mapper
    @Component
    public interface UserMapper {



        void saveUser(Member member);
    }
}
