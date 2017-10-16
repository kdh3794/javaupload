package java12;

import java.util.Scanner;

public class RectTest {
    public static void main(String[] args){
        Rect myRect = new Rect();
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        myRect.setHeight(a);
        myRect.setWidth(b);
        myRect.printArea();
        myRect.printPerimeter();
        
        
    }
    
}
