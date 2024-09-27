public class BookAuthor {
    private String authorname;
    private String book;
    private String publisher;

    public BookAuthor() {
    }

    public BookAuthor(String authorname, String book, String publisher) {
        this.authorname = authorname;
        this.book = book;
        this.publisher = publisher;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
