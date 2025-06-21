package Tasks;

import java.math.BigInteger;
import java.util.Scanner;

public class challenge12coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            scanner.close();
            return;
        }

        // Initialize variables
        int i = 1;
        BigInteger factorial = BigInteger.ONE;

        // Calculate factorial using while loop
        while (i <= number) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }

        // Display result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}


