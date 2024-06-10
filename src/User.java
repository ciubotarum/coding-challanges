import java.util.Optional;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static Optional<User> findUserByEmail(String email) {
        // Simulate a database lookup
        if (email.equals("user@example.com")) {
            return Optional.of(new User("John Doe", email));
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Optional<User> user = User.findUserByEmail("user@example.com");

        user.ifPresent(u -> System.out.println("User found: " + u.getName())); // Prints "User found: John Doe"

        String email = user.map(User::getEmail).orElse("No email provided");
        System.out.println("Email: " + email); // Prints "Email: user@example.com"
    }
}
