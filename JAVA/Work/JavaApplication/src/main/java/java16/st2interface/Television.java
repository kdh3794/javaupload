package java16.st2interface;

public class Television implements RemoteControl, SerialCommunication{
  
    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("Television.trunOff()");
    }

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("Television.trunOn()");
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        System.out.println("Television.moveLeft()");
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        System.out.println("Television.moveRight()");
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void receive() {
        // TODO Auto-generated method stub
        
    }
    
    
}
