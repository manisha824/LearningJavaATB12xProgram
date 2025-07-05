package Tasks;

public class challenge35coding4 {
        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};

                // This will throw ArrayIndexOutOfBoundsException
                System.out.println("Accessing element at index 5: " + numbers[5]);

                // This line will not be reached if exception occurs above
                int result = 10 / 0;  // This would throw ArithmeticException
                System.out.println("Result: " + result);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } finally {
                System.out.println("Finally block executed.");
            }

            System.out.println("Program continues after try-catch-finally.");
        }
    }

