package java03;

import java.util.Scanner;

public class jv03_02_ifelse {
    
    public static void main(String[] args){
        
     
        Scanner keyboard = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        
        int x = keyboard.nextInt(); //스캐너 선언? x ? grade?
        
        if ( x >= 60)
        {
            System.out.println("합격입니다.");
            System.out.println("장학금도 받을 수 있습니다. ");
        }
        
        else{
            System.out.println("불합격입니다.");
            System.out.println("장학금을 받을 수 없습니다.");
        
            
        }
        
        
    }
}
