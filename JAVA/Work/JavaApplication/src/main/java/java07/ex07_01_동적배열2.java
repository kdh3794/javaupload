package java07;

import java.util.Scanner;

public class ex07_01_동적배열2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("만들고자 하는 배열의 크기를 입력하시오 : ");
        int x = sc.nextInt();
        
        int[] numbers = new int[x];
        
        for (int i = 0; i <= numbers.length - 1; i = i + 1) {
            numbers[i] = i;
            
        }
        for (int j = 0; j <= numbers.length - 1; j = j + 1) {
            numbers[j] = j;
            System.out.print("[" + numbers[j] + "] ");
        }
        
    }
    
}
