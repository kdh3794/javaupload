
package java02;

import java.util.*;

public class ex02_01_면적구하기 {
   public static void main(String[] args){
       int w;
       int h;           
       int area ;
       int perimeter;
       
       Scanner keyboard = new Scanner(System.in);
      
       System.out.print(" 가로 =    "    );
       w = keyboard.nextInt();
       
       System.out.print(" 세로 =    "    );
       h = keyboard.nextInt();
      
       area = w*h;
       System.out.println("사각형의 넓이 ="  + area);
       
       perimeter = 2*(w+h);
       System.out.println("사각형의 둘레 = " + perimeter);
       
       keyboard.close();
           
       
      
       
   }
    
}
