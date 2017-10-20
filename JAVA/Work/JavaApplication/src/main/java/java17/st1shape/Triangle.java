package java17.st1shape;

public class Triangle extends Shape{
    public int base=0;
    public int height=0;
    
    public Triangle() {
        super();
    }

    public Triangle(int base, int height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getShape() {
        
    }
    
    public void draw() {
        
    }
}
