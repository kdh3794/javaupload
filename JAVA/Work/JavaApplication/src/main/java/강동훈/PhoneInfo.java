package 강동훈;

import java.util.Scanner;

class PhoneInfo {
    
    private String name;
    private String phoneNumber;
    private String birthday;
    
    public PhoneInfo(String name, String phoneNumber, String birthday) {
        
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }
    
    public PhoneInfo() {
        
    }
    public void showInfo(){
        System.out.println(name+"\n"+phoneNumber);
        if(birthday!=null)
            System.out.print(birthday);
        System.out.println();
    }
    
}


class PhoneMain{
   
 
    

     static Scanner sc = new Scanner(System.in);
     
     public static PhoneInfo input(){
         System.out.print("이름:");
         String name = sc.nextLine();
         System.out.print("전화번호:");
         String phoneNumber = sc.nextLine();
         System.out.print("생년월일:");
         String birthday = sc.nextLine();
         return new PhoneInfo(name,phoneNumber,birthday);
        }
     public static void main(String ar[]){
         PhoneInfo phone;
         
         for(;;){
             System.out.println("1:입력 \n 2:종료");
             int input = sc.nextInt();
             sc.nextLine();
             if(input==1)
                 phone=input();
             else
                 break;
             phone.showInfo();
         }
         
     }
 }
 