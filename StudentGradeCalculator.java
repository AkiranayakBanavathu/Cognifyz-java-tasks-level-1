import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        System.out.print("Enter the number of grades: ");
        int n = sc.nextInt();

        double[] grades = new double[n];
        double sum = 0;

        // Input grades
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        // Calculate average
        double average = sum / n;

        // Display grades
        System.out.println("\nEntered Grades:");
        for (int i = 0; i < n; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        // Display average
        System.out.printf("\nAverage Grade: %.2f%n", average);

        sc.close();
    }
}
