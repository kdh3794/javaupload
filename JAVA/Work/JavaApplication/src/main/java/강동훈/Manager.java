package 강동훈;

public class Manager extends Employee{
    private int bounus;

    public int getBounus() {
        return bounus;
    }

    public void setBounus(int bounus) {
        this.bounus = bounus;
    }

    public Manager() {
        super();
    }

    


    @Override
    public String toString() {
        return "Manager [bounus=" + bounus + ", getBounus()=" + getBounus()
                + ", toString()=" + super.toString() + "]";
    }

    public Manager(String name, String addr, int salary, int rrn) {
        super(name, addr, salary, rrn);
    }

    public Manager(String name, String addr, int salary, int rrn, int bounus) {
        super(name, addr, salary, rrn);
        this.bounus = bounus;
    }
 
    public void test(){
        String info = "name : " + super.getName();
        info = info + ", address" + super.getAddr();
        info = info + ", Salary:" + super.salary;
        info = info + ", rrn" + super.getRrn();
        
        
        System.out.println(info);
    }
  

    
    
}
