package board.domains;

import java.util.Calendar;

public class ArticleDto {
    private int artId;
    private int writerId;
    private String title;
    private String content;
    private Calendar writtenDate;
    private Calendar updatedDate;

    public ArticleDto(){}
    public ArticleDto(int writerId,String title,String content){
        this.writerId = writerId;
        this.title = title;
        this.content = content;
    }

    public int getArtId() {
        return artId;
    }
    public void setArtId(int artId) {
        this.artId = artId;
    }
    public int getWriterId() {
        return writerId;
    }
    public void setWriterId(int writerId) {
        this.writerId = writerId;
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
}




















