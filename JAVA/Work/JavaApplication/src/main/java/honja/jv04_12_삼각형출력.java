package honja;

public class jv04_12_삼각형출력 {
    public static void main(String[] args) {
      /*  for (int i = 1; i <= 10; i = i + 1) {
            for (int j = i; j <= 9; j = j + 1) {
                System.out.print("*");
            }
            System.out.println("*");*/
            
            for (int i = 0; i <10; i = i + 1) {
                for (int j = 0; j <= i; j = j + 1) 
                    System.out.print("*");
                    System.out.println();
                    
                }
                System.out.println();
            }
        
    }



