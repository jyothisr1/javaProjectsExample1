import java.time.LocalDate;

public class date {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2000,07,9);
        LocalDate now=LocalDate.now();
        System.out.println(now);
        System.out.println(d);
        int y1=d.getYear();
        int y2=now.getYear();
        int age=y2-y1;
        System.out.println(age);
    }
}
