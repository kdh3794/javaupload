package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;
import java24.mybatis.svr.ServiceBook;

public class TestServiceBook {
    private static IServiceBook service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        
        service = context.getBean("servicebook", ServiceBook.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.getCount(book);
        assertEquals(4, rs);
    }
    
    @Test
    public void testGetMaxBookid() throws Exception {
        
        int rs = service.getMaxBookid();
        assertEquals(4, rs);
        
    }
    
    @Test
    public void testSelectAll() throws Exception {
        
        ModelBook book = new ModelBook();
        List<ModelBook> rs = service.selectAll(book);
        // 1. 인스턴스 검증
        assertNotNull(rs);
        
        // 2. 값으로 검증.
        ModelBook m = rs.get(0);
        assertSame(1, m.getBookid());
        assertEquals("operating system", m.getBookname());
        
        // 3.갯수로 검증
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("%ja%"); // java 한줄만 출력.
        List<ModelBook> rs = service.selectLike(book);
        
        // 인스턴스 검증
        assertNotNull(rs);
        // 값으로 검증
        // book = rs.get(0);
        assertEquals("java", rs.get(0).getBookname());
        assertEquals(rs.size(), 1);
        // 갯수로 검증.
        
        
        /*  강사님꺼
             */
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        
        List<ModelBook> rs = service.selectEqual(book);
        
        // 인스턴스 검증
        assertNotNull(rs);
        
        // 값으로 검증
        assertEquals("mysql", rs.get(0).getBookname());
        assertEquals(rs.size(), 1);
    }
    
    @Test
    public void testInsertbook() throws Exception {
        java.util.Date date1 = new java.util.Date(117, 10, 8);
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-22");
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(3);
        
        int rs = service.insertbook(book);
        assertEquals(9, rs);
        
    }
    
    @Test
    public void testInsertMap() throws Exception {      
        
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-22");
        
       int rs = service.insertMap("test2", date2, 4);
        
    }
    
    @Test
    public void testUpdateBook() throws Exception {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test");
        
        ModelBook setbook = new ModelBook();
        
        setbook.setBookname("test");
        setbook.setYear("2016");
        setbook.setPrice(15000);
        setbook.setPublisher("abb");
        

        
        int rs = service.updateBook(wherebook, setbook);
     
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testDeleteBook() throws Exception {
        ModelBook book = new ModelBook();
    
        book.setBookname("test");
        
        int rs = service.deleteBook(book); // rs ==1
        
        assertTrue(rs >= 0);
        
     
        
      
    }
    
    @Test
    public void testSelectDynamic() {
        fail("Not yet implemented");
    }
    
}
