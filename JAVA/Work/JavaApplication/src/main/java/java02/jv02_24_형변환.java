package java02;

public class jv02_24_형변환 {
    public static void main(String[] args){
        
        int result;
        
        result= 1 + '2';
        System.out.println("result ==" +result);
        
        result= '2' + true;
        String true = String.valueOf(result);
        System.out.println("result ==" +result);
 
        
        System.out.println("result ==" +result);
        
        result= "15" - 5;
        System.out.println("result ==" +result);
        
        result= "1" + '2';
        System.out.println("result ==" +result);
        
        result= false + true; 
        System.out.println("result ==" +result);
        
        
    }
}
