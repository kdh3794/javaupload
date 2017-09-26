package java06;

import java.util.Scanner;

public class ex06_03_사칙연산메서드 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // 스캐너 선언
        
        int x, y; // x, y 선언
        System.out.print("First num : ");
        x = sc.nextInt(); // x 값 입력
        System.out.print("Second num : ");
        y = sc.nextInt(); //y값 입력
        int add = Add(x, y); //add선언
        int minus = Minus(x, y);
        int mul = Mul(x, y);
        double div = Div(x, y); // 실수형이므로 double 사용
        
        System.out.format("div : %.3f\n", div);
        System.out.println("Mul : " + mul);
        System.out.println("Minus : " + minus);
        System.out.println("Add : " + add);
        
    }
    
    private static double Div(double x, double y) {
        double sum = x / y;
        
        return sum;
    }
    
    private static int Mul(int x, int y) {
        int sum2 = x * y;
        
        return sum2;
    }
    
    private static int Minus(int x, int y) {
        int sum3 = x - y;
        return sum3;
    }
    
    private static int Add(int x, int y) {
        int sum4 = x + y;
        return sum4;
    }
}
