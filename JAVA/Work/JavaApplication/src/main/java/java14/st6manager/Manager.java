package java14.st6manager;

public class Manager extends Employee {
    private int bounus = 0;
    
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
        return "Manager [bounus=" + bounus + ", salary=" + salary
                + ", toString()=" + super.toString() + "]";
    }
    
    public Manager(String name, String address, int salary, String rrn,
            int bounus) {
        super(name, address, salary, rrn);
        this.bounus = bounus;
    }
    
    public Manager(String name, String address, int salary, String rrn) {
        super(name, address, salary, rrn);
    }
    
    public void test() {
        
        String info = "name : " + super.getName();
        info = info + ", address" + super.getAddress();
        info = info + ", Salary:" + super.salary;
        info = info + ", rrn" + super.getRrn();
        System.out.println(info);
    }
    
}
