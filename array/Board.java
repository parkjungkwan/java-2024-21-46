package array;

import java.util.Calendar;

//10시까지
//아래의 필드는 모두 private으로 바꿔서 캡슐화를 진행해주시고
//toString과 equals 메소드를 오버라이드하세요
public class Board {
    private int id;
    private String title;
    private String content;
    private String writer;
    private Calendar writtenDate;
    private Calendar updatedDate;
    
    //getter setter 이클립스 사용해서 자동으로 만들기
    //소스 빈 창에 마우스 오른쪽 클릭 -> 가운데의 source 메뉴 ->
    //-> generate getters/setters 클릭
    //단, 기존의 겟터 셋터가 있을 경우 해당 필드에 대한 겟터 셋터는 나오지 않는다.
    
    
    public int getId() {
        return id;
    }
    public Calendar getWrittenDate() {
        return writtenDate;
    }
    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }
    public Calendar getUpdatedDate() {
        return updatedDate;
    }
    public void setUpdatedDate(Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    
    //toString() 구현
    public String toString() {
        // 객체의 필드값을
        // 출력하는 방법은 다양한다.
        
        // 숙제: JSON 표기법에 대해 알아오시오
        return "id: "+id+
                ", title: "+title+
                ", content: "+content+
                ", writer: "+writer;
    }
    
    

}



















