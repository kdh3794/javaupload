package homework;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        
        String prov = "abc defg hijklm nop qrs ws yz";
        
        int length = prov.length();
        System.out.println(prov.length());// 문자열 길이 구하기
        
        String defg = prov.substring(4, 8);
        System.out.println(defg); // 문자열 추출
        
        String s1 = prov.replace("ijk", "*#$%^");
        System.out.println(s1); // 문자열 치환
        
        // 문자열에서 가장 큰 수를 찾으시오.
        String prov2 = "74 874 9883 73 9 73646 774";
        
        String[] sArray = prov2.split(" "); // a. 문자열 자르기 --> String 배열을 얻게 됨.
        
        // 문자열 배열을 정수 배열로 만든다.
        int[] iArray = new int[sArray.length];
        for (int i = 0; i <= sArray.length - 1; i = i + 1) {
            
            String s = sArray[i];// 문자열 배열에서 값을 꺼내서
            
            // 문자열을 정수로 형변환
            int t = Integer.valueOf(s);
            
            // 형변환된 값을 정수 배열에 넣는다.
            iArray[i] = t;
        }
        
        // c. 정수배열(intArray)를 오름차순 정렬하시오
        Arrays.sort(iArray);
        
        // d. 정수배열에서 최대값을 찾는다.
        System.out.println(iArray[iArray.length - 1]);
       
        System.out.println(iArray);
        
        
    }
}
