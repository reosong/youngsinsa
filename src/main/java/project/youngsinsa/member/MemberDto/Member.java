package project.youngsinsa.member.MemberDto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private String userID;
    private String userPassword;
    private String userName;
    private String email;
    private String address;
    private String phone;
    private int level;

    public Member(String userID, String userPassword, String userName, String email, String address, String phone) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public Member() {

    }


    @Override
    public String toString() {
        return "Member{" +
                "userID='" + userID + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
