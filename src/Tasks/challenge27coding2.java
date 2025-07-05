package Tasks;

public class challenge27coding2 {
    // Custom exception class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Main class
    public class AgeCheck {
        // Method to check age
        void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18.");
            } else {
                System.out.println("Age is valid: " + age);
            }
        }

        public void main(String[] args) {
            try {
                checkAge(16);  // Change the age to test
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
