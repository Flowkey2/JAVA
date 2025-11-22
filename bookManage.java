public class bookManage {
    private String title;
    private String author;
    private boolean isAvailable=true;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        if(isAvailable == false) {
            System.out.println("Book not available.");
            
        } else {
            System.out.println("Book available.");
        }
    }
    class Library {
        public static void main(String[] args) {
            bookManage book = new bookManage();
            book.setTitle("Harry Potter");
            book.setAuthor("J.K. Rowling");
            book.setAvailable(true);

            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Available: " + book.isAvailable());
        }
        
    }
    
}
