package java17.st2product2;

import java17.st2product2.Product;

public class CompactDisc extends Product {
    private String title;
    private String singer;
    
    public CompactDisc() {
        super();
        
    }
    
   public CompactDisc(int id, String describe, String producer, 
           int price,String title, String singer) {
       super(id, describe, producer, price, title, singer);
       this.title = title;
       this.singer = singer;
   }
    
    public void show() {
        super.show();
        System.out.println("앨범 제목 >>" + title);
        System.out.println("가수 >> " + singer);
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getSinger() {
        return singer;
    }
    
    public void setSinger(String singer) {
        this.singer = singer;
    }
    
}
