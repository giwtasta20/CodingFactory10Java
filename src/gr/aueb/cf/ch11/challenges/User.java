package gr.aueb.cf.ch11.challenges;

public class User {

    private long id;
    private String firstname;
    private String lastname;

    public User() {}

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "User { id: " + id + ", firstname: '" + firstname + "', lastname: '" + lastname + "' }";

    }
}
