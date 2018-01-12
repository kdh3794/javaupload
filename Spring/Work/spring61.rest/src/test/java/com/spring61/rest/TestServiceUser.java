package com.spring61.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring61.rest.board.inf.IServiceUser;
import com.spring61.rest.board.model.ModelUser;
import com.spring61.rest.board.service.ServiceUser;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceUser {
    private static IServiceUser service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new  ClassPathXmlApplicationContext
                ("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        
        service = context.getBean("serviceuser", ServiceUser.class);
        
        //DB Table 초기화 코드 
//      javax.sql.DataSource dataSource = (DataSource)context.getBean("dataSource");
//      org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner( dataSource.getConnection() );
//      runner.setAutoCommit(true);
//      runner.setStopOnError(true);
//      
//      ClassLoader cl = ClassLoader.getSystemClassLoader();
//      String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile();
//      
//      java.io.Reader br = new java.io.BufferedReader( new java.io.FileReader(sf) );
//      runner.runScript( br);
//      runner.closeConnection(); }
    }
                            
        
        
        @Test
        public void test01InsertUser() throws Exception {
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
        public void test02Login() throws Exception {
            ModelUser user = new ModelUser();
            user.setUserid("0");
            ModelUser rs = service.login(user);
            assertNotNull(rs);        
            
        }
        
      
        @Test
        public void test03UpdateUserInfo() throws Exception {
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
        public void test04UpdatePasswd() throws Exception {
            
          int rs = service.updatePasswd("2", "", "1234"  );
          assertEquals(1, rs);
        }
        
        @Test
        public void test05DeleteUser() throws Exception {
            ModelUser user = new ModelUser();
            user.setUserid("1");
            int rs = service.deleteUser(user);
            assertTrue(rs >= 0);
        }
        
        @Test
        public void test06SelectUserOne() throws Exception {
           ModelUser user = new ModelUser();
           user.setUserno(2);
           ModelUser rs = service.selectUserOne(user);
           assertNotNull(rs);
        }
        
        @Test
        public void test07SelectUserList() throws Exception {
           ModelUser user = new ModelUser();
           user.setName("tester3");
           List<ModelUser> rs = service.selectUserList(user);
           assertNotNull(rs);
        }
        
        @Test
        public void test08Checkuserid() throws Exception {
           int rs = service.checkuserid("2");
           
           assertEquals(0, rs);
        }
        
    }