package java07;

import java.util.Scanner;

public class ex07_02_inputVal {
    public static void main(String[] args){
        {
            Scanner stdIn = new Scanner(System.in);  
            
            System.out.println("최대값, 최소값을 구하는 프로그램입니다.");
            System.out.println("*********************************");
            System.out.println();
            
            int[] save = new int[20];
            
            for(int i = 0; i<10; i++)
            {
             System.out.print("정수" + (i+1) + "를 입력하시오 : ");
             save[i] = stdIn.nextInt();   
            }
            
            int max = save[0];
            int min = save[0];
            
            for(int i=1; i<10; i++)
            {
           if(max<save[i])
            max = save[i];
           else if(min>save[i])
            min = save[i];
            }
            
            System.out.println();
             System.out.println("최대값은 " + max + "이고 최소값은 " + min + "이다."); 
              
            System.out.println();
            System.out.println("*********************************");
           }
    }
}
