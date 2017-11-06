package java22.junit;

public class Rect {
    private int width = 0;
    private int height = 0;
    
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rect [width=" + width + ", height=" + height + "]";
    }
    public Rect(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    public Rect() {
        super();
    }
    public int area(){
        return this.width * this.height; // this. <--나의 ~~   내 소스에 있는 걸 쓴다. 이런 의미 같음. 메소드에서.
    }
    
    public int perimeter(){
        return 2*(this.width + this.height);
    }
    
    public Rect type(){
        return null;
    }
    
    
} //생성자의 주 목적 : 필드에 값을 넣는 것.