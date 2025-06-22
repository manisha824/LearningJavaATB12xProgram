package Tasks;

public class challenge26coding2 {
    public static void main(String[] args) {
        try {
            // Try to access and parse command-line arguments
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            // Try to perform division
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two numbers as arguments.");
        }
    }
}

