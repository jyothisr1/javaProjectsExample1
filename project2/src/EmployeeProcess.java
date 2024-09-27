import java.util.List;

public class EmployeeProcess {
    public static void fun(List<Employee> employees,EmployeeFilter filter){
        for(Employee e:employees){
            if(filter.test(e,e.getId())){
                e.print(e);
            }
        }
    }
}
