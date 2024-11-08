import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined login credentials
        String validUsername = "Coded";
        String validPassword = "Coded123";
        boolean userLoggedIn = false;

        for (int loginAttempts = 0; !userLoggedIn; loginAttempts++) {
            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.printf("Welcome %s!%n", username);
                    userLoggedIn = true;
                }
                // If failed to log in while on last attempt.
                else if (loginAttempts == 4) {
                    throw new Exception("Maximum attempts exceeded.");
                } else {
                    // If failed to log in
                    throw new Exception("Invalid Credentials");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                if (e.getMessage().equals("Maximum attempts exceeded."))
                    break;
            }
        }
        scanner.close();
    }
}