package 강동훈;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int a;
        
        for (;;) {
            System.out.print(" 시작단 : ");
            x = sc.nextInt();
            System.out.print(" 종료단 : ");
            y = sc.nextInt();
            
            if (y < x) {
                int tmp = y;
                y = x;
                x = tmp;
            }
            
            if (x == 0 || y == 0) {
                System.out.print(" 종료");
                break;
            }
            int sum = sum2(x, y);
        }
        
    }
    
    private static int sum2(int x, int y) {
        int a = 0;
        for (int i = x; i <= y; i = i + 1) {
            
            for (int j = 1; j <= 9; j = j + 1) {
                a = i * j;
                System.out.println(i + " * " + j + " = " + a);
            }
            System.out.println();
        }
        
        return a;
    }
}
