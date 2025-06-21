package Tasks;

public class challenge15coding {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        // Loop from 2 to 100 (1 is not a prime)
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility up to √num for efficiency
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Not a prime
                    break; // Exit inner loop early
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // Move to the next line after printing
    }
}

