package java04;

public class ex04_03_배열좌표출력 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i = i + 1) { //(x,y)  (5,y) 까지?
            for (int j = 1; j <= i; j = j + 1) {
                if (i == j) // i와 j가 같을 경우만 출력
                    System.out.print("[" + i + "," + j + "]");
                
                else {
                    System.out.print("     ");
                }
                
            }
            System.out.println(""); // 줄바꿈 (중복 for 끝나는 위치)
        }
    }
}
