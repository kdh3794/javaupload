package java14.st4shpae;

public class Rectangle extends Shape {
    
    //필드
    private int width  = 0;
    private int height = 0;
    
    //getter & setter
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
    //toString
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", getX()="
                + getX() + ", getY()=" + getY() + ", getColor()=" + getColor()
                + "]";
    }
    
    //Constructor
    //매개변수가 없는 생성자는 반드시 만들어야 한다.
    public Rectangle() {
        super();
        System.out.println("Rectangle()");
        
    }
    public Rectangle(int x, int y, String color) {
        super(x, y, color);
        System.out.println("Rectangle(int x, int y, String color)");
    
    }// s, y, color, width, height를 매개변수로 넘겨받는 Rectangle 생성자를 만드시오.
    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle(int x, int y, String color, int width, int height)");
    }
    //width, height를 매개변수로 넘겨받는 생성자를 Rectangle 만드시오.
    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
        System.out.println("Rectangle(int width, int height)");
    }
        
    
    
    
    
   
 

  
    
}
