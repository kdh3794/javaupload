package honja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex20_01_ArrayList유효점수 {
    public static void main(String[] args) {
        // 1. ArrayList 만들기.
        List<Integer> list = new ArrayList<>();
        
        // 2. 학생 수 입력 받기. 최소 3명 이상
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        System.out.print(" 학생 수 : ");
        int count = sc.nextInt();
        
        // 3. 학생 성적 입력 받기. 몇 번 입력 받아야 하는가?
        for (int i = 1; i <= count; i = i + 1) {
            System.out.print(" 성적을 입력하세요 :");
            int score = sc.nextInt();
            
            // list 변수에 입력 받은 학생 성적을 추가한다.
            list.add(score); // array[i] = score;
            
            sum += list.get(i);
        }
        
        // 4. 3번 학생의 성적을 100점으로 수정
        list.set(2, 100); // list는 0번부터 시작. 2= 3-1
        // 5. Arraylist에서 마지막 학생 삭제.
        int 삭제할index = list.size();
        list.remove(삭제할index);
        
        // 6.list에서 0번 값을 출력하시오.
        int 첫번째값 = list.get(0);
        
        // 6. 평균을 구하고 출력.
        
        average = (double) sum / list.size();
        
        System.out.println("평균: " + average);
    }
}
