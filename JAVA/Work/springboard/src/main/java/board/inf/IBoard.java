package board.inf;

import java.util.List;

import board.model.ModelBoard;

public interface IBoard {
    String getBoardName(String board) throws Exception;
    List<ModelBoard> getBoardOne(String board) throws Exception;
    List<ModelBoard> getBoardList(ModelBoard board) throws Exception;
    int insertBoard(ModelBoard board) throws Exception;
    int updateBoard(ModelBoard boardcd, ModelBoard boardnm, ModelBoard UseYN) throws Exception;
    int deleteBoard(ModelBoard boardcd, ModelBoard boardnm, ModelBoard UseYN) throws Exception;
    int getBoardSearch(ModelBoard boardcd, ModelBoard boardnm) throws Exception;
    int getBoardTotalRecord(ModelBoard boardcd, ModelBoard boardnm) throws Exception;
    List<ModelBoard> getBoardPaging(ModelBoard boardcd, ModelBoard bordnm, String start, int end) throws Exception;
    List<ModelBoard> insertBoardList(ModelBoard board) throws Exception;
    int getArticleTotalRecord(ModelBoard serchWord) throws Exception;
    List<ModelBoard> getArticleList(ModelBoard serchWord, String start, int end) throws Exception;
    int getArticle(ModelBoard board) throws Exception;
    int insertArticle(ModelBoard board) throws Exception;
    int updateArticle(ModelBoard sarchValue) throws Exception;
    
    
    
    
    
}
