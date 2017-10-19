package java14.st7student;

public class GraduateStudentTest {
    
    public static void main(String[] args) {
        GraduateStudent s1 = new GraduateStudent();
        
        
        GraduateStudent s2 = new GraduateStudent();
        
      //GraduateStudent 인스턴스 s3를 생성자를 이용하여 필드에 값을 설정/출력
        GraduateStudent s3 = new GraduateStudent(5, "ㄴㄴ", "ㄴㄴㄴ", "ㄴㄴㄴㄴ");
      //GraduateStudent 인스턴스 s1을 생성하고
        //필드에 값을 설정한 후 toString 메서드를 필드 값을 출력하시오.
        // GraduateStudent 인스턴스 s2을 생성하고 필드에 직접 값을 설정/출력.
        //필드 3개가 해당 됨. setter를 이용하지 않고 필드에 값 설정이 가능하다.
        
        s1.setNumber(5);
        s1.setName("dd");
        s1.setLab("dd");
        s1.setPhone("ddd");
        
        s2.setNumber(6);
        s2.name="ddf";
        s2.lab="dfwdf";
        s2.phone="dfwfd";
                
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        
       
    }
    
}
