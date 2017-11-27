package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.model.ModelAuth;
import java24.mybatis.svr.ServiceAuth;

public class TestServiceAuth {
    private static ServiceAuth service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("classpath:ApplicationContext.xml"                );
        
        service = context.getBean("serviceauth", ServiceAuth.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelAuth auth = new ModelAuth();
        int rs = service.getCount(auth);
        assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxAuthid() throws Exception {
       int rs = service.getMaxAuthid();
       assertEquals(7, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelAuth auth = new ModelAuth();
        List<ModelAuth> rs = service.selectAll(auth);
        //1. 인스턴스 검증
        assertNotNull(rs);
        
        //2. 값으로 검증
        ModelAuth m = rs.get(0);
        assertSame(1, m.getAuthid());
        assertEquals("bob", m.getName());
        
        //3. 갯수로 검증
        int count = service.getCount(null);
        assertEquals(count, rs.size());
        
        
    }
    
    @Test
    public void testSelectLike() throws Exception {
       ModelAuth auth = new ModelAuth();
       auth.setName("%o%");
       List<ModelAuth> rs = service.selectLike(auth);
       
       //인스턴스 검증
       assertNotNull(rs);
       //값으로 검증
       //book = rs.get(0);
       assertEquals("bob", rs.get(0).getName());
       assertEquals(rs.size(), 1);
    }
    
    @Test
    public void testSelectEqual() throws Exception {
       ModelAuth auth = new ModelAuth();
       auth.setName("kim");
       List<ModelAuth> rs = service.selectEqual(auth);
       //인스턴스 검증
       assertNotNull(rs);
       
      //값으로 검증
       assertEquals("kim", rs.get(0).getName());
       assertEquals(rs.size(),1);
       
    }
    
    @Test
    public void testInsertAuth() throws Exception {
        java.util.Date date1 = new java.util.Date(117, 10, 8);
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-23");
        
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(4);
        auth.setBirth("2017-11-23");
        auth.setName("test");
        
        int rs = service.insertAuth(auth);
        assertEquals(4, rs);
        
    }
    
    @Test
    public void testUpdateAuth() throws Exception {
       ModelAuth whereauth = new ModelAuth();
       whereauth.setName("test");
       
       ModelAuth setauth = new ModelAuth();
       
       setauth.setName("ook");
       setauth.setBirth("2017-10-22");
 
       
       int rs = service.updateAuth(whereauth, setauth);
       
       assertTrue(rs >= 0);
    }
    
    @Test
    public void testDeleteAuth() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setName("ook");
        
        int rs = service.deleteAuth(auth);
        
        assertTrue(rs >= 0);
    }
    
}
