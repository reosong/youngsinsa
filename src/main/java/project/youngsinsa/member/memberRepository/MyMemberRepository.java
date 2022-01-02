package project.youngsinsa.member.memberRepository;

import org.springframework.context.annotation.Bean;



public class MyMemberRepository implements MemberReopository{

    public MyMemberRepository() {
        try {
            String url = "jdbc:mysql://localhost:3306/tesla";
            String id = "root";
            String password = "1234";
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save() {
        String sql = "insert into ";
        try{

        }catch ()

    }

    @Override
    public void findUser() {

    }
}
