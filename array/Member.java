package array;

// 게시판 관리등에서 
// 로그인하는 회원을 담당할 Member 클래스
public class Member {
    //필드
    private int id; //회원 번호
    private String userName; //로그인 id
    private String password; //로그인 비밀번호
    private String nickName; //게시판에서 보여지는 닉네임
    
    //getters/setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    //java.lang.Object 메소드 오버라이드
    public boolean equals(Object o) {
        if(o instanceof Member) {
            Member m = (Member)o;
            if(userName.equals(m.userName) && password.equals(m.password)) {
                return true;
            }
        }
        
        return false;
    }
    
    public String toString() {
        return "id: "+id+
                ", userName: "+userName+
                ", password: "+password+
                ", nickName: "+nickName;
    }
    
    // 생성자
    public Member() {
        userName = new String();
        password = new String();
        nickName = new String();
    }
    
    public Member(int id, String userName, String password, String nickName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
    }
}























