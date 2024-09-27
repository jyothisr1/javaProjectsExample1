import javax.sound.sampled.EnumControl;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for (int i : numbers) {

        }
        NavigableSet<Integer> descendingSet = numbers.descendingSet();
        for(int i: descendingSet){
            System.out.println(i+" ");
        }

    }
}
