package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestServiceAuth {
    
    private static ServiceAuth svr = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        svr = new ServiceAuth();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelAuth auth = new ModelAuth();
        int rs = svr.getCount(auth);
        
        // 검증.
        // 인스터스 검증, 값 검증.
        assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxAuthid() throws SQLException {
        ModelAuth auth = new ModelAuth();
        int rs = svr.getMaxAuthid();
        
        assertEquals(7, rs);
        // maxAuthid -> 가장 마지막 authid 물어보는 거.
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        ResultSet rs = svr.selectAll();
        
        // 인스턴스 검증
        assertNotNull(rs);
        
        // 값으로 검증
        // 1. 갯수로 검증.
        ModelAuth auth = new ModelAuth();
        int count = svr.getCount(auth); // rscount == 3
        
        // ResultSet의 갯수 가져오기.
        rs.last(); // 마지막 row로 커서를 이동하시오.
        int countset = rs.getRow(); // 현재 커서의 index
        
        assertEquals(count, countset);
        
        // 2. row 값으로 검증.
        
        rs.first(); // 커서를 첫번째 row로 이동.
        int authid = rs.getInt("authid"); // ==1
        assertEquals(1, authid);
        
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bo");
        
        ResultSet rs = svr.selectLike(auth);
        
        assertNotNull(rs);
        
        rs.next();// 커서가 첫번째로 이동.
        String name = rs.getString("name");
        // assertTrue(name.contains("bo"));
        assertTrue(name.contains(auth.getName()));
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        ResultSet rs = svr.selectEqual(auth);
        assertNotNull(rs);
        rs.next();
        String name = rs.getString("name");
        assertEquals("bob", name);
        
    }
    
    /*
     * rs.next(); String name = rs.getString("name"); // assertEquals("bob", name); assertEquals(auth.getName(),name);
     */
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelAuth auth = new ModelAuth();
        
        auth.setAuthid(null);
        auth.setName("");
        ResultSet rs = svr.selectDynamic(auth);
        assertNotNull(rs);
        
        rs.last();
        int rows = rs.getRow();
        assertEquals(svr.getCount(auth), rows);
        
        auth.setAuthid(1);
        auth.setName("");
        rs = svr.selectDynamic(auth);
        
        assertNotNull(rs);
        
        rs.next();
        int authid = rs.getInt("authid");
        String name = rs.getString("name");
        
        assertEquals(1, authid);
        assertEquals("bob", name);
        
        auth.setAuthid(null);
        auth.setName("park");
        rs = svr.selectDynamic(auth);
        
        assertNotNull(rs);
        
        rs.next();
        rs.first();
        authid = rs.getInt("authid");
        name = rs.getString("name");
        assertEquals(7, authid);
        assertEquals("park", name);
      
        
    }
    
    @Test
    public void testInsertAuth() throws SQLException {
        java.util.Date date1 = new java.util.Date(117, 10, 8);
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08");
        
        ModelAuth auth = new ModelAuth();
        auth.setName("test");
        auth.setBirth("2017-11-08");
        auth.setAuthid(4);
        
        svr = new ServiceAuth();
        int rs = svr.insertAuth(auth);
        
        assertEquals(1, rs);
        
    }
    
    @Test
    public void testUpdateAuth() throws SQLException {
        ModelAuth whereauth = new ModelAuth();
        whereauth.setAuthid(4);
        
        ModelAuth setauth = new ModelAuth();
        setauth.setBirth("2017-11-15");
        setauth.setName("TT");
        
        svr = new ServiceAuth();
        int rs = svr.updateAuth(whereauth, setauth);
        
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testDeleteAuth() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(4);
        
        svr = new ServiceAuth();
        int rs = svr.deleteAuth(auth);
        
        assertTrue(rs >= 0);
        
        auth.setName("TT");
        auth.setBirth("2017-11-15");
        rs = svr.deleteAuth(auth);
        assertTrue(rs >= 0);
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
