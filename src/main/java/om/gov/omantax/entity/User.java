package om.gov.omantax.entity;

import java.util.Arrays;

public class User {
    private int id;
    private String username;
    private String password;
    private String[] roles = new String[5];
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                ", email='" + email + '\'' +
                '}';
    }

    public User() {
        this(-1, "default","default",  new String[]{"ADMIN", "USER"}, "dea");
    }

    public User(int id, String username, String password, String[] roles, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRoles() {
        return roles;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
