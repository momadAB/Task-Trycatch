import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined login credentials
        String validUsername = "Coded";
        String validPassword = "Coded123";

        for (int loginAttempts = 0; loginAttempts < 5; loginAttempts++) {
            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.printf("Welcome %s!%n", validUsername);
                    break;
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
            }
        }

        scanner.close();
    }
}