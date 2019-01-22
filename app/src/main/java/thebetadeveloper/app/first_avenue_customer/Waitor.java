package thebetadeveloper.app.first_avenue_customer;

public class Waitor {
    String username,password;
    public Waitor(){}
    public Waitor(String name,String pass)
    {
        username=name;
        password=pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}