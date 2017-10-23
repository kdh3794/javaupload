package java17.st2product2;

import java.util.Scanner;

public class TestTemp {
    static Scanner keyboard = new Scanner(System.in);
    static int roomid;
    public static void main(String[] args) {
        
        // int[] prods = new int[10];
        Product[] prods = new Product[10];
        
        prods[0] = new Book();
        prods[1] = new CompactDisc();
        prods[2] = new ConversationBook();
        
        for (; true;) {
            System.out.println("상품추가(1), 상품조회(2), 종료(3)");
            int menu = keyboard.nextInt();
            
            if (menu == 1) {// 상품입력
                상품입력(prods);
            } else if (menu == 2) {// 상품출력
                상품출력(prods);
            } else if (menu == 3) {// 종료
                break;
            } else {
                System.out.println("잘못된 입력");
            }
            
        }
        
    }
    
    // 상품 종류 입력 받아 배열에 ㅈㅓ장하는 코드를 추가
    private static void 상품입력(Product[] prods) {
        
        // 상품 추가 메뉴 출력
        System.out.println("상품 종류 책(1), 음악CD(2), 회화책(3)");
        int menu = keyboard.nextInt();
        
        
        if (menu == 1) {// 상품입력
            prods[roomid] = new Book();
            roomid = roomid+1;
        } else if (menu == 2) {// 상품출력
            CompactDisc cd = new CompactDisc();
            System.out.println("상품 설명"); cd.set상품설명(keyboard.next());
            System.out.println("생산자"); cd.set생산자(keyboard.next());
            System.out.println("가격"); cd.set가격(keyboard.next());
            System.out.println("앨범제목"); cd.set앨범제목(keyboard.next());
            System.out.println("가수"); cd.set가수이름(keyboard.next());
            roomid = roomid+1;
        } else if (menu == 3) {// 종료
            prods[roomid] = new ConversationBook();
            roomid = roomid+1;
        }
    }
    
    private static void 상품출력(Product[] prods) {
        // 출력
        for (int i = 0; i <= prods.length - 1; i = i + 1) {
            System.out.println(prods[i].toString());
            
        }
    }
}
