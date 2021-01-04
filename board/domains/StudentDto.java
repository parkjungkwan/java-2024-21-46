package board.domains;

public class StudentDto extends MemberDto {

    private String nickName; 
    public StudentDto() {}
    public StudentDto(
        int userId,
        String userName,
        String password,
        String nickname) {
        super.userId = userId;
        super.userName = userName;
        super.password = password;

    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
