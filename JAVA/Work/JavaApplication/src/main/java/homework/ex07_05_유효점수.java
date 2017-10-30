package homework;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_05_유효점수 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y;
        int sum = 0;
        
        System.out.print("심사 위원의 수를 입력하시오 ");
        x = sc.nextInt();
        int[] nums = new int[x]; // x값 만큼 배열
        
        System.out.print("5명 심사 위원의 점수 입력 : ");
        
        // 정렬
        
        for (int i = 0; i < nums.length; i = i + 1) {
            
            nums[i] = sc.nextInt();
            sum = sum + nums[i];
            
            if (i == nums.length) {
                break;
                
            }
            
        }
        for (int j = 1; j < nums.length - 1; j = +1) {
            
        }
        Arrays.sort(nums);
        
        System.out.println("유효점수 : " + sum);
        
        System.out.println("합계" + (nums[1] + nums[2] + nums[3]));
        double avg = (nums[1] + nums[2] + nums[3]) / x;
        System.out.println("평균 " + avg);
        
    }
}
