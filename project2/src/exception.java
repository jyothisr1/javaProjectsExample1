import java.time.LocalDate;

public class exception {
    public static void main(String[] args) {
//        int a=Integer.parseInt("aa");
//        System.out.println(a);
        LocalDate a=LocalDate.now();
        System.out.println(a);

        System.out.println(a.getDayOfMonth());
        System.out.println(a.getDayOfWeek());
        System.out.println(a.getMonth());

    }
}
