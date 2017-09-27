package java06;

public class ex06_02_add {
    
    public static void main(String[] args) {
        
        int value = add(4, 7); //value 선언 add()밑에 메소드로 넘어감.
        
        System.out.print(value);
    }
    
    static int add(int a, int b) {
        
        int result = a + b; //위에서 받아온 값 계산
         
        return result; //복귀
        
    }
}
