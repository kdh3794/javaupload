package 강동훈;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
    static Scanner key = new Scanner(System.in);
    static PhoneInfo ph = new PhoneInfo();
    static List<PhoneInfo> info = new ArrayList<>();
    
    
    public static void main(String[] args) {
        
        for(;;) {
            
            System.out.println("선택하세요..");
            System.out.println("1.데이터 입력");
            System.out.println("2.데이터 검색");
            System.out.println("3.데이터 삭제");
            System.out.println("4.프로그램 종료");
            System.out.print("선택:");
            
            int menu = key.nextInt();
            
            if(menu == 1) {
                System.out.println("데이터 검색 시작합니다..");
                
                System.out.print("name :");
                String name = key.next();
                ph.setName(name);
                
                System.out.print("phone :");
                String phone = key.next();
                ph.setPhoneNumber(콜);
                
                System.out.print("birth :");
                String birth = key.next();
                ph.setBirthday(birth);
                
                System.out.println("데이터 검색이 완료되었습니다.");
                
                info.add(new PhoneInfo(name, phone, birth));
                
            }else if(menu == 2) {
                System.out.println("데이터 검색 시작합니다..");
                System.out.print("이름 :");
                String sc = key.next();
                int index = -1;
                for(int i = 0; i< info.size(); i=i+1){
                    if (info.get(i).getName().equals(sc)){
                        index = i;
                        break;
                    }
                }
                if(index == -1){
                    System.out.println("검색결과가 없습니다.");
                }else{
                    info.get(index).PhoneInfo();
                    System.out.println("데이터 검색이 완료되었습니다.");
                }
            }else if (menu == 3){
                System.out.println("데이터를 삭제 합니다.");
                System.out.print("이름 :");
                String esc = key.next();
                int index = -1;
                for (int i = 0; i < info.size(); i=i+1){
                    if (info.get(i).getName().equals(esc)){
                        index = i;
                        break;
                    }
                }
                if(index == -1){
                    System.out.println("검색 결과가 없습니다.");
                }else{
                    info.remove(index);
                    System.out.println("데이터 삭제가 완료되었습니다.");
                }
            }else if (menu == 4){
                System.out.println("종료합니다.");
                break;
            }else{
                System.out.println(menu + "에 해당하는 선택은 존재하지 않습니다.");
                System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
                continue;             
            }           
        }       
    }
}