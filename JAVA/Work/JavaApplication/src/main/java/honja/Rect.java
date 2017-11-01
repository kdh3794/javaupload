package honja;

public class Rect {
    private int width ;
    private int height ;
    
    public void area(){
        System.out.println("사각형의 넓이 : " +(width*height));
    }
    public void perimeter(){
        System.out.println("사각형의 둘레 : " + (2*(width+height)));
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
    
    
}