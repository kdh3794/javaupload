package honja;

import java.util.Scanner;

public class OperTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First num : ");
        int a = sc.nextInt();
        System.out.print("Second num : ");
        int b = sc.nextInt();
        
        System.out.println("Add : " + Oper.add(a, b));
        System.out.println("Minus : " + Oper.minus(a, b));
        System.out.println("mul : " + Oper.mul(a, b));
        System.out.printf("div : " + Oper.div(a, b));
        
    }
}
