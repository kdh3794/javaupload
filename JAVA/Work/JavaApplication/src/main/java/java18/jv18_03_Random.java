package java18;

import java.util.Random;
import java.util.Scanner;

public class jv18_03_Random {
    public static void main(String[] rags) {
        // 난수 만들기
        // new Random().nextDouble()는 0부터 1사이의 실수값
        Random rand = new Random();
        double rand1 = rand.nextDouble();
        System.out.println(rand1);
        
        // 난수를 이용해서 0부터 2사이의 값을 만드시오.
        double rand3 = rand.nextDouble() * 2;
        System.out.println(rand3);
        
        // 문제1. 실수 난수를 이용해서 1부터 3사이의 값을 만드시오.
        double rand4 = (double) (rand.nextDouble() * 2) + 1;
        System.out.println(rand4);
        
        // int 정수 double 실수
        
        // 문제2. 0이상 10 미만의 실수 난수 5개를 생성해서 출력하시오.
        int[] ran = new int[5];
        for (int i = 0; i < ran.length; i = i + 1) {
            ran[i] = rand.nextInt(9) + 1;
            System.out.print(ran[i]);
            System.out.println("");
        }
        
        // 문제 3. 사용자로부터 최대 정수 A와 최소 정수 B를 입력받는다.
        // 그리고 A와 B사이에 존재하는 정수 난수 10개를 생성해서 출력하시오.
        Scanner sc = new Scanner(System.in);
        int w;
        int t;
        System.out.println("최대 정수");
        w = sc.nextInt();
        System.out.println("최소 정수");
        t = sc.nextInt();
        int[] ran1 = new int[10];
        for (int i = 0; i < ran1.length; i = i + 1) {
            ran1[i] = rand.nextInt(w - 1) + t;
            
            System.out.print(ran1[i]);
            
        } // 다시 해봐야함. 답도 애매하고 설명이 없음. 밴드에서 코드 보기.
        
    }
}
