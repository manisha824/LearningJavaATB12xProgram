package Tasks;

public class challenge4coding {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Initial value of i: " + i);

        // Pre-increment (++i)
        System.out.println("\nPre-increment (++i):");
        System.out.println("Value before operation: " + i);
        System.out.println("Operation result: " + (++i));  // increments first, then returns
        System.out.println("Value after operation: " + i);

        // Reset i
        i = 5;

        // Post-increment (i++)
        System.out.println("\nPost-increment (i++):");
        System.out.println("Value before operation: " + i);
        System.out.println("Operation result: " + (i++));  // returns first, then increments
        System.out.println("Value after operation: " + i);

        // Reset i
        i = 5;

        // Pre-decrement (--i)
        System.out.println("\nPre-decrement (--i):");
        System.out.println("Value before operation: " + i);
        System.out.println("Operation result: " + (--i));  // decrements first, then returns
        System.out.println("Value after operation: " + i);

        // Reset i
        i = 5;

        // Post-decrement (i--)
        System.out.println("\nPost-decrement (i--):");
        System.out.println("Value before operation: " + i);
        System.out.println("Operation result: " + (i--));  // returns first, then decrements
        System.out.println("Value after operation: " + i);
    }
}


