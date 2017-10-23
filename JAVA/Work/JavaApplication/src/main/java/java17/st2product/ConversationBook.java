package java17.st2product;

public class ConversationBook extends Book {
    private String language;
    
    public ConversationBook() {
        super();
    }
    
    public ConversationBook(int id, String describe, String producer, int price,
            String iSBN, String author, String bookName, String language) {
        super(id, describe, producer, price, iSBN, author, bookName);
        this.language = language;
    }
    public void show(){
        super.show();
        System.out.println("언어 >>" + language);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
}
