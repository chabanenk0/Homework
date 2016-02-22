public class Corporation {

    protected String name;
    public int salaryForEmployee;
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

    public int getSalaryForEmployee() {
        return number;
    }

    public void setSalaryForEmployee(int salaryForEmployee) {
        this.salaryForEmployee = salaryForEmployee;
    }

    public void addEmployee(Employee employee) {
        this.employeesArray[this.number] = employee;
        this.number++;
    }

    public String toString() {
        String result = this.name + " ready to pay salary in amount of " + this.salaryForEmployee + ".";
        for(int i = 0; i < this.number; i++) {
            result += this.employeesArray[i].toString();
        }

        return result;
    }
}
