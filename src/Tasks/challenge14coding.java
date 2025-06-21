package Tasks;

import java.util.Scanner;

public class challenge14coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get pattern size from user
        System.out.print("Enter the number of rows for the patterns: ");
        int rows = scanner.nextInt();

        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print i stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }

        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}



