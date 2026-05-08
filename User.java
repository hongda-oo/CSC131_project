package app;

public class User {

    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void displayUser() {
        System.out.println("User: " + username);
        System.out.println("Email: " + email);
    }
}