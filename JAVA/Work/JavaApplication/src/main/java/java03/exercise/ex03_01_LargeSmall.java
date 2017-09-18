package java03.exercise;

import java.util.Scanner;

public class ex03_01_LargeSmall {
    
    public static void main(String[] args){
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        if ( n >= 100) {
            System.out.println("large." );
            
                        
        }
        else {
            System.out.println("small.");
            
        }
    }
    
}
