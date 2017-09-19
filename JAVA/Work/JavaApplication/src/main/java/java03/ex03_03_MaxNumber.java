package java03;

import java.util.Scanner;

public class ex03_03_MaxNumber {
    public static void main(String[] args){
        int x;
        int y;
        int z;
        
        
        Scanner sc = new Scanner(System.in); //키보드와 프로그램 연결
        System.out.print("x : "); 
        x = sc.nextInt(); //첫번재 키보드 입력 받은 값 x
        
        System.out.print("y : ");
        y = sc.nextInt(); //두번째 키보드 입력 받은 값 y
        
        System.out.print("z : ");
        z = sc.nextInt();
        
        if (x > y){
            System.out.println("입력 받은 수 중 가장 큰 수" +x);
            if(y > x ){ 
                System.out.println("입력 받은 수 중 가장 큰 수" +y);
            }
            else if(z > x){
                System.out.println("입력 받은 수 중 가장 큰 수" +z );
            }
                   
                
        }
        }
            
        
        
    }
