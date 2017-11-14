package honja2;

import java.util.Scanner;

class PhoneBookManager{
    //데이터의 저장, 검색, 삭제
    PhoneInfo [] phoneBook;
    private int count; //전화번호부에 저장되있는 사람 수.
    Scanner sc = new Scanner(System.in);
    
    public PhoneBookManager(){
        phoneBook=new PhoneInfo[100];
        count=0;
    }
    //데이터의 검색
    public void serachBook(){
        
        int index;
        System.out.print("찾을 이름 입력 : ");
        String name=sc.nextLine();
        index=search(name);
        if(index<0)
            System.out.println("해당 하는 이름이 없습니다 ");
        else{
            phoneBook[index].showInfo();
            System.out.println("데이터 검색 완료 \n");
        }
    }
    public int search(String name){
        //이름 찾기
        for(int index=0; index<count; index++){
            if(name.compareTo(phoneBook[index].getName()) == 0){
                return index;
            }
        }
        return -1;
        
    }
    //데이터의 삭제
    public void removeBook(){
        
        int index;
        System.out.print("삭제할 이름 입력 : ");
        String name = MenuViewer.sc.nextLine();
        index=search(name);
        if(index<0)
            System.out.println("해당하는 값이 없습니다 . ");
        else{
            for(int i = index; i<count-1 ; i++){
                phoneBook[i]=phoneBook[i+1];
                
            }
            count--;
            System.out.println("데이터 삭제 완료 \n ");
        }
    }
    //데이터의 저장
    public PhoneInfo readPhoneBook(){ //일반
        System.out.print("이름:");
        
    }
    
    
}







public class PhoneInfo {
    
    // 생년 월일 정보는 저장을 할 수도 저장 하지 않을 수도 있게 생성자를 정의하자(오버로딩)
    private String name;
    private String phoneNumber;
    private String birthday;
    
    public PhoneInfo(String name, String phoneNumber, String birthday) {
        
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }
    
    public PhoneInfo(String name, String phoneNumber) { // 이쪽에는 왜 birthday 가 없지.
        // 위에도 그렇고 여기도 super()가 안 들어감.
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = null;
    }
    
    public void showInfo() {
        System.out.println(name + "\n" + phoneNumber);
        if (birthday != null)
            System.out.println(birthday);
        System.out.println();
    }
    
}

public class PhoneMain {
    static Scanner sc = new Scanner(System.in);
    
    public static PhoneInfo input() {// 입력처리
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("생년월일 : ");
        String birthday = sc.nextLine();
        return new PhoneInfo(name, phoneNumber, birthday);
        
    }
    
    public static void main(String args[]) {
        PhoneInfo phone;
        for (;;) {
            System.out.println("1:입력 \n2:종료 ");
            int input = sc.nextInt();
            sc.nextLine();
            if (input == 1)
                ;
            else
                break;
            phone.showInfo();
        }
    }
    
}
