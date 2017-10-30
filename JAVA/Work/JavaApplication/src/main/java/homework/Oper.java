package homework;

public class Oper {
 int x;
 int y;
 int add;
 int minus;
 public int getX() {
    return x;
}
public void setX(int x) {
    this.x = x;
}
public Oper() {
    super();
}
public Oper(int x, int y, int add, int minus, int mul, double div) {
    super();
    this.x = x;
    this.y = y;
    this.add = add;
    this.minus = minus;
    this.mul = mul;
    this.div = div;
}
@Override
public String toString() {
    return "Oper [x=" + x + ", y=" + y + ", add=" + add + ", minus=" + minus
            + ", mul=" + mul + ", div=" + div + "]";
}
public int getY() {
    return y;
}
public void setY(int y) {
    this.y = y;
}
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
int mul;
    double div;
}
