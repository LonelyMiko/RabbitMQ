import javax.persistence.Id;

public class Users {
    private String username_name;
    private String username_pass;
    private String role;
    @Id
    private int id;

    public Users() {
    }

    public String getUsername_name() {
        return username_name;
    }

    public void setUsername_name(String username_name) {
        this.username_name = username_name;
    }

    public String getUsername_pass() {
        return username_pass;
    }

    public void setUsername_pass(String username_pass) {
        this.username_pass = username_pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Users(String username_name, String username_pass, String role) {
        this.username_name = username_name;
        this.username_pass = username_pass;
        this.role = role;
    }


    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
