    import java.util.*;


    public class Main {
        public static void main(String[] args) {

            Corporation corporation = new Corporation();
            corporation.setName("IBM Inc");

            Employee employee1 = new Employee("Alex", "Black", 13, 21);
            Employee employee2 = new Employee("John", "White", 15, 45);
            Employee employee3 = new Employee("Kevin", "Richardson", 7, 10);
            Employee employee4 = new Employee("Rian", "Barley", 1, 8);


           ArrayList employees =  new ArrayList();
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);

            corporation.setSize(employees.size());

            System.out.println(corporation.toString());

            List<Employee> emp = corporation.addEmployeeList(employees);

            for (Employee employee : emp)
                System.out.println(employee + "\n");



            int index = employees.indexOf(employee2) + 1;
            System.out.println("\n------------\n" + "John White's index is " + index  + "." + "\n------------\n");


            boolean contains = employees.contains(employee1);
            if (contains == true) {
            System.out.println("Yes, the array contains it." + "\n------------\n");}
                else System.out.println("No, the array doesn't contain it." + "\n------------\n");


            employees.set(1, employee4);
                for (int i = 0; i < employees.size(); i++){
                System.out.println(employees.get(i) + "\n");}

            System.out.println("\n------------------------------\n");


           employees.remove(2);
            for (int i = 0; i < employees.size(); i++){
                System.out.println(employees.get(i) + "\n");} 


        }

    }


