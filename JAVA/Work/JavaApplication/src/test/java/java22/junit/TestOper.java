package java22.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    
    private static Oper oPer = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        oPer = new Oper();
    }
    
    @Test
    public void add() {
        Oper op = new Oper(5, 5);
        int add = op.add();
        assertEquals(10, add);
        
    }
    
    @Test
    public void test_minus() {
        Oper op = new Oper(5, 3);
        int minus = op.minus();
        assertNotEquals(3, minus);
        assertEquals(2, minus);
    }
    
    @Test
    public void test_mul() {
        Oper op = new Oper(2,4);
        int mul = op.mul();
        assertEquals(8, mul);
        
    }
    
    @Test
    public void test_div() {
        
    }
    
}
