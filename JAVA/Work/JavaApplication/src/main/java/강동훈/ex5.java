package 강동훈;

import java.util.Scanner;

import honja.Employee;

public class ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        
        for (int i = 0; i < 3; i = i + 1) {
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("주소 : ");
            String addr = sc.next();
            System.out.print("월급 : ");
            int salary = sc.nextInt();
            System.out.print("주민번호 : ");
            String rrn = sc.next();
            System.out.print("보너스 : ");
            int bounus = sc.nextInt();
            
            Employee emp1 = new Employee();
            emp1.setAddress(addr); 
            emp1.setName(name);
            emp1.setRrn(rrn);
            emp1.setSalary(salary);

            
            employees[i] = emp1; 
            System.out.println(emp1.toString()); 
        }
        
        for (int i = 0; i <= employees.length - 1; i = i + 1) {
            System.out.println(employees[i]);
        }
    } 
}
