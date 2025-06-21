package Tasks;

public class challenge2coding {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic operators
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Integer division
        System.out.println("a % b = " + (a % b));  // Modulus (remainder)

        // Assignment operators
        int c = 5;
        System.out.println("\nInitial value of c = " + c);

        c = 10; // simple assignment
        System.out.println("After c = 10: " + c);

        c += 5; // equivalent to c = c + 5
        System.out.println("After c += 5: " + c);

        c -= 3; // equivalent to c = c - 3
        System.out.println("After c -= 3: " + c);

        c *= 2; // equivalent to c = c * 2
        System.out.println("After c *= 2: " + c);

        c /= 4; // equivalent to c = c / 4
        System.out.println("After c /= 4: " + c);
    }
}


