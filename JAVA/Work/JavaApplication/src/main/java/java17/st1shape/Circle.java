package java17.st1shape;

public class Circle extends Shape{
    
    public int radius=0;
  
  public int getRadius() {
    return radius;
}
public void setRadius(int radius) {
    this.radius = radius;
}

@Override
public String toString() {
    return "Circle [radius=" + radius + "]";
}
public Circle(int radius) {
    super();
    this.radius = radius;
}
public Circle() {
    super();
}

public void getShape(){
    System.out.print("Shape");
      
  }
  public void draw(){
      
  }

}
