package honja;

import java.util.Scanner;

public class ex06_07_합계구하기_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int value = add(x, y);
        int sum = 0;
        System.out.println("시작값을 입력하세요 :");
        x = sc.nextInt();
        System.out.println("종료 값을 입력하세요 : ");
        y = sc.nextInt();
        
        if (y < x) { // y가 x보다 클 경우를 예상해서 if문을 써줌.
            int tmp = y; // tmp라는 빈공간은 if문 안에다가 선언해줘야 함. 그래야 이 공간에서만 값을 교환.
            y = x;
            x = tmp;
        }
       
        public int add(int x, int y){
            for (int i = x; i <= y; i = i + 1) {
                int sum = sum + i;
        }
        
        System.out.println( add );
        
    }
    
}
