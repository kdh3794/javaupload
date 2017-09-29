package java07;

public class jv07_02_ArrayExam2 {
    public static void main(String[] args) {
        int size = 6;
        int[] numbers = new int[size];
        
        for (int i = 0; i <= numbers.length - 1; i = i + 1) {
            numbers[i] = i;
            
        }
        
        
        for (int j = 0; j <= numbers.length - 1; j = j + 1) {
            System.out.print("[" + numbers[j] + "]");
            
        }
    }
}
