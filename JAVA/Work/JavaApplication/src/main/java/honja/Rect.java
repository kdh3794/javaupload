package honja;

public class Rect {
    private int width;
    private int height;
    
    public int area() {
        return (width * height);
    }
    
    public int perimeter() {
        return (2 * (width + height));
    }
    
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
    
    public void printarea() {
        System.out.println(" 넓이 : " + area());
    }
    
    public void printperimeter() {
        System.out.print(" 둘레 : " + perimeter());
        
    }
    
}
