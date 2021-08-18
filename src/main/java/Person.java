import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private int personalID;

    public Person(String name, String surname, int personalID) {
        this.name = name;
        this.surname = surname;
        this.personalID = personalID;
    }

    public Person() {
    }

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

    public int getPersonalID() {
        return personalID;
    }

    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalID=" + personalID +
                '}';
    }
}
