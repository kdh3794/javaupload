package honja;

import java.util.Scanner;

public class single1 {
    public static void main(String[] args){
        int w;
        int h;
        int area;
        int perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("가로를 입력하세요 : ");
        w = sc.nextInt();
        System.out.println("세로를 입력하세요 : ");
        h = sc.nextInt();
        
        area = w*h;
        perimeter = 2*(w+h);
        System.out.println("사각형의 넓이 " + area);
        System.out.println("사각형의 둘레 " + perimeter);
        
            
        
    }
    
}
