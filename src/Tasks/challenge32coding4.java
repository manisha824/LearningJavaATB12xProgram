package Tasks;

import static Tasks.challenge28coding3.validateAge;

public class challenge32coding4 {
            public static void validateAge(int age) throws challenge27coding2.InvalidAgeException {
                if (age < 18) {
                    throw new challenge27coding2.InvalidAgeException("Age must be at least 18. Provided age: " + age);
                }
                System.out.println("Age is valid: " + age);
            }

            public static void main(String[] args) {
                try {
                    validateAge(16);  // Will throw InvalidAgeException
                } catch (challenge27coding2.InvalidAgeException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                }

                try {
                    validateAge(21);  // Valid age
                } catch (challenge27coding2.InvalidAgeException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                }
            }
        }




