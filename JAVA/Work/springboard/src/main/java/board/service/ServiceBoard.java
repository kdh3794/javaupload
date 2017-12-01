package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.inf.IBoard;
import board.inf.IServiceBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;

@Service("serviceboard")


public class ServiceBoard implements IServiceBoard {

@Autowired
@Qualifier("daoboard")
private IBoard dao;
    
    @Override
    public String getBoardName(String boardcd) throws Exception {
        String result = null;
        try {
            result = dao.getBoardName(boardcd);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        ModelBoard result = null;
        try {
            result = dao.getBoardOne(boardcd);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardList();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int result = -1;
        try {
            result = dao.insertBoard(board);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int updateBoard(ModelBoard searchValue, ModelBoard updateValue)
            throws Exception {
       int result = -1;
       try {
        result = dao.updateBoard(searchValue, updateValue);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }
        return result;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int result = -1;
        try {
            result = dao.deleteBoard(board);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardSearch(board);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int getBoardTotalRecord(String boardcd, String searchWord)
            throws Exception {
        int result = -1;
        try {
            result = dao.getBoardTotalRecord(boardcd, searchWord);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end) throws Exception {
       List<ModelBoard> result = null;
       try {
        result = dao.getBoardPaging(boardcd, searchWord, start, end);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }
        return result;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> list) throws Exception {
        int result = -1;
        try {
            result = dao.insertBoardList(list);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord)
            throws Exception {
        int result = -1;
        try {
            result = dao.getArticleTotalRecord(boardcd, searchWord);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord,
            int start, int end) throws Exception {
        List<ModelArticle> result = null;
        try {
            result = dao.getArticleList(boardcd, searchWord, start, end);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelArticle> getArticle(int articleno) throws Exception {
        List<ModelArticle> result = null;
        try {
            //상세보기를 할때마다 페이지 조회수를 1 증가 시키기 위해서.
            //하단에 목록에서 조회수를 제대로 보기 위해서는
            //목록 레코드를 패치하기 전에 조회수를 먼저 증가시켜야 하낟.
            //사용자 Ip와 시간을 고려해서 조회수를 증가하도록...
                    dao.increaseHit(articleno);
            result = dao.getArticle(articleno);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           // logger.error("getArticle" + e.getMessage());
            
        }
        return result;
    }
    
    @Override
    public int insertArticle(ModelArticle article) throws Exception {
        int result = -1;
        try {
            result = dao.insertArticle(article);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int updateArticle(ModelArticle updateValue, ModelArticle searchValue)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateArticle(updateValue, searchValue);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int deleteArticle(ModelArticle article) throws Exception {
        int result = -1;
        try {
            result = dao.deleteArticle(article);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int increaseHit(int articleno) throws Exception {
        int result = -1;
        try {
            result = dao.increaseHit(articleno);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelArticle> getNextArticle(String boardcd, int articleno,
            String searchWord) throws Exception {
       List<ModelArticle> result = null;
       try {
        result = dao.getNextArticle(boardcd, articleno, searchWord);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }
        return result;
    }
    
    @Override
    public List<ModelArticle> getPrevArticle(String boardcd, int articleno,
            String searchWord) throws Exception {
        List<ModelArticle> result = null;
        try {
            result = dao.getPrevArticle(boardcd, articleno, searchWord);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        return result;
    }
    
    @Override
    public List<ModelAttachFile> getAttachFile(int attachFileNo)
            throws Exception {
      List<ModelAttachFile> result = null;
      try {
        result = dao.getAttachFile(attachFileNo);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }
        return result;
    }
    
    @Override
    public List<ModelAttachFile> getAttachFileList(int articleno)
            throws Exception {
        List<ModelAttachFile> result = null;
        try {
            result = dao.getAttachFileList(articleno);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int insertAttachFile(ModelAttachFile attachfile) throws Exception {
       int result = -1;
       try {
        result = dao.insertAttachFile(attachfile);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }
        return result;
    }
    
    @Override
    public int deleteAttachFile(ModelAttachFile attachfile) throws Exception {
       int result = -1;
       try {
        result = dao.deleteAttachFile(attachfile);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }
        return result;
    }
    
    @Override
    public List<ModelComments> getComment(int commentNo) throws Exception {
        List<ModelComments> result = null;
        try {
            result = dao.getComment(commentNo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleno) throws Exception {
        List<ModelComments> result = null;
        try {
            result = dao.getCommentList(articleno);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }        
        return result;
    }
    
    @Override
    public int insertComment(ModelComments comments) throws Exception {
        int result = -1;
        try {
            result = dao.insertComment(comments);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int updateComment(ModelComments updateValue,
            ModelComments searchValue) throws Exception {
        int result = -1;
        try {
            result = dao.updateComment(updateValue, searchValue);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
    @Override
    public int deleteComment(ModelComments comments) throws Exception {
        int result = -1;
        try {
            result = dao.deleteComment(comments);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        return result;
    }
    
}
