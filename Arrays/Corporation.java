public class Corporation {

    protected String name;
    protected int numberOfEmployees;
    protected Employee[] employeesArray;
    protected int number;

    public Corporation() {
        this.employeesArray = new Employee[100];
        this.number = 0;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {

        return number;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void addEmployee(Employee employee) {
        this.employeesArray[this.number] = employee;
        this.number++;
    }

    public String toString() {
        String result = this.name + " ready to pay salary for " + this.numberOfEmployees + " employees." + "\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.employeesArray[i].toString();
        }

        return result;
    }
}
