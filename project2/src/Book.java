//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Book {
    private String title;
    private String author;
    private String publisher;
    private double price;

    public Book(){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b1=new Book();
        b1.setTitle("book1");
        System.out.println(b1.getTitle());
        b1.setAuthor("author1");
        System.out.println(b1.getAuthor());
        b1.setPublisher("publisher1");
        System.out.println(b1.getPublisher());
        b1.setPrice(1234.0);
        System.out.println(b1.getPrice());
    }
}