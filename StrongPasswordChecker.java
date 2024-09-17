import java.util.Scanner;

public class StrongPasswordChecker {
    
    public static boolean isStrongPassword(String password) {
        // Check if the password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        // Iterate through each character of the string
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check for an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }

            // Check for a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                hasLowercase = true;
            }

            // Check for a digit
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }

            // Check for a special character
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                hasSpecialChar = true;
            }
        }

        // Return true only if all conditions are met
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a password
        System.out.print("Enter your password: ");
        String userInput = scanner.nextLine();

        // Check if the password is strong and display the result
        if (isStrongPassword(userInput)) {
            System.out.println("True (Password is strong)");
        } else {
            System.out.println("False (Password is weak)");
        }

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
