package java02;

public class jv02_23_형변환 {
  public static void main(String[] args) {
      int i = 0;
      double d = 0.0;
      
      d = (double)(5 / 4); //형 변환이 되지 않음.
      System.out.println("5 / 4 ==" + d);;
      
      d = 5.0 / 4; // 큰 수를 따라감.
      System.out.println("(double)(5/4) ==" +d);
      
      d = (double)5 / 4;
      System.out.println("(double)5 / 4 =" +d);
      
      d = (double)(5 / 4);
      System.out.println("5/4==" +d);
     
      /*
       연산 전 형변환을 해야한다.
       */
 
      
  }
       
       
       
   
}
