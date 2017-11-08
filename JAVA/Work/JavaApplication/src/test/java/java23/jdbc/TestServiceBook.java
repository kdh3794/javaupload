package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestServiceBook {
    private static ServiceBook svr  = null;
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        svr = new ServiceBook();
        
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelBook model = new ModelBook();
        int result = svr.getCount(model);
        assertEquals(4, result);
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        int result = svr.getMaxBookid();
        assertEquals(4, result);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        java.sql.ResultSet rs = svr.selectAll();
        
        rs.next(); // resultset 에서 다음 row로 커서 이동
        int bookid = rs.getInt("bookid");
        assertEquals(1, bookid);
        
        String bookname = rs.getString("bookname");
        assertEquals("operating system", bookname);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("ja");
        
        java.sql.ResultSet rs = svr.selectLike(book);
        
        // resultset을 이용한 검증
        assertNotNull(rs);
        // assertTrue(rs.getRow() >= 1);
        
        // rs.getRow(); <---resultset의 커서가 가르키는 위치.
        
        // 값을 이용한 검증(잘 사용되지는 않는다.)
        rs.next(); // 커서가 첫번째로 row로 이동.
        String name = rs.getString("bookname"); // java
        assertTrue(name.contains("ja"));
        assertTrue(name.contains(book.getBookname()));
    }
    
    @Test
    public void testSelectEqul() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        
        svr = new ServiceBook();
        
        java.sql.ResultSet rs = svr.selectEqual(book);
        
        // 인스턴스 검증
        assertNotNull(rs);
        
        // 값을 이용한 검증(잘 사용되지는 않는다.)
        rs.next(); // 커서가 첫번째로 row로 이동.
        String name = rs.getString("bookname"); // java
        assertEquals("mysql", name);
        assertEquals(book.getBookname(), name);
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelBook book = new ModelBook();
       
        
        // 첫번째 검증. select * from book where 1 = 1
        book.setBookid(null);
        book.setBookname("");
        java.sql.ResultSet rs = svr.selectDynamic(book);
        assertNotNull(rs); // 인스턴스검증        
        // 갯수로 검증
        rs.last();
        int rows = rs.getRow();        
        assertEquals(svr.getCount(book), rows);    
        
        
        // 두번째 검증. select * from book where 1 = 1 and bookid = 1;
        book.setBookid(1);
        book.setBookname("");
        rs = svr.selectDynamic(book);        
        // 인스턴스 검증
        assertNotNull(rs);        
        // 값으로 검증.
        rs.next(); // 커서의 위치를 다음 row로 이동
        int bookid = rs.getInt("bookid");
        String bookname = rs.getString("bookname");
        
        assertEquals(1,                    bookid);
       // assertSame(book.getBookid(), bookid); // getBookid가 integer므로 equals 안됨. same 을 써주어야 함.
        assertEquals("operating system", bookname);
        
        
        // 세번째 검증. select * from book where 1 = 1 and bookname = 'java';
        book.setBookid(null);
        book.setBookname("java");
        rs = svr.selectDynamic(book);
        //인스턴스 검증
        assertNotNull(rs);
        //값으로 검증
        rs.next(); //커서의 위치를 다음 row로 이동.
        rs.first(); // 커서의 위치를 첫번째 row로 이동.
        bookid   = rs.getInt("bookid");
        bookname = rs.getString("bookname");
        assertEquals(3, bookid);
        assertEquals("java", bookname);
        
        // 네번째 검증. select * from book where 1 = 1 and bookid = 2 and bookname = 'mysql';
        book.setBookid(null);
        book.setBookname("mysql");
        rs = svr.selectDynamic(book);
        //인스턴스 검증
        assertNotNull(rs);
        //값으로 검증
        rs.next(); //커서의 위치를 다음 row로 이동.       
        bookid   = rs.getInt("bookid");
        bookname = rs.getString("bookname");
        assertEquals(2, bookid);
        assertEquals("mysql", bookname);
        
        // resultset 사용법
        // rs.next() ; 커서를 현재 row에서 다음 row로 이동.
        // rs.last() ; 마지막 row로 이동
        // rs.first() ; 첫번째 row로 이동
        // rs.getInt("컬럼명");
        // rs.getString("컬럼명");
        // rs.getBoolean("컬럼명");
        // rs.getDate("컬럼명");
        
    }
    
    
    @Test
    public void testInsertBook() throws SQLException {
        java.util.Date date1 = new java.util.Date(117, 10, 8);
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08");
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(3);
        
        svr = new ServiceBook();
        int result = svr.insertBook(book);
        
        // insert 검증
        // 1 리턴되는 경우 : insert 성공
        // 0 리턴되는 경우 : insert 실패
        assertEquals(1, result);
    }
    
    @Test
    public void testUpdateBook() throws SQLException {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test");
        
        ModelBook setbook = new ModelBook();
        setbook.setYear("2016");
        setbook.setPrice(15000);
        
        svr = new ServiceBook();
        int rs = svr.updateBook(wherebook, setbook);
        // update검증 :
        // 1 이상의 값이 리턴되는 경우 update성공
        // 0 값이 리턴되는 경우 update에서는 성공 이나 다름없다
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testDeleteBook() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
        svr = new ServiceBook();
        int rs = svr.deleteBook(book); // rs ==1
        // delete검증 :
        // 1 이상의 값이 리턴되는 경우 delete성공
        // 0 값이 리턴되는 경우 delete에서는 성공 이나 다름없다
        assertTrue(rs >= 0);
        
        book.setBookname("test2");
        rs = svr.deleteBook(book); // rs ==2
        // delete검증 :
        // 1 이상의 값이 리턴되는 경우 delete성공
        // 0 값이 리턴되는 경우 delete에서는 성공이나 다름없다
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testSelectEqual() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testTransCommit() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testTransRollback() {
        fail("Not yet implemented");
    }
    
}
