package honja;

import java.util.Arrays;

public class ex08_03_String합계_평균_최대_최소 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        double avg = 0;
        
        String temp = "74 874 9883 73 9 73646 774";
        
        // 문자열 자르기 --> String 배열을 얻게 됨.
        String[] sArray = temp.split(" ");
        
        // 문자열 배열을 정수 배열로 만든다.
        int[] iArray = new int[sArray.length];
        for (int i = 0; i <= sArray.length - 1; i = i + 1) {
            // 문자열 배열에서 값을 꺼내서
            String s = sArray[i];
            
            // 문자열을 정수로 형변환
            int t = Integer.valueOf(s);
            
            // 형변환된 값을 정수 배열에 넣는다.
            iArray[i] = t;
            sum += iArray[i];
        }
           
        avg = sum / ((double)sArray.length);
        
        Arrays.sort(iArray); // 정수배열 오름차순 정렬
        
        System.out.println("합계 :" + sum);
        System.out.println("평균 :" + avg);
        // 정수배열에서 최대값을 찾는다.
        System.out.println("최대값 :" + iArray[iArray.length - 1]);
        System.out.println("최소값 : " + iArray[0]);
    }
    
}
