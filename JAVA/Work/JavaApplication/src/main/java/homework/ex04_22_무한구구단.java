package homework;

import java.util.Scanner;

public class ex04_22_무한구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (;;) {
            System.out.print("시작단 : ");
            
            int x = sc.nextInt();
            System.out.print("끝단 : ");
            int y = sc.nextInt();
            if (x > y) {
                int s = y;
                y = x;
                x = s;
            }
            if (x == 0 || y == 0) {
                System.out.println("종료합니다.");
                break;
            }
            for (int i = x; i <= y; i = i + 1) {
                
                for (int j = 1; j <= 9; j = j + 1) {
                    
                    System.out.println(i + "X" + j + "=" + (i * j));
                }
            }
        }
    }
    
}
