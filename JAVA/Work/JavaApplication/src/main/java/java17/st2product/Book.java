package java17.st2product;

public class Book extends Product{
    
    private String ISBN;
    private String author;
    private String bookName;
    
    public Book() {
        super() ;
    }
    
    public Book(int id, String describe, String producer, int price,
            String iSBN, String author, String bookName) {
        super(id, describe, producer, price);
        ISBN = iSBN;
        this.bookName = bookName;
    }
    
    public void show(){
        super.show();
        System.out.println("ISBN >> " + ISBN);
        System.out.println("저자 >> " + author);
        System.out.println("책 제목 >>" + bookName);
    }
            
    

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getBt() {
        return bookName;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
       this.bookName = bookName;
        
    }
   
    
    
}
