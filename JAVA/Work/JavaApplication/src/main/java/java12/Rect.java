package java12;

public class Rect {
    private int width;
    private int height;
    
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
    
    public Rect() {
        super();
    }
    
    public Rect(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    
    @Override
    public String toString() {
        return "Rect [width=" + width + ", height=" + height + "]";
    }
    
    int getArea() {
        return width * height;
    }
    
    int getPerimeter() {
        return (width + height) * 2;
    }
    
    void printArea() {
        int Area = getArea();
        System.out.println("면적은 : " + Area);
    }
    
    void printPerimeter() {
        int Perimeter = getPerimeter();
        System.out.println("둘레는 : " + Perimeter);
    }
    
}
