import java.util.ArrayList;
import java.util.List;

public class listoflist {
    static void matrix(List<List<Integer>> A){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int temp=
                A.get(j).set(i, A.get(i).get(j));
                System.out.println(A);

            }

        }
        System.out.println(A);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(1,2,3)));
        list.add(new ArrayList<>(List.of(4,5,6)));
        list.add(new ArrayList<>(List.of(7,8,9)));

        matrix(list);


//        for (int i = 0; i < 3; i++) {
//            list.add(i, new ArrayList<>());
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(6);
//            }
//        }
        System.out.println(list);
    }
}