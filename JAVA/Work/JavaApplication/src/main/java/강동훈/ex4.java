package 강동훈;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.print("First num : ");
        a = sc.nextInt();
        
        System.out.print("Second num : ");
        b = sc.nextInt();
        
        Oper op = new Oper(a, b);
        
        System.out.println("Add : " + op.add());
        System.out.println("Minus : " + op.minus());
        System.out.println("Mul : " + op.mul());
        System.out.format("Div : %.6f", op.div());
    }
    
}
