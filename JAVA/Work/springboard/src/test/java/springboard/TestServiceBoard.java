package springboard;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;
import board.service.ServiceBoard;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceBoard {
    private static IServiceBoard service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        
        service = context.getBean("serviceboard", ServiceBoard.class);
        
        // DB Table 초기화 코드
        // javax.sql.DataSource dataSource = (DataSource)context.getBean("dataSource");
        // org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner(
        // dataSource.getConnection() );
        // runner.setAutoCommit(true);
        // runner.setStopOnError(true);
        //
        // ClassLoader cl = ClassLoader.getSystemClassLoader();
        // String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile();
        //
        // java.io.Reader br = new java.io.BufferedReader( new java.io.FileReader(sf) );
        // runner.runScript( br);
        // runner.closeConnection();
    }
    
    @Test
    public void test01GetBoardName() throws Exception {
        String result = null;
        result = service.getBoardName("data");
        assertEquals("자료실11", result);
    }
    
    @Test
    public void test02GetBoardOne() throws Exception {
        ModelBoard result = null;
        result = service.getBoardOne("data");
        assertEquals("자료실", result.getBoardnm());
        assertEquals("data", result.getBoardcd());
        
    }
    
    @Test
    public void test03GetBoardList() throws Exception {
        List<ModelBoard> result = service.getBoardList();
        assertNotNull(result);
        assertEquals(3, result.size());
    }
    
    @Test
    public void test04InsertBoard() throws Exception {
        ModelBoard result = new ModelBoard();
        java.sql.Date date = java.sql.Date.valueOf("2017-11-29");
        
        result.setBoardcd("test1");
        result.setBoardnm("test1 name");
        result.setInsertUID("UID1");
        result.setInsertDT(date);
        result.setUpdateUID("UID1");
        result.setUpdateDT(null);
        
        int rs = service.insertBoard(result);
        assertEquals(1, rs);
    }
    
    @Test
    public void test05UpdateBoard() throws Exception {
        java.sql.Date date = java.sql.Date.valueOf("2017-11-29");
        ModelBoard up = new ModelBoard();
        ModelBoard sc = new ModelBoard();
        
        up.setBoardnm("자료실11");
        up.setUpdateUID("UID11");
        up.setUpdateDT(date);
        sc.setBoardcd("data");
        sc.setBoardnm("자료실");
        
        int rs = service.updateBoard(sc, up);
        assertEquals(1, rs);
    }
    
    @Test
    public void test06DeleteBoard() throws Exception {
        ModelBoard result = new ModelBoard();
        
        result.setBoardcd("data");
        result.setBoardnm("자료실11");
        
        int rs = service.deleteBoard(result);
        assertEquals(1, rs);
    }
    
    @Test
    public void test07GetBoardSearch() throws Exception {
        ModelBoard result = new ModelBoard();
        
        result.setBoardcd("t");
        result.setBoardnm("t");
        
        List<ModelBoard> rs = service.getBoardSearch(result);
        assertNotNull(rs);
        assertEquals(1, rs.size());
        
        ModelBoard re = rs.get(0);
        assertSame(null, re.getUseYN());
        assertEquals("test1 name", re.getBoardnm());
    }
    
    @Test
    public void test08GetBoardTotalRecord() throws Exception {
        int rs = service.getBoardTotalRecord("free", "자유게시판");
        
        assertNotNull(rs);
        assertSame(1, rs);
    }
    
    @Test
    public void test09GetBoardPaging() throws Exception {
        String boardcd = "";
        String searchWord = "";
        int start = 1;
        int end = 3;
        
        List<ModelBoard> result = service.getBoardPaging(boardcd, searchWord,
                start, end);
        assertEquals(result.size(), 3 - 1 + 1);
    }
    
    @Test
    public void test10InsertBoardList() throws Exception {
        int result = -1;
        List<ModelBoard> list = new ArrayList<>();
        ModelBoard board = new ModelBoard();
        
        board = new ModelBoard();
        board.setBoardcd("test3");
        board.setBoardnm("test4 name");
        board.setUseYN(true);
        list.add(board);
        
        result = service.insertBoardList(list);
        assertTrue(result >= 0);
    }
    
    @Test
    public void test11getArticleTotalRecord() throws Exception {
        
        String boardcd = "free";
        String searchWord = "article";
        
        int result = service.getArticleTotalRecord(boardcd, searchWord);
        assertEquals(result, 201);
        
        boardcd = "free";
        searchWord = "";
        
        result = service.getArticleTotalRecord(boardcd, searchWord);
        assertEquals(result, 201);
    }
    
    @Test
    public void testget12ArticleList() throws Exception {
        
        String boardcd = "free";
        String searchWord = "article";
        int start = 2;
        int end = 7;
        
        List<ModelArticle> result = service.getArticleList(boardcd, searchWord,
                start, end);
        assertEquals(6, result.size());
        
        boardcd = "free";
        searchWord = "10";
        start = 2;
        end = 7;
        
        result = service.getArticleList(boardcd, searchWord, start, end);
        assertEquals(12, result.size());
    }
    
    @Test
    public void test13getArticle() throws Exception {
        ModelArticle result = new ModelArticle();
        
        result.setArticleno(5);
        result.setTitle("free");
        
        assertNotNull(result);
        
    }
    
    @Test
    public void test14insertArticle() throws Exception {
        java.sql.Date date1 = java.sql.Date.valueOf("2017-11-30");
        ModelArticle article = new ModelArticle();
        
        article.setTitle("frfrfr");
        article.setContent("fsfsfs");
        article.setEmail("naver");
        article.setRegdate(date1);
        
        int rs = service.insertArticle(article);
        assertEquals(1, rs);
        
    }
    
    @Test
    public void test15updateArticle() throws Exception {
        
    }
    
    @Test
    public void test16deleteArticle() throws Exception {
        
    }
    
    @Test
    public void test17increaseHit() throws Exception {
        
        int rs = service.increaseHit(2);
        assertTrue(rs >= 0);
        
    }
    
    @Test
    public void test18getNextArticle() throws Exception {
        
        List<ModelArticle> result = service.getNextArticle("free", 186, "test");
        
        assertEquals(187, (int) result.get(0).getArticleno());
        
    }
    
    @Test
    public void test19getPrevArticle() throws Exception {
     List<ModelArticle> result = service.getPrevArticle("free", 187, "test");
        
        assertEquals(186, (int) result.get(0).getArticleno());
        
        
    }
    
    @Test
    public void test20getAttachFile() throws Exception {
        ModelAttachFile result = new ModelAttachFile();
        result.setArticleno(2);
        result.setFiletype("파일타입");
        
        assertNotNull(result);       
    }
    
    @Test
    public void test21getAttachFileList() throws Exception {
        
        List<ModelAttachFile> result = service.getAttachFileList(0);
        assertNotNull(result);
        assertEquals(7, result.size());
        
        
    }
    
    @Test
    public void test22insertAttachFile() throws Exception {
        ModelAttachFile result = new ModelAttachFile();
        java.sql.Date date = java.sql.Date.valueOf("2017-12-01");
        
        result.setArticleno(8);
        result.setAttachfileno(2);
        result.setFilename("star");
        result.setFilesize(500);
        result.setFiletype("gif");
        result.setInsertDT(date);
        
        int rs = service.insertAttachFile(result);
        assertEquals(1, rs);
        
        
        
        
    }
    
    @Test
    public void test23deleteAttachFile() throws Exception {
        
      ModelAttachFile result = new ModelAttachFile();
        
        result.setAttachfileno(8);
               
        int rs = service.deleteAttachFile(result);
        assertEquals(1, rs);
        
    }
    
    @Test
    public void test24getComment() {
      ModelComments comment = new ModelComments();
        
        comment.setArticleno(1);
        
        assertNotNull(comment);
        
        
    }
    
    @Test
    public void test25getCommentList() throws Exception {
        List<ModelComments> result = service.getCommentList(1);
        
        assertEquals(1, result.size());
        
    }
    
    @Test
    public void test26insertComment() throws Exception {
        ModelComments result = new ModelComments();
        
        result.setArticleno(2);
        result.setCommentno(3);
        result.setEmail("nate.com");
        
        int rs = service.insertComment(result);
        assertEquals(-1, rs);
        
        
    }
    
    @Test
    public void test27updateComment() throws Exception {
        
    }
    
    @Test
    public void test28deleteComment() throws Exception {
        
    }
}
