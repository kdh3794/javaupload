package honja2;

import java.util.Scanner;

public class ManagerTestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 크기가 3인 Employee 배열 employees를 생성
        Manager[] mn = new Manager[3];
        
        // 3명의 사원 정보를 받아서 각각
        // Employee 인스턴스를 생성한 후에 배열에 추가
        for (int i = 0; i < mn.length; i = i + 1) { // 배열이 3개이므로 0부터 2까지
            
            System.out.print(" 이름 : ");
            String name = sc.next();
            // i방의 배열에 name 을 입력. 입력한 name은 employee클래스로 들어가나?
            
            System.out.print(" 주소 : ");
            String address = sc.next();
            
            System.out.print(" 주민번호 : ");
            String rrn = sc.next();
            
            System.out.print(" 월급 : ");
            int salary = sc.nextInt();
            
            System.out.print(" 보너스 : ");
            int bounus = sc.nextInt();
            
            mn[i] = new Manager(); // 여기서 들어갈 배열을 선언(?)해줘야 배열마다 값이 들어감?
            mn[i].setName(name); // 인스턴스 만들어서 값을 설정. 위에다 놓으면 안되고 아래에다 둬야함.
            mn[i].setAddress(address);
            mn[i].setBounus(bounus);
            mn[i].setRrn(rrn);
            mn[i].setSalary(salary);
            
        }
        
        for(int i=0; i<=mn.length-1; i=i+1){
        System.out.println(mn[i]); // 각 배열에 저장 된 값을 출력
        }
        
    }
    
}
