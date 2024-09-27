import java.util.*;

public class c1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("abc");
        list.add("jy");
        int[] num=new int[2];

        new String();

        String[] st=(list.toArray(new String[0]));
//        list.add("k");
////        list.add(null);
//        list.remove(0);
//        List<String> lis=new ArrayList<>();
//        lis.add("jy");
//        list.retainAll(lis);
//        lis.addAll(list);
//        Collections.sort(list);
        System.out.println(st.length);
        for (int i = 0; i< st.length; i++) {

            System.out.println(st[i]);;
        }
//        list.contains("hi");
//        list.toArray();
//        list.get(0).toCharArray();
//        System.out.println(list.toArray());
//        LinkedHashSet<String> set=new LinkedHashSet<>();
//        set.add("Ravi");
//        set.add("Vijay");
//        set.add("Ravi");
//        set.add("Ajay");
//        System.out.println(set);
    }
}
