package di01.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;

import di01.model.Employee;

public class TestEmployee {
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
    
    @Test
    public void test_make_instance_with_new() {
        di01.model.Employee emp1 = new di01.model.Employee();
        emp1.setAddress("emp1 address");
        emp1.setName("emp1 name");
        emp1.setRrn("emp1rrn");
        emp1.setSalary( 10000 );
        assertEquals("emp1 address", emp1.getAddress() );
        
        di01.model.Employee emp2 = new di01.model.Employee("emp2 name", "emp2 address", 10000, "emp2 rrn");
        assertEquals("emp2 address", emp2.getAddress() );
    }
    
    @Test
    public void test_make_instance_with_reflection() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        //reflection을 이용해서 인스턴스 만들기
        Class klass = Class.forName("di01.model.Employee"); //class 로딩
        
        //생성자 메서드의 매개변수 타입 선언.
        Class [] paramTypes = { String.class, String.class  , int.class, String.class };
        
        //매개변수 값 설정.
        Object[] objs = { "emp2 name"       , "emp2 address", 10000        , "emp2 rrn" };
        
        //생성자 메서드 가져오기
        java.lang.reflect.Constructor cons = klass.getConstructor( paramTypes );
        
        //인스턴스 만들기
        Object intance = cons.newInstance( objs );
        
        // 실행해서 결과 출력
        System.out.println( intance.toString() );
        assertEquals("emp2 address", ((di01.model.Employee)intance).getAddress() );
        
        /*
         * setter를 이용하여 필드값 바꾸기
         */
        java.lang.reflect.Method m = klass.getMethod("setName", String.class);
        
        //매개변수 값 설정
        Object [] params = {"hello"};
        
        //메서드 호출
        m.invoke(intance, params); // Employee.setName("hello"); 가 실행
        
        //검증
        assertEquals("hello", ((di01.model.Employee)intance).getName() );
        
        //실행해서 결과 출력
        System.out.println( intance.toString() );
        
        /*
         * getter를 이용하여 필드값 가져오기
         */
        m = klass.getMethod("getName"); //매개변수가 없어서 생략(뒷부분)
        Object result = m.invoke(intance);
        
        //검증
        assertEquals("hello", result);
        
    }
}