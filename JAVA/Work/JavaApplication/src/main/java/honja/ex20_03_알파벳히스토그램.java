package honja;

import java.util.Scanner;

public class ex20_03_알파벳히스토그램 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" 문자를 하나 입력하세요 :");
        String a = sc.next();
        
        // 문자열에서 문자를 추출하는 방법
        String input = a;
        char ch = input.charAt(2);
        
        // 문자가 영문자인지 판독하는 방법 .ASCII 코드를 이용.
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("영문자입니다");
        } else if (isStringDouble(a)) {
            System.out.println("숫자입니다");
        }
        else{
            
        }
    }

    private static boolean isStringDouble(String a) {
        try{
            Double.parseDouble(a);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
 
    }
}
