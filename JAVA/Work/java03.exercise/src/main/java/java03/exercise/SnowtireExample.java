package java03.exercise;



public class SnowtireExample {
    
    public static void main(String[] args){
        SnowTire snowTire = new SnowTire();
        Tire tire=snowTire;
        
        snowTire.run();
        tire.run();
    }

}
