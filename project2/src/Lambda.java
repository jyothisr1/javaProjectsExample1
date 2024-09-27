@FunctionalInterface
interface StringOperation{
    String operation(String a);
}

public class Lambda {
    public static void main(String[] args) {
        StringOperation upper=(st) ->st.toUpperCase();
        StringOperation lower=(l) ->l.toLowerCase();
//        StringOperation ts=(t) -> System.out.println(t.toUpperCase());
        System.out.println(upper.operation("hello"));
        System.out.println(lower.operation("WORLD"));
//        ts.operation("hello");
    }
}
