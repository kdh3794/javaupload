package 강동훈;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int sum = 0;
        
        System.out.print("시작값을 입력하세요.  ");
        x = sc.nextInt();
        System.out.print("종료값을 입력하세요.  ");
        y = sc.nextInt();
        
        if (y < x) {
            int tmp = y;
            y = x;
            x = tmp;
        }
        
        for (int i = x; i <= y; i = i + 1) {
            sum = sum + i;
            if (i < y) {
                System.out.print(i + "+");
            } else if (i == y) {
                System.out.print(y + "=");
            }
        }
        
        System.out.println(sum);
        
    }
    
}
