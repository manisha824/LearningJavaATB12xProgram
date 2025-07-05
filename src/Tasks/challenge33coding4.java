package Tasks;

public class challenge33coding4 {
        public static void main(String[] args) {
            int numerator = 10;
            int denominator = 0;  // Change this to test different cases
            int result = 0;

            try {
                // Attempt division
                result = numerator / denominator;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handle division by zero error
                System.out.println("Error: Division by zero is not allowed.");
            } finally {
                // This block always executes
                System.out.println("Execution of try-catch-finally block completed.");
            }

            System.out.println("Program continues after try-catch-finally.");
        }
    }

