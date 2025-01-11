import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings representing numbers
        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();

        try {
            // Convert strings to wrapper classes (Double)
            Double number1 = Double.valueOf(num1);
            Double number2 = Double.valueOf(num2);

            // Perform arithmetic operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = number2 != 0 ? number1 / number2 : Double.NaN; // Handle division by zero

            // Display results
            System.out.println("\nArithmetic Operations:");
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + (number2 != 0 ? division : "Undefined (division by zero)"));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }

        scanner.close();
    }
}