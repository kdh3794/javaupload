
package test00;

import java.util.*;

public class tw01_02 {
    
    public static void main(String[] args){ //메인 메소드
       Scanner sc = new Scanner (System.in);
      
       char ch = ' ';
       
       System.out.printf("입력 : ");
       
       String input = sc.nextLine();
       ch = input.charAt(0);
       
       if('0'<= ch && ch <= '9'){
           System.out.printf("숫자입니다.\n" +ch);
                       
           
       }
       if(('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')){
           System.out.printf("문자열입니다.\n" +ch);
       }
             
        
    }
    
}
