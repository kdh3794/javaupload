package java02;

public class jv02_24_형변환 {
    public static void main(String[] args){
        
        int result;
        
        result= 1 + '2';
        System.out.println("result ==" +result);
        
        result= '2' + ((true ? 1:0));
        
        System.out.println("result ==" +result);
 
        
        System.out.println("result ==" +result);
        
        result= Integer.valueOf("15") - 5;
        System.out.println("result ==" +result);
        
       
        result= Integer.valueOf("1") + '2';
        
        result= false + true; 
        System.out.println("result ==" +result);
        
        
    }
}
