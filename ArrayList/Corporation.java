import java.util.ArrayList;
import java.util.List;

public class Corporation {


    protected String name;
    protected List<Employee> employeeList = new ArrayList<>();


    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return employeeList.size();
    }

    public List<Employee> addEmployeeList(List<Employee> employees) {
        for (Employee employee : employees) {
            employeeList.add(employee);
        }
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(String employeeName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(employeeName))
            employeeList.remove(employee);
        }
    }

    public void removeEmployee(int index) {
        employeeList.remove(index);
    }

    public getEmployeeByIndex (int index) {
        employeeList.get(index)
    }

    public int findEmployeeIndex(Employee employee) {
        employeeList.indexOf(employee);
    }

    public boolean hasEmployee(Employee employee) {
        employeeList.contains(employee);
    }



    public String toString() {
        String result = this.name + " ready to pay salary for " + this.size + " employees." + "\n--------\n";
        for (Employee employee : emp) {
            result = result + employee.toString() + "\n";
        }

        return result;
    }
}
