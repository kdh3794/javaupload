package java15.enumeration;

import java.util.Scanner;

public class PhoneHeaderTest {
    public static void main(String[] args) {
        // 키보드로 폰번호를 입력받아 phone 이라는 변수에 넣는다..
        String phone;
        Scanner sc = new Scanner(System.in);
        System.out.println("폰 번호 입력 ");
        phone = sc.next();
        
        // 입력받은 phone 변수에서 앞으로부터 3자리 추출하여
        // 추출된 값을 header변수에 넣는다.
        String header = phone.substring(0, 3);
        
        // PhoneHeaderClass를 사용하여 아래를 출력되게 하시오.
        // header가 010이면 general, 011이면 sk, 016이면 kt, 019이면 lg.
        if (header.equals(PhoneHeaderClass.P010)) {
            System.out.println("general");
        } else if (header.equals(PhoneHeaderClass.P016)) {
            System.out.println("kt");
        } else if (header.equals(PhoneHeaderClass.P019)) {
            System.out.println("lg");
        }
        // PhoneHeaderEnum을 사용하여 아래를 출력되게 하시오.
        // header 가 O10이면 general, O11이면 sk, O16이면 kt, O19이면 lg
        
        if (header.equals(PhoneHeaderEnum.P010.getValue())) {
            System.out.println("general");
        } else if (header.equals(PhoneHeaderEnum.P016.getValue())) {
            System.out.println("kt");
        } else if (header.equals(PhoneHeaderEnum.P019.getValue())) {
            System.out.println("lg");
        }
        
       
    }
    
}
