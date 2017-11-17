package honja2;

import java.util.*;


class PhoneBookManager{
 //데이터의 저장, 검색, 삭제
 
 PhoneInfo [] phoneBook;
 private int count;//전화번호부에 저장되잇는 사람수
 Scanner keyboard = new Scanner(System.in);
 
 public PhoneBookManager(){
  phoneBook=new PhoneInfo[100];
  count=0;  
 }
 //데이터의 검색
 public void searchBook(){
  
  int index;
  System.out.print("찾을 이름 입력:");
  String name=keyboard.nextLine();
  index=search(name);
  if(index<0)
   System.out.println("해당하는 값이 없습니다.");
  else{
   phoneBook[index].showInfo();
   System.out.println("데이터검색 완료\n");
  }
 }
 
 public int search(String name){//이름찾기
  
  for(int index=0;index<count;index++){
   if(name.compareTo(phoneBook[index].getName())==0){
    return index;
   }
  }
  return -1;
 }
 //데이터의 삭제
 public void removeBook(){

  int index;
  System.out.print("삭제할 이름 입력:");
  String name=keyboard.nextLine();
  index=search(name);
  if(index<0)
   System.out.println("해당하는 값이 없습니다.");
  else{
   for(int i=index;i<count-1;i++){
    phoneBook[i]=phoneBook[i+1];    
   }
   count--;
   System.out.println("데이터삭제 완료\n");
  }
   
 }
 //데이터의 저장
 public void readBook(){//입력처리
  System.out.print("이름:");
  String name = keyboard.nextLine();
  System.out.print("전화번호:");
  String phoneNumber = keyboard.nextLine();
  System.out.print("생년월일:");
  String birthday = keyboard.nextLine();
  phoneBook[count++] = new PhoneInfo(name,phoneNumber,birthday);
 }
 
 
}

class PhoneInfo{
 
 private String name;//이름
 private String phoneNumber;//핸드폰번호
 private String birthday;//생년월일
 
 public PhoneInfo(String name, String phoneNumber, String birthday){
  this.name = name;
  this.phoneNumber = phoneNumber;
  this.birthday = birthday;
  
 }
 public PhoneInfo(String name, String phoneNumber){
  this.name = name;
  this.phoneNumber = phoneNumber;
  this.birthday = null;
 }
 public void showInfo(){
  System.out.println(name+"\n"+phoneNumber);
  if(birthday!=null)
   System.out.println(birthday);
 
  System.out.println();
  
 }
 public String getName(){
  return name;
 }
}


class PhoneMain {

 static Scanner keyboard = new Scanner(System.in);

 public static void showMenu(){//메뉴를 보여주는화면
  System.out.println("---------전화번호부관리프로그램ver3----------");
  System.out.println("선택하세요..");
  System.out.println("1. 데이터 입력");
  System.out.println("2. 데이터 검색");
  System.out.println("3. 데이터 삭제");
  System.out.println("4. 데이터 종료");
  
 }
 
 public static void main(String ar[]){
 // PhoneInfo phone;
  PhoneBookManager phoneManager = new PhoneBookManager();
  
  while(true){//무한루프
   
   showMenu();
   int input=keyboard.nextInt();
   keyboard.nextLine();
  
   switch(input){
   case 1://입력
     phoneManager.readBook();
     break;
   case 2://찾기
     phoneManager.searchBook();
     break;
   case 3://삭제
     phoneManager.removeBook();
     break;
   case 4: System.out.println("프로그램을종료합니다.");
     return;
   }
      
  }
  
 }
}
