package test00;

import java.util.*;
public class tw01_03 {
    
    public static void main(String [] args){
        int salary;
        int deposit;
        
        System.out.printf("월급을 입력하시오 : " );
        
        Scanner sc = new Scanner (System.in);
        
        salary = sc.nextInt();
                        
        String input = sc.nextLine();
        
             
        
        deposit = salary*120;
        System.out.println("10년 동안의 저축액 ="  + deposit);
        
        
    }
    
}
