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
        ModelUser whereuser = new ModelUser();
        whereuser.setName("kdh");
        
        ModelUser setuser = new ModelUser();
        setuser.setName("test12");
        int rs = service.updateUserInfo(whereuser, setuser);
        assertTrue(rs>=0);
    }
    
    @Test
    public void testUpdatePasswd() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteUser() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectUserOne() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectUserList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testCheckuserid() {
        fail("Not yet implemented");
    }
    
}
