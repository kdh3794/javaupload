package honja;

import java.util.Scanner;

public class RectTest {
    
   public static void main(String[] args){
       Rect rect = new Rect();
       Scanner sc = new Scanner(System.in);
       System.out.print(" 가로를 입력 : " );
       int width = sc.nextInt();
       
       System.out.print(" 세로를 입력 : " );
       int height = sc.nextInt();
       rect.setWidth(width);
       rect.setHeight(height);
       rect.area();
       rect.perimeter();
   }
    
}
