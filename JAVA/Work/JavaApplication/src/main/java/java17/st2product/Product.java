package java17.st2product;

public class Product {
    private int    id;
    private String describe;
    private String producer;
    private int    price;
    
    public Product() {
        
    }
    
    public Product(int id, String describe, String producer, int price) {
        super();
        this.id = id;
        this.describe = describe;
        this.producer = producer;
        this.price = price;
    }
    
    public void show() {
        System.out.println("상품 ID >>" + id);
        System.out.println("상품 설명 >>" + describe);
        System.out.println("생산자 >>" + producer);
        System.out.println("가격 >>" + price);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescribe() {
        return describe;
    }
    
    public void setDescribe(String describe) {
        this.describe = describe;
    }
    
    public String getProducer() {
        return producer;
    }
    
    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}
