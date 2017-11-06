package 강동훈;

public class Oper {
    int add=0;
    int minus=0;
    int mul=0;
    double div ;
    public int getAdd() {
        return add;
    }
    public void setAdd(int add) {
        this.add = add;
    }
    public int getMinus() {
        return minus;
    }
    public void setMinus(int minus) {
        this.minus = minus;
    }
    public int getMul() {
        return mul;
    }
    public void setMul(int mul) {
        this.mul = mul;
    }
    public double getDiv() {
        return div;
    }
    public void setDiv(double div) {
        this.div = div;
    }
    @Override
    public String toString() {
        return "Oper [add=" + add + ", minus=" + minus + ", mul=" + mul
                + ", div=" + div + "]";
    }
    public Oper(int add, int minus, int mul, double div) {
        super();
        this.add = add;
        this.minus = minus;
        this.mul = mul;
        this.div = div;
    }
    public Oper() {
        super();
    }
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
    
    public static int minus(int x, int y) {
        int result = x - y;
        return result;
    }
    
    public static int mul(int x, int y) {
        int result = x * y;
        return result;
    }
    
    public static double div(int x, int y) {
        double result = (double)x / y;
        return result;
    } 
    
    
    
}
