import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>(Arrays.asList(
                new Employee("jyo","123","abc"),
                new Employee("jr","223","adc"),
                new Employee("jy","323","avb")));

        EmployeeFilter ids = (employees1,s) ->{
            for(Employee em:employees){
                if(em.equals(s)){
                    return true;
                }
            }
            return  false;
        };
        EmployeeProcess emm=new EmployeeProcess();

//        ids.test(employees,"123");

    }


}
