import java.util.LinkedList;
import java.util.List;

public class CharIsDigit {
    public static void main(String[] args)
    {

        // two characters
        StringBuilder rs=new StringBuilder();
//        List<String> lr=new LinkedList<>();
        List<String> li=new LinkedList<>();
        li.add("1st");
        li.add("13th");
        li.add("14th");

        for (int i = 0; i <3; i++) {
            if(Character.isDigit(li.get(i).charAt(0)) &&Character.isDigit(li.get(i).charAt(1))){
                rs.append(li.get(i).charAt(0));
                rs.append(li.get(i).charAt(1));
                rs.append(" ");
            }
        }
        System.out.println(rs);

    }
}
