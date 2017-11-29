package springboard;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.service.ServiceUser;

public class TestServiceUser {
    private static ServiceUser service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
       ApplicationContext context = new ClassPathXmlApplicationContext
                ("classpath:ApplicationContext.xml");
        
               service = context.getBean("serviceuser", ServiceUser.class) ;        
                        
    }
    
    @Test
    public void testInsertUser() throws Exception {
        java.util.Date date1 = new java.util.Date(117, 10, 8);
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-27");
        
        ModelUser user = new ModelUser();
        user.setInsertUID("test2");
        user.setUserid("2");
        user.setEmail("kd.kdkd");
        user.setPasswd("222");
        user.setName("tester2");
        user.setMobile("010010000");
        user.setRetireYN(0);
       
        user.setInsertDT(date2);
        
        int rs = service.insertUser(user);
        assertEquals(1, rs);
        
        
        
    }
    
    @Test
    public void testLogin() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserid("1");
        List<ModelUser> rs = service.login(user);
        assertNotNull(rs);        
        
    }
    
  
    @Test
    public void testUpdateUserInfo() throws Exception {
        ModelUser searchValue = new ModelUser();
        searchValue.setUserid("2");
        
        ModelUser updateValue = new ModelUser();
        
        updateValue.setName("tester3");
        updateValue.setEmail("naver");
        updateValue.setMobile("112233");
        
        
        int rs = service.updateUserInfo(searchValue, updateValue);
        assertTrue(rs>=0);
    }
    
    @Test
    public void testUpdatePasswd() throws Exception {
        
      int rs = service.updatePasswd("2", "", "1234"  );
      assertEquals(1, rs);
    }
    
    @Test
    public void testDeleteUser() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserid("1");
        int rs = service.deleteUser(user);
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testSelectUserOne() throws Exception {
       ModelUser user = new ModelUser();
       user.setUserno(8);
       ModelUser rs = service.selectUserOne(user);
       assertNotNull(rs);
    }
    
    @Test
    public void testSelectUserList() throws Exception {
       ModelUser user = new ModelUser();
       user.setName("tester3");
       List<ModelUser> rs = service.selectUserList(user);
       assertNotNull(rs);
    }
    
    @Test
    public void testCheckuserid() throws Exception {
       int rs = service.checkuserid("2");
       
       assertEquals(0, rs);
    }
    
}
