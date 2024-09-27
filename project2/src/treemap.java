import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class treemap extends BookAuthor{
    public static void main(String[] args) {
        TreeMap<String,BookAuthor> booksMap=new TreeMap<>();
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
//            Book book = new Book();
            BookAuthor book=new BookAuthor();

            System.out.println("author name");
            String au=s.nextLine();
            book.setAuthorname(au);
            System.out.println("book name");
            String bk=s.nextLine();
            book.setBook(bk);
            System.out.println("publisher name");
            String pb=s.nextLine();
            book.setPublisher(pb);

            booksMap.put(au,book);
        }

        for(Map.Entry<String,BookAuthor> ar : booksMap.entrySet()){
            System.out.println(ar.getValue().getAuthorname());
        }


    }
}
