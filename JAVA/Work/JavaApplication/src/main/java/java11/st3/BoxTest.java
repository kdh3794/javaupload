package java11.st3;

public class BoxTest {
    public static void main(String[] args) {
        // Box 인스턴스 생성하시오
        Box myBox = new Box(); //myBox는 내가 선언해준 변수
        //Box c = new Box(width, length, height)<--ctrl + space로 두번째꺼로 해서 한번에 입력 가능.
        myBox.setWidth(100); // width : 100
        myBox.setHeight(100); // length: 100
        myBox.setLength(100); // height: 100
        myBox.printVolumn(); // 부피를 계산하고 출력하시오.
        
        // int tmp;
        
    }
}
