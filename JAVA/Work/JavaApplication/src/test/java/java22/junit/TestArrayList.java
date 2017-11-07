package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayList {
    
    private static List<String> elist = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        elist = new ArrayList<String>();
        elist.add("0");
        elist.add("2");
        elist.add("1");
        elist.add("3");
        elist.add("4");
    }
    
    // 문제1. junit을 이용하여 emlist가 null이 아님을 검증하는 테스트 코드를 작성하시오.
    // 테스트 메서드명 : test01
    @Test
    public void test01() {
        assertNotNull(null, elist);
        
    }
    
    // 문제2. junit을 이용하여 emplist의 갯수가 5인지를 검증하는 테스트 코드를 작성하시오.
    // 테스트 메서드 명 : test02
    @Test
    public void test02() {
        assertEquals(5, elist.size());
    }
    
    // 문제3. junit을 이용하여 emplist에 targetID=10이 존재하지 않음을 검증하는 테스트 코드를 작성하시오.
    // 테스트 메서드명 : test03
    @Test
    public void test03() {
        int result = elist.indexOf("10");
        assertEquals(-1, result);
        
        boolean b = elist.contains("10");
        assertEquals(false, b);
        assertFalse(b);
        
    }
    
    // 문제4. junit을 이용하여 두 배열이 같음을 검증하는 테스트 코드를 작성하시오.
    /*
     * String names[] = {"y2kpooh", "hwang"}; String names2[] = {"y2kpooh", "hwang"}; 테스트 메서드 명 : test04
     */
    @Test
    public void test04() {
        String names1[] = {"y2kpooh", "hwang"}; 
        String names2[] = {"y2kpooh", "hwang"};
        assertArrayEquals(names1, names2);
        
    }
}
