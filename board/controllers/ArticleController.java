package board.controllers;
import board.domains.ArticleDto;
import board.domains.ReplyDto;
import board.services.ArticleService;
import board.impls.ArticleServiceImpl;
public class ArticleController {
    private ArticleService articleService;
    public ArticleController(){
        articleService = new ArticleServiceImpl();
    }
    public void postArticle(ArticleDto article){
        articleService.writeArticle(article);
    }
    public void updateArticle(ArticleDto article){
        articleService.modifyArticle(article);
    }
    public void deleteArticle(ArticleDto article){
        articleService.removeArticle(article);
    }
    public void postReply(ReplyDto reply){
        articleService.writeReply(reply);
    }
    public void deleteReply(ReplyDto reply){
        articleService.removeReply(reply);
    }
    public ArticleDto getArticle(int artId){
        return articleService.readArticle(artId);
    }
    public ReplyDto[] getReply(int artId){
        return articleService.readReply(artId);
    }
    
}



















