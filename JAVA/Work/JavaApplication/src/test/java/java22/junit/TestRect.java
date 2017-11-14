package java22.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect r = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
        // Rect 클래스의 인스턴스를 만들고 생성자를 이용하여
        // 인스턴스의 필드에 width = 2, height = 30 값을 설정하시오.
        r = new Rect();
        r.setWidth(2);
        r.setHeight(30);
    }
    
    @Test
    public void test_area() {
        // rect 클래스의 인스턴스를 만들고
        // width = 2, height = 30 설정하시오.
        int a = r.area();
        assertEquals(60, a);
        assertNotEquals(80, a);
        
        assertTrue(60 == a);
        assertFalse(80 == a);
         }
    
    @Test
    public void test_perimeter() {
        // Rect 클래스의 인스턴스를 만들고 생성자를 이용하여
        // 인스턴스의 필드에 width = 2, height = 30 값을 설정하시오.
        int p = r.perimeter();
        assertNotEquals(120, p);
        assertEquals(64, p);
    }
    
    @Test
    public void test_assertTrue() {
        // rect 클래스의 인스턴스를 만들고
        // width = 25, height = 30 설정하시오.
        int a = r.area();     
        assertTrue(60 == a);
        
         }
    @Test
    public void test_assertFalse() {
        // rect 클래스의 인스턴스를 만들고
        // width = 25, height = 30 설정하시오.
        int a = r.area(); 
        assertFalse(80 == a);
         }
    
    @Test
    public void test_type(){
        Rect o = r.type();
        
        assertNull( o );
    }
    
    
}
