package homework;

public class Sumsum {
    private int x;
    private int y;
    private int sum;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    @Override
    public String toString() {
        return "Sumsum [x=" + x + ", y=" + y + ", sum=" + sum + "]";
    }
    public Sumsum(int x, int y, int sum) {
        super();
        this.x = x;
        this.y = y;
        this.sum = sum;
    }
    public Sumsum() {
        super();
    }
    
    public void main(String[] args){
        if (y < x) { // y가 x보다 클 경우를 예상해서 if문을 써줌.
            int tmp = y; // tmp라는 빈공간은 if문 안에다가 선언해줘야 함. 그래야 이 공간에서만 값을 교환.
            y = x;
            x = tmp;
        }
        
        for (int i = x; i <= y; i = i + 1) {
            sum = sum + i;
            
        }
         
        System.out.println(x + "부터" + y + "까지의 합은 " + sum + "입니다");
    
}

}
  
