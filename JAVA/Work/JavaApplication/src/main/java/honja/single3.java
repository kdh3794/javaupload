package honja;

import java.util.Scanner;

public class single3 {
    public static void main(String[] args){
        int a ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Grade" );
            a = sc.nextInt();
            if(a >=90){
                System.out.print("학점 : A" );
            }
            else if(a >=80){
                System.out.print("학점 : B" );
            }
            else if(a >=70){
                System.out.print("학점 : C" );
            }
            else if(a >=60){
                System.out.print("학점 : D" );
            }
            else {
                System.out.print("학점 : F" );
            }
        
    }
}
