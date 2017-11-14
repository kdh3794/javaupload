package JunitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java22.junit.Student;

public class TestStudent {
    
static Student st = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        st = new Student(); // Student 클래스의 인스턴스 생성
        
    }
    
    @Test
    public void test_getgrade() {
        
      /*  st.getgrade(101); // A
        st.getgrade(99);
        st.getgrade(90);
        st.getgrade(89);  // B
        st.getgrade(80);*/
        
        
        assertEquals("A", st.getgrade(101));
        assertEquals("A", st.getgrade(99));
        assertEquals("A", st.getgrade(90));
        
        assertEquals("B", st.getgrade(89));
        assertEquals("B", st.getgrade(80));
        
        assertEquals("C", st.getgrade(79));
        assertEquals("C", st.getgrade(70));
        
        assertEquals("D", st.getgrade(69));
        assertEquals("D", st.getgrade(60));
        
        assertEquals("F", st.getgrade(59));
        assertEquals("F", st.getgrade(50));
    }
    
}
