package JunitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyUnit {
    private static MyUnit myUnit = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        myUnit = new MyUnit();
    }
    
    @Test
    public void testConcate() {
        String rs = myUnit.concate("asd", "123");
        assertEquals("asd123", rs);
        
    }
    
    @Test
    public void testGetBoolean() {
        Boolean rs = myUnit.getBoolean();
        assertFalse(rs);
        
    }
    
    @Test
    public void testGetSameObject() {
        Object rs = myUnit.getSameObject();
        assertSame(null, rs);
        assertNotSame("2", rs);
    }
    
    @Test
    public void testGetObject() {
        Object rs = myUnit.getObject();
        assertNull(rs);
        assertEquals(null, rs);
    }
    
    @Test
    public void testGetStringArray() {
        String[] rs = myUnit.getStringArray();
        String[] as = { "one", "two", "three" };        
        assertNotNull(rs);
        assertArrayEquals(as, rs);
        
    }
    
    @Test(expected = ArithmeticException.class) // expected가 없으면 에러 처리.  exception을 처리해야 하므로 expected 입력.
    public void testGetException() {
        double rs = myUnit.getException();
       
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmptyList() {
        ArrayList<String> list = myUnit.getEmptyList();
        list.get(0);
        
    }
    
}
