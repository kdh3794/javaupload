package java17.st1shape;

public class Rectangle extends Shape{
    public int width=0;
    public int height=0;
    
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
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
    public Rectangle() {
        super();
    }
    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    public void getShape(){
        return;
        
    }
    public void draw(){
        
    }
}
