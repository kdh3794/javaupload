package java17.st2product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    
    @SuppressWarnings("resource") 
    public static void main(String[] args){
       List<Product> pArr = new ArrayList<Product>();
       Scanner sc = new Scanner(System.in);
       
       int count = 1;
       int chooser = 0;
       
       String describe = "";
       String producer = "";
       int price = 0;
       
       while (true) {
           System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) >> ");
           chooser = sc.nextInt();
           switch (chooser) {
               case 1:
                   System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3) >>");
                   chooser = sc.nextInt();
                   System.out.print("상품 설명 >>");
                   describe = sc.next();
                   System.out.print("생산자 >>");
                   producer = sc.next();
                   System.out.print("가격 >> ");
                   price = sc.nextInt();
                   
                   switch (chooser){
                       case 1:
                           Book b1 = new Book();
                           b1.setId(count);
                           b1.setDescribe(describe);
                           b1.setProducer(producer);
                           b1.setPrice(price);
                           
                           System.out.print("책 제목 >>");
                           b1.setBookName(sc.next());
                           
                           System.out.print("저자 >>");
                           b1.setAuthor(sc.next());
                           
                           System.out.print("ISBN >>");
                           b1.setISBN(sc.next());
                           
                           pArr.add(b1);
                           count++;
                           break;
                           
                       case 2:
                           CompactDisc c1 = new CompactDisc();
                           c1.setId(count);
                           c1.setDescribe(describe);
                           c1.setProducer(producer);
                           c1.setPrice(price);
                           
                           System.out.print("앨범 제목 >>");
                           c1.setTitle(sc.next());
                           
                           System.out.print("가수 >>");
                           c1.setSinger(sc.next());
                           
                          
                           
                           pArr.add(c1);
                           count++;
                           break;
                           
                       case 3:
                           ConversationBook cv1 = new ConversationBook();
                           cv1.setId(count);
                           cv1.setDescribe(describe);
                           cv1.setProducer(producer);
                           cv1.setPrice(price);
                           
                           System.out.print("책 제목 >>");
                           cv1.setBookName(sc.next());
                           
                           System.out.print("저자 >>");
                           cv1.setAuthor(sc.next());
                           
                           System.out.print("ISBN>>");
                           cv1.setISBN(sc.next());
                           
                           System.out.print("언어 >>");
                           cv1.setLanguage(sc.next());
                           
                           pArr.add(cv1);
                           count++;
                           break;
                           
                   }
                   break;
                   
               case 2:
                   for (int i = 0; i < pArr.size(); i++){
                       pArr.get(i).show();
                   }
                   break;
                   
               case 3:
                   System.exit(0);
           }
       }
        
   
        
    }
}
