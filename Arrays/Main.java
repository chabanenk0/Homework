public class Main {
    public static void main(String[] args) {

        Corporation corporation = new Corporation();
        corporation.setName("IBM Inc");
        corporation.setSalaryForEmployee(10000);
        System.out.println(corporation.toString());

        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setSurname("Black");
        employee.setGuild(13);
        employee.setCabinet(21);
        corporation.addEmployee(employee);
        System.out.println(employee.toString());

    }
}
