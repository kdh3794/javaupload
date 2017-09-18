package java03;

import java.util.Scanner;
public class ex03_01_LargeSmall {
    
    public static void main(String[] args){
        int n; //변수 선언,
        
        System.out.print("Grade : "  ); //grade 출력 and 입력
        
        Scanner sc = new Scanner(System.in);   
        n = sc.nextInt(); //변수에 입력
        
        if ( n >= 100) {
            
            System.out.println("large." ); //n >= 100 large출력
                                    
        }
       
       
        else {
            System.out.println("small.");
            
        }
    }
    
}
