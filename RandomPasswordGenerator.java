import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}<>?/";

        String characters = "";

        System.out.println("===== RANDOM PASSWORD GENERATOR =====");

        System.out.print("Enter Password Length: ");
        int length = sc.nextInt();

        System.out.print("Include Uppercase Letters? (Y/N): ");
        char upper = sc.next().toUpperCase().charAt(0);

        System.out.print("Include Lowercase Letters? (Y/N): ");
        char lower = sc.next().toUpperCase().charAt(0);

        System.out.print("Include Numbers? (Y/N): ");
        char number = sc.next().toUpperCase().charAt(0);

        System.out.print("Include Special Characters? (Y/N): ");
        char special = sc.next().toUpperCase().charAt(0);

        if (upper == 'Y') {
            characters += upperCase;
        }

        if (lower == 'Y') {
            characters += lowerCase;
        }

        if (number == 'Y') {
            characters += numbers;
        }

        if (special == 'Y') {
            characters += specialChars;
        }

        if (characters.isEmpty()) {
            System.out.println("Error: Select at least one character type.");
        } else {
            String password = "";

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characters.length());
                password += characters.charAt(index);
            }

            System.out.println("\nGenerated Password: " + password);
        }

        sc.close();
    }
}