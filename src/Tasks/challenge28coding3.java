package Tasks;

import Tasks.challenge27coding2.InvalidAgeException;

public class challenge28coding3 {
        // Method to validate age
        public static void validateAge(int age) throws challenge27coding2.InvalidAgeException {
            if (age < 18)
                throw new InvalidAgeException("Age must be at least 18. Provided age: " + age);
            System.out.println("Age is valid: " + age);
        }

        public static void main(String[] args) throws challenge27coding2.InvalidAgeException {
            try {
                validateAge(16);  // This will throw InvalidAgeException
            } catch (challenge27coding2.InvalidAgeException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }

            try {
                validateAge(21);  // This will pass
            } catch (challenge27coding2.InvalidAgeException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }

