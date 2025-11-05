public class Person {
    private String firstname;
    private String lastname;
    private int birthyear;

    public Person(String lastname, String firstname, int birthyear) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
}
