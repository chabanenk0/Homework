public class Employee {
    protected String name;
    protected String surname;
    protected int guild;
    protected int cabinet;
    

    public Employee(String name, String surname, int guild, int cabinet) {
        this.name = name;
        this.surname = surname;
        this.guild = guild;
        this.cabinet = cabinet;
    }

    public String toString() {
        return  "Pay salary for employee " + this.name + " " + this.surname + ", from guild " + this.guild + ", cabinet " + this.cabinet + ".";
    }

}
