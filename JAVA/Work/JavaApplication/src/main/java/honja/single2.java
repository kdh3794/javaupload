package honja;

import java.util.Scanner;

public class single2 {
   
    public static void main(String[] args){
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("변수 값 : " );
        n = sc.nextInt();
        
        if(n>=100){
            System.out.println("large");
        }
        else{
            System.out.println("small");
        }
    }
}
