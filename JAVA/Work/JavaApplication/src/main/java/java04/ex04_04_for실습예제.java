package java04;

import java.util.Scanner;

public class ex04_04_for실습예제 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        int A,B;
        int sum = 0;
        
        System.out.print("시작값을 입력하세요 : "  );
        A = sc.nextInt();
        System.out.print("종료값을 입력하세요 : "  );
        B = sc.nextInt();
                 
        if (A<B) //for 문에서 n부터 n까지 더하려면 최대 기준점 필요. 
        {
            for (int i=A; i<=B; i=i+1)
                sum+=i;                    
        }
        
        else //A가 B보다 작을 경우 여기서 실행
        {
            for (int i=B; i<=A; i=i+1)
                sum+=i;
        }
       
       
           System.out.println(A+"부터" +B+ " 까지의 합: " +sum );
    }
    
    }
           

