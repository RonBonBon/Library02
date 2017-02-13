package edu.tomer;

/**
 * Created by hackeru on 13/02/2017.
 */
public class Librarian {
    private String firstName;
    private String lastName;

    public Librarian() {
        this.firstName = IO.getString("Enter firstName:");
        this.lastName = IO.getString("Enter lastName:");
    }

    public Librarian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
