package Tasks;

public class challenge3coding {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 10;

        // Comparison operators
        System.out.println("x == y: " + (x == y));   // false
        System.out.println("x == z: " + (x == z));   // true
        System.out.println("x != y: " + (x != y));   // true
        System.out.println("x < y: " + (x < y));     // true
        System.out.println("y > x: " + (y > x));     // true
        System.out.println("x <= z: " + (x <= z));   // true
        System.out.println("y >= z: " + (y >= z));   // true

        // Logical operators
        boolean condition1 = (x < y);
        boolean condition2 = (x == z);

        System.out.println("\nLogical AND (&&):");
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // true && true → true

        System.out.println("\nLogical OR (||):");
        System.out.println("condition1 || (y < x): " + (condition1 || (y < x)));       // true || false → true

        System.out.println("\nLogical NOT (!):");
        System.out.println("!condition1: " + (!condition1));                         // !true → false
        System.out.println("!(x == y): " + (!(x == y)));                             // !(false) → true
    }
}


