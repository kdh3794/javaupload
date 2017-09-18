package java03.exercise;

import java.util.Scanner;

public class jv03_04_연속ifelse {
    
    public static void main(String[] args){
        
    int score;
    char grade = 0;
    
     
    System.out.print("Grade: " );
    
    Scanner sc = new Scanner(System.in);
    
    score = sc.nextInt();
    
    if (score >= 90 && score <= 100){
        grade = 'A';
        
    }else if(score >= 80 && score <=89){
        grade = 'B';
    }else if(score >= 70 && score <=79){
        grade = 'C';
    }else if(score >= 60 && score <=69){
        grade = 'D';
    }else if(score < 60){
        grade = 'F';
    }
    
   
    System.out.println("학점 : " + grade);
   
   
    
   
        
}
}
