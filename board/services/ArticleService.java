package board.services;
import board.domains.ArticleDto;
import board.domains.ReplyDto;
public interface ArticleService {
    public void writeArticle(ArticleDto article);
    public void modifyArticle(ArticleDto article);
    public void removeArticle(ArticleDto article);
    public void writeReply(ReplyDto reply);
    public void removeReply(ReplyDto reply);
    public ArticleDto readArticle(int artId);
    public ReplyDto[] readReply(int artId);
}
