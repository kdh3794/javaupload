package java07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex07_05_유효점수 {
    
    public static void main(String[] args) {
        
        // 배열 생성 및 초기화
        
        int[] arr = { 7, 9, 4, 8, 5 };
        
        // 배열 정렬 전 배열 값 출력
        
        // java.util.Arrays.sort 메소드를 이용하여 정렬
        Arrays.sort(arr);
        
        // 배열 정렬 후 배열값 출력
        
        printArray(arr);
        // 최소값을 출력
        System.out.println("유효점수 : " + arr[1] + " " + arr[2] + " " + arr[3]);
        
        // 최대값을 출력
        int sum = arr[1] + arr[2] + arr[3];
        System.out.println("합계 : " + sum);
        
        double avg = sum / (arr.length - 2);
        System.out.println("평균 : " + avg);
        
    }
    
    private static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i = i + 1) {
            // i=0, arr[0]
            // i=1, arr[1]
            // i=2, arr[2]
            // i=3, arr[3]
            
        }
        
    }
}
