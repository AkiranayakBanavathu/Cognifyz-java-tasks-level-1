import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEMPERATURE CONVERTER =====");

        System.out.print("Enter Temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter Unit (C for Celsius / F for Fahrenheit): ");
        char unit = sc.next().toUpperCase().charAt(0);

        double convertedTemperature;

        if (unit == 'C') {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C = %.2f°F%n", temperature, convertedTemperature);

        } else if (unit == 'F') {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F = %.2f°C%n", temperature, convertedTemperature);

        } else {
            System.out.println("Invalid Unit! Please enter C or F.");
        }

        sc.close();
    }
}