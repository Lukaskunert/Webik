package CZ.educanet.webik;

import org.graalvm.compiler.lir.LIRInstruction;

public class Users {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;


    public Users(String firstName, String lastName, String email, String password, String username) {
        this.FirstName = firstName;
        this.LastName = LastName;
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public String getFirstName() {
        return FirstName;
    }public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }public String getLastName() {
        return LastName;
    }public void setlastName(String lastName) {
        this.lastName = lastName;
    }public String getUsername() {
        return username;
    }public void setUsername(String username) {
        this.username = username;
    }public String getEmail() {
        return email;
    }public void setEmail(String email) {
        this.email = email;
    }public String getPassword() {
        return password;
    }public void setPassword(String password) {
        this.password = password;
    }
}
}
