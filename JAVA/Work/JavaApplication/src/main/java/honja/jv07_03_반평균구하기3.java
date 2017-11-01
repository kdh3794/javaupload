package honja;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        
        System.out.print("학생수를 입력하시오 : ");
        x = sc.nextInt();
        int[] nums = new int[x];
        
        for (int i = 0; i < nums.length; i = i + 1) {
            System.out.print("성적을 입력하시오 : ");
            nums[i] = sc.nextInt();
            sum = sum + nums[i];
            
        }
        
        System.out.println("합계 :" + sum);
        double avg = sum / x;
        System.out.println("평균 : " + avg); // 내가 한게 아님.
        
    }
    
}
