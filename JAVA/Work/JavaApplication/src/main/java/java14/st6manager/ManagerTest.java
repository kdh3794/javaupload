package java14.st6manager;

public class ManagerTest {
    
    public static void main(String[] args) {
        
       //Manager 인스턴스 m1을 생성하고
        //필드에 값을 설정한 후
        // test() 메서드를 호출.
       //m1.name = '강다니엘'
        //m1.address = '압구정'
        //m1.salary = 1억
        //m1.rrn = 94010
        Manager m1 = new Manager();
        
        m1.setName("강다니엘");
        m1.setAddress("압구정");
        m1.salary = 100000000;
        m1.setRrn("94010");
        
        System.out.println();
        m1.test();
        
    }
    
}
