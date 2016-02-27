import java.util.ArrayList;
import java.util.List;

public class Corporation {


    protected String name;
    protected int size;
    protected List<Employee> employeeList = new ArrayList<>();

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> addEmployeeList(List<Employee> employees) {
        for (Employee employee : employees) {
            employeeList.add(employee);
        }
        return employeeList;
    }



    public String toString() {
        String result = this.name + " ready to pay salary for " + this.size + " employees." + "\n--------\n";
        return result;
    }
}
