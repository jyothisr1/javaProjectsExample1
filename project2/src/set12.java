import java.util.*;

public class set12 {
    public static void main(String[] args) {
        Set<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(1);
        Iterator<Integer> itr= st.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
//        while (itr){
//            System.out.println(itr.next());
//        }

    }
}
