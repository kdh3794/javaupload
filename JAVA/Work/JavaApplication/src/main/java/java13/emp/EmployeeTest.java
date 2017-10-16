package java13.emp;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        //Employee를 저장할 수 있는 배열을 만드시오.
        //int[] arr = new int[ 3 ];
        Employee[] employees = new Employee[ 3 ];
        
        
        Scanner sc = new Scanner(System.in);
        // 크기가 3인 employee의 배열 employees을 생성한다.
        for (int i = 0; i < 3; i = i + 1) {
            
            // 이름
            System.out.print("이름을 입력하시오 ");
            
            String name = sc.next();
            // 주소
            System.out.print("주소를 입력하시오 ");
            String address = sc.next();
            // 주민번호
            System.out.print("주민번호를 입력하시오 ");
            String rrn = sc.next();
            // 월급
            System.out.print("월급을 입력하시오 ");
            int salary = sc.nextInt();
            
            // 키보드 입력값을 이용하여 employee 인스턴스를 생성하시오.
            Employee emp1 = new Employee();
            
            // setter를 이용하여 필드 값 설정
            emp1.setAddress(address);
            emp1.setName(name);
            emp1.setRrn(rrn);
            emp1.setSalary(salary);
            
       
            //직원의 인스턴스를 배열에 저장되는 코드를 추가. 
            employees[i] = emp1;
            // emp1의 모든 필드 값을 출력하시오.
            System.out.println(emp1.toString());
        }
        System.out.print("------");
            
            // 3명의 사원 정보를 받아서 각각 Employee 객체를 생성한 후에
            // 배열에 추가하여 본다. 반복 루프를 사용한다.
            
            // employees 배열에 저장된 모든 데이터를 출력한다. 반복루프를
            // 사용한다.
            
        
        //for 문을 사용하여 배열의 값을 추가하시오
        for(int i=0; i<=employees.length-1; i=i+1){
            System.out.println(employees[i]);
        }
        
    }
}
