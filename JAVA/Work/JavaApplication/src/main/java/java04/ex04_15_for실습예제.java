package java04;

public class ex04_15_for실습예제 {
    public static void main(String[] args){
        
        int sum = 0;
    
        for (int i = 9; 
                        i >= 1; 
                                i=i-1){
            
            sum = i * 2;
            //for문 안에서 출력 : 9번
            
                
            System.out.println(" 2 * " + i + " = " + sum );
          
            }
       
        
        
    }
}
