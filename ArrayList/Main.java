    import java.util.*;


    public class Main {
        public static void main(String[] args) {

            Corporation corporation = new Corporation();
            corporation.setName("IBM Inc");

            Employee employee1 = new Employee("Alex", "Black", 13, 21);
            Employee employee2 = new Employee("John", "White", 15, 45);
            Employee employee3 = new Employee("Kevin", "Richardson", 7, 10);
            Employee employee4 = new Employee("Rian", "Barley", 1, 8);


            corporation.addEmployee(employee1);
            corporation.addEmployee(employee2);
            corporation.addEmployee(employee3);

            System.out.println(corporation.toString());


            int index = corporation.findEmployeeIndex(employee2) + 1;
            System.out.println("\n------------\n" + "John White's index is " + index  + "." + "\n------------\n");


            boolean contains = corporation.hasEmployee(employee1);
            if (contains == true) {
                System.out.println("Yes, the array contains it." + "\n------------\n");
            } else {
                System.out.println("No, the array doesn't contain it." + "\n------------\n");
            }


//            employees.set(1, employee4);
//                for (int i = 0; i < employees.size(); i++){
//                System.out.println(employees.get(i) + "\n");}
//
//            System.out.println("\n------------------------------\n");


           corporation.removeEmployee(2);
            System.out.println(corporation.toString());


        }

    }


