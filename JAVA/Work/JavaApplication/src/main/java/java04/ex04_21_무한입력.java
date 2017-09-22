package java04;

import java.util.Scanner;

public class ex04_21_무한입력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        
        for (int i = a; true; i = i + 1) { // 무한루프
            
            System.out.print ("정수를 입력하세요 : ");
            
            a = sc.nextInt();
            
            System.out.println("입력한 값은 " + a + " 입니다");
            
            if (a < 0) {
                break;
            }
        }
        
    }
}
