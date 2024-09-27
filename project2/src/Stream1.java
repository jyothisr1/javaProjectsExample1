import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
//        Stream<Integer> names=Stream.of(1,2,3);
//        names.stre
//
//        System.out.println(stream.count());
//        System.out.println(stream.Stream().count());

        List<String> names=List.of("john","ss","sd");
        names.stream().forEach((name)-> System.out.println(name));
        Function<String, String> mapToUpper = (s) -> s.toUpperCase();
        names.stream().map(mapToUpper).forEach((name)-> System.out.println(name));

        names.stream().filter(name->name.equals("joh")).findFirst().ifPresentOrElse(
                (name)-> System.out.println(name+"is present"),
                ()-> System.out.println("not found"));
//        names.stream()
//                .filter(name -> name.equals("Ashley"))
//                .findFirst()
//                .ifPresentOrElse(
//                        (name) -> System.out.println(name + " is present"),
//                        () -> System.out.println("Not present"));

//        System.out.println(names.stream().filter(name->name.equals("john")));

        names.stream().filter(name->name.equals("joh")).findAny().orElseThrow(()-> new RuntimeException("error"));
    }
}
