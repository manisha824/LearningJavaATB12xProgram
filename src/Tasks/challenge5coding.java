package Tasks;

public class challenge5coding {
    public static void main(String[] args) {
        // Operator Precedence Example
        int a = 10;
        int b = 5;
        int c = 2;

        // Expression without parentheses
        int result1 = a + b * c; // * has higher precedence than +
        System.out.println("Without parentheses: a + b * c = " + result1);
        // Expected: 10 + (5 * 2) = 10 + 10 = 20

        // Expression with parentheses to change precedence
        int result2 = (a + b) * c;
        System.out.println("With parentheses: (a + b) * c = " + result2);
        // Expected: (10 + 5) * 2 = 15 * 2 = 30

        // More complex expression
        int result3 = a + b - c * a / b;
        System.out.println("Complex expression: a + b - c * a / b = " + result3);
        // Expected:
        // c * a = 2 * 10 = 20
        // 20 / b = 20 / 5 = 4 (integer division)
        // a + b = 10 + 5 = 15
        // 15 - 4 = 11

        System.out.println("\n--- Type Casting ---");

        // Implicit casting (widening conversion)
        int intVal = 100;
        double doubleVal = intVal; // int to double is implicit
        System.out.println("Implicit casting: int to double");
        System.out.println("intVal = " + intVal + ", doubleVal = " + doubleVal);

        // Explicit casting (narrowing conversion)
        double pi = 3.14159;
        int intPi = (int) pi; // double to int requires explicit cast
        System.out.println("\nExplicit casting: double to int");
        System.out.println("pi = " + pi + ", intPi = " + intPi);

        // Expression with mixed types and casting
        int x = 5;
        double y = 2.0;

        double result4 = x / y; // x is promoted to double implicitly
        System.out.println("\nMixed types without explicit cast: x / y = " + result4);

        double result5 = (double) x / 2; // explicit cast x to double, 2 is int but promoted
        System.out.println("Mixed types with explicit cast: (double) x / 2 = " + result5);
    }
}


