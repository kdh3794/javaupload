package java19.st3studentmap;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {
    public static void main(String[] args) {
        
        // hashMap 인스턴스 String val 생성
        
        Map<String, Student> map = new HashMap<>();
        
        // map에 추가.
        // key -->( 이름 , 학번)
        // 170101 --> new Student( 170101, "구준표")
        // 170102 --> new Student( 170102, "금잔디")
        // 170103 --> new Student( 170103, "윤지후")
        map.put("170101", new Student(170101, "구준표"));
        map.put("170102", new Student(170102, "금잔디"));
        map.put("170103", new Student(170103, "윤지후"));
        
        // entrySet, foreach map 에 항목 출력.
        System.out.println("학생 목록 출력 >> ");
        for (Map.Entry<String, Student>elem : map.entrySet()){
            int no =  elem.getValue().getNumber();
            String name =  elem.getValue().getName();
            System.out.format("학번 : %10d, 이름:%5s", no, name);
        }
        System.out.println();
        
      /*  System.out.println("foreach ");
        for (String key : map.keySet()){
            System.out.print(key + ":" + map.get(key)+",");
        }
        System.out.println();*/  //위에거랑 다른가?
        
        
        // 학번 170102를 삭제.
        map.remove("170102");
        System.out.println("1701025 삭제 " + map.toString());
        System.out.println();
        
        
        // 윤지후의 이름이 "윤후"로 개명.
        // 1. 새로운 인스턴스, new Student(170103, "윤후")를 만들고 put. 새로운 메모리 지정.
        // 기존값을 변경
        Integer key = 0;
        for(Student s : map.values()){
            if(s.getName().equals("윤지후")){
                key = s.getNumber();
                break;
            }
        }
        map.put(String.valueOf(key), new Student(170103, "윤후"));
      
        
    }
}
