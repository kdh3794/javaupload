package JunitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java22.junit.Rect;

public class TestRect {
    private static Rect rc = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    
        
        rc = new Rect(2, 30);
              
    }
    
    @Test
    public void testArea() {
        int rs = rc.area();
        
        assertEquals(60, rs);
        assertNotEquals(50, rs);
        
        assertTrue(60 == rs);
        assertFalse(50 == rs);
    }
    
    @Test
    public void testPerimeter() {
        int rs = rc.perimeter();
        assertEquals(64 , rs);
        assertNotEquals(100, rs);
        
        assertTrue(64 == rs);
        assertFalse(100 == rs);
       
    }
    
}
