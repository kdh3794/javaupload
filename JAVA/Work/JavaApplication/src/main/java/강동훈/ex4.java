package 강동훈;

import java.util.Scanner;

import 강동훈.Oper;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.print("첫번째 : ");
        int a = sc.nextInt();
        System.out.print("두번째 : ");
        int b = sc.nextInt();
        
        System.out.println("Add : " + Oper.add(a, b));
        System.out.println("Minus : " + Oper.minus(a, b));
        System.out.println("mul : " + Oper.mul(a, b));
        System.out.format("div :  "  + Oper.div(a, b)); //소수점 한자리만 됨.
    }
}
