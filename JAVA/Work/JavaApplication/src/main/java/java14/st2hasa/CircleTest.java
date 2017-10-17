package java14.st2hasa;

public class CircleTest {
    public static void main(String[] args){

       //c1
        
        Point center = new Point();
        center.setX(25);
        center.setY(78);
        
       Circle c1 = new Circle();
       c1.setRadius(10);
     
       
       c1.setCenter(center);  
       
       //c2
       Circle c2 = new Circle();
       c2.setRadius(10);
       center = new Point(25, 75);
       c2.setCenter(center);//==c2.setCenter(new Point(25,78));
       
       //c3
       Circle c3 = new Circle(10, new Point(25, 78));
       System.out.println(c1.toString( ));
       System.out.println(c2.toString( ));
       System.out.println(c3.toString( ));
    }
}
