package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
    public static void main(String[] args) {
        // 키보드 입력
        
        Scanner sc = new Scanner(System.in);
        // 배열 만들기
        System.out.print("학생수를 입력하시오 : ");
        int A = sc.nextInt();
        int[] array = new int[A];// 정수 입력 받아 배열
        int sum = 0;
        int avg = 0;
        
        // 입력 받아 배열에 저장
        for (int i = 0; i <= array.length - 1; i = i + 1) {
            
            System.out.print("성적을 입력하시오 : "); // 사용자를 위한 텍스트 출력
            array[i] = sc.nextInt(); // 정수 입력 받아 x 공간에 저장.
            
        }
        // 배열 값 출력
        
        for (int i = 0; i <= array.length - 1; i = i + 1) {
            
            sum = sum + array[i]; // sum 함수를 통해서 배열의 값들을 더해줌.
            
            avg = sum / array.length; // sum을 배열의 입력 값만큼 나눈다.
        }
        System.out.println("합계는 : " + sum);
        System.out.println("평균은 : " + avg);
        
    }
}
