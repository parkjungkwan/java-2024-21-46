package board.domains;

// 게시판 관리등에서 
// 로그인하는 회원을 담당할 Member 클래스
public class MemberDto {
    //필드
    protected int userId; 
    protected String userName, password; 
    
    //getters/setters
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
   
}























