package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 : ");
        
        int A = sc.nextInt();
        
        int[] numbers = new int[A];
        
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j;
            
        }
        
        for (int j = 0; j < numbers.length; j++) {
            System.out.print("숫자를 입력하시오 : ");
            int i = sc.nextInt();
            
        }
        for (int j = 0; j < numbers.length; j++) {
            
            int i = sc.nextInt();
            System.out.print("배열의 값은 " + numbers[i]);
            return;
        }
    }
}
