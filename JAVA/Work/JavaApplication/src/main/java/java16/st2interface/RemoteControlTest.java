package java16.st2interface;

public class RemoteControlTest {
    
    public static void main(String[] args) {
        Television t1 = new Television();
        t1.turnOff();
        t1.turnOff();
        
        Fridge f1 = new Fridge();
        f1.turnOff();
        f1.turnOn();
               
        
        
        RemoteControl obj = new Television();
        obj.turnOn();
        obj.turnOff();
        
        obj = new Fridge();
        obj.turnOn();
        obj.turnOff();
        
        
    }
}
