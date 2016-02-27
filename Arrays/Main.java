public class Main {
    public static void main(String[] args) {

        Corporation corporation = new Corporation();
        corporation.setName("IBM Inc");
        corporation.setNumberOfEmployees(2);
        System.out.println(corporation.toString()); 

        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setSurname("Black");
        employee.setGuild(13);
        employee.setCabinet(21);
        corporation.addEmployee(employee);

        employee = new Employee();
        employee.setName("John");
        employee.setSurname("White");
        employee.setGuild(15);
        employee.setCabinet(45);
        corporation.addEmployee(employee);

        

    }
}
