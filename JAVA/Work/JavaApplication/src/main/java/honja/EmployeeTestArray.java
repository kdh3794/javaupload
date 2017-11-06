package honja;

import java.util.Scanner;

public class EmployeeTestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 크기가 3인 Employee 배열 employees를 생성
        Employee[] employees = new Employee[3];
        // 3명의 사원 정보를 받아서 각각
        // Employee 인스턴스를 생성한 후에 배열에 추가
        for (int i = 0; i < 3; i = i + 1) { // 배열이 3개이므로 0부터 2까지
            
            System.out.print(" 이름 : ");
            String name = sc.next();
            System.out.print(" 주소 : ");
            String address = sc.next();
            System.out.print(" 주민번호 : ");
            String rrn = sc.next();
            System.out.print(" 월급 : ");
            int salary = sc.nextInt();
            
            Employee emp1 = new Employee();
            emp1.setAddress(address); // emp1 배열에 employee클래스에 있는 adress에 값 저장.
            emp1.setName(name);
            emp1.setRrn(rrn);
            emp1.setSalary(salary);
            
            employees[i] = emp1; // employees 라는 배열에 위에 값들을 차례대로 저장.
            System.out.println(emp1.toString()); // 배열들 출력
        }
        
        for (int i = 0; i <= employees.length - 1; i = i + 1) {
            System.out.println(employees[i]);
        }
    } // employees 배열에 저장된 모든 데이터를 출력한다.
      // 반복 루프를 사용.
    
}
