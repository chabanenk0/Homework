public class Employee {

    protected String name;
    protected String surname;
    protected int guild;
    protected int cabinet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGuild() {
        return guild;
    }

    public void setGuild(int guild) {
        this.guild = guild;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public String toString() {
        return  " Pay salary for employee " + this.name + " " + this.surname + ", from guild " + this.guild + ", cabinet " + this.cabinet + ".";
    }
}
