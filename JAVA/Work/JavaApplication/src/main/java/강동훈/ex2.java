package 강동훈;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ex2 {
    public static void main(String[] args) {
        int[] arr = { 23, 96, 35, 42, 81, 19, 8, 77, 50 };
        
        System.out.print("정렬전 : ");
        printArray(arr);
        
        Arrays.sort(arr);
        
        System.out.print("정렬후 : ");
        printArray(arr);
        
    }
    
    private static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i = i + 1) {
            System.out.print(arr[i] + " ");
           
            }
        System.out.println();
        }
        
    }
    

