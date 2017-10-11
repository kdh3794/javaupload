package java11.st3;

public class Box {
    // 데이터, 필드, 멤버변수
    private int width;
    private int length;
    private int height;
    
    // getter & setter 생성
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    // contructor 생성
    public Box() {
        super();
    }//매개변수가 없는 생성자는 반드시 만들어야 함.
    
    public Box(int width, int length, int height) {
        super();
        this.width = width;
        this.length = length;
        this.height = height;
    }
    // toString() 생성
    
    @Override
    public String toString() {
        return "Box [width=" + width + ", length=" + length + ", height="
                + height + "]";
    }
    
    // getVolumn() 메서드를 만드시오
    // 가로*세로*높이 결과를 리턴
    
    int getVolumn() {
        return width * length * height;
        
    }
    
    // printVolumn() 메서드를 만드시오
    // getVolumn()으로 얻은 결과를 출력
    void printVolumn() {
        int volumn = getVolumn();
        System.out.println(volumn);
        
    }
    
}
