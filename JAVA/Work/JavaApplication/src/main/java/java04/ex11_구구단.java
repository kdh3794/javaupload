package java04;

import java.util.Scanner;

public class ex11_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // for문에서 입력받은 값을 계산해야 하므로 for문 앞에 사용해야함.
        // 입력 받을 변수 선언
        int tmp = 0;
        int r = 0;
        int i, j = 0;
        System.out.print("시작 단수를 입력하세요 : ");
        int A = sc.nextInt(); // A입력 앞에서 변수 선언 안하고 여기서 int로 선언해줘도 된다.
        System.out.print("종료 단수를 입력하세요 : ");
        int B = sc.nextInt(); // B입력
        
        B=tmp;
        A=B;
        tmp = A;
       
        if (A>B)
        {
        for ( i = A; i <= 15; i = i + 1) { // i에 A입력 값을 넣는다.
            
            for ( j = 1; j <= 9; j = j + 1) {
                
                r = i * j;
                
                System.out.print(A + " * " + j + " = " + r);
                
                // System.out.format("%2d * %d = %d", i, j, r);
                if (j < 9) // j(뒷자리)가 9보다 작으면 ,
                    System.out.print(", ");
                else
                    System.out.print(".");
                
            }
            
            
        }
        
    }
        else
            System.out.print(tmp + " * " + j + " = " + r);
        
}
    
}

