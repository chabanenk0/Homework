public class Employee {

    protected String surname = "Nikonov";
    protected String name =  "Oleg";
    protected String patronymic =  "Alexandrovych";
    protected int guild = 13;
    protected int rank = 26;
    protected int cabinet = 39;
    protected String adress =  "New York City, Second Street, 208, fl.13";

    public void setSurname (String surname) {

        this.surname = surname;
    }


    public String paySalary() {

        return ("Pay salary for " + surname + " " + name + " " + patronymic + " from guild " + guild + " rank " + rank + " cabinet " + cabinet + " in amount of $100000."  );

    }



}
