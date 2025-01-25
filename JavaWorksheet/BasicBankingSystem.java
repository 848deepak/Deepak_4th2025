import java.util.Scanner;

public class BasicBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables for banking system
        double totalBalance = 0.0;
        int numberOfAccountHolders = 0;

        // Transaction IDs array
        int[] transactionIds = {101, 102, 103, 104, 105};

        try {
            // Input total balance and number of account holders
            System.out.print("Enter total balance: ");
            totalBalance = scanner.nextDouble();

            System.out.print("Enter the number of account holders: ");
            numberOfAccountHolders = scanner.nextInt();

            // Calculate average balance
            double averageBalance = totalBalance / numberOfAccountHolders;
            System.out.printf("Average account balance: %.2f\n", averageBalance);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero. Number of account holders cannot be zero.");
        }

        try {
            // Input index to access transaction ID
            System.out.print("Enter the index to access transaction ID (0-4): ");
            int index = scanner.nextInt();

            // Access transaction ID
            System.out.println("Transaction ID: " + transactionIds[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter an index between 0 and 4.");
        }

        System.out.println("Thank you for using the Basic Banking System.");
    }
}
