package honja;

import java.util.Arrays;
import java.util.Scanner;

public class youngkyu {
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        System.out.print("배열을 입력하세요 : ");
        String a = key.next();
        
        String[] temp = a.split(" "); // 문자열 자르기
        
        // 문자열 배열을 정수 배열로 만듬.
        int[] std = new int[temp.length];
        
        for (int i = 0; i <= temp.length-1; i = i + 1) {
            // 문자열 배열에서 값을 꺼내서
            String s = temp[i];
            // 문자열을 정수로 형변환
            int t = Integer.valueOf(s);
            // 형 변화된 값을 정수 배열에 넣는다.
            
            std[i] = t;
            sum += std[i];
        }
        
        avg = sum / ((double) temp.length);
        
        Arrays.sort(std);
        
        System.out.println("합계는 :" + sum);
        System.out.println("평균은 :" + avg);
        System.out.println("최소값 :" + std[0]);
        System.out.println("최대값 :" + std[std.length - 1]);
        
    }
    
}
