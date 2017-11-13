package JunitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    private static Oper op = null;// 필드에는 private 붙인다.
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        op = new Oper(2, 4);
    }
    
    @Test
    public void testAdd() {
        int rs = op.add();
        
        // 테스트 코드 작성
        assertEquals(6, rs);
        assertNotEquals(2, rs);
        
        assertTrue(6 == rs);
        assertFalse(2 == rs);
    }
    
    @Test
    public void testMinus() {
        int rs = op.minus();
        assertEquals(-2, rs);
        assertNotEquals(5, rs);
        
        assertTrue(-2 == rs);
        assertFalse(5 == rs);
        
    }
    
    @Test
    public void testMul() {
        int rs = op.mul();
        assertEquals(8, rs);
        assertNotEquals(10, rs);
        
        assertTrue(8 == rs);
        assertFalse(10 == rs);
        
    }
    
    @Test
    public void testDiv() {
        
        double rs = op.div();
        assertEquals(0.5, rs, 0.0);
        assertNotEquals(0.2, rs, 0.0);
        
        assertTrue(0.5 == rs);
        assertFalse(0.2 == rs);
        
    }
    
}
