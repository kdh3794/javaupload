package java06;

public class ex06_01_printhello {
    
    public static void main(String[] args) {
        hello(); // 호출
        
    }
    
    public static void hello()/* 위에서 호출 */ {
        System.out.print("Hello, World");
        return; // 위로 돌아감(?)
    }
    
}
