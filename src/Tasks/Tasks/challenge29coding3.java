package Tasks.Tasks;

public class challenge29coding3 {
    public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = new String("Hello");
            String s4 = "hello";

            // 1. Using == operator (compares references)
            System.out.println("Using == operator:");
            System.out.println("s1 == s2: " + (s1 == s2)); // true, same string literal pool object
            System.out.println("s1 == s3: " + (s1 == s3)); // false, s3 is a new object
            System.out.println();

            // 2. Using equals() method (case-sensitive content comparison)
            System.out.println("Using equals() method:");
            System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
            System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
            System.out.println("s1.equals(s4): " + s1.equals(s4)); // false, different case
            System.out.println();

            // 3. Using equalsIgnoreCase() method (case-insensitive content comparison)
            System.out.println("Using equalsIgnoreCase() method:");
            System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); // true
            System.out.println();

            // 4. Using compareTo() method (lexicographical comparison)
            System.out.println("Using compareTo() method:");
            System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // 0, strings are equal
            System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0, strings are equal
            System.out.println("s1.compareTo(s4): " + s1.compareTo(s4)); // Negative value (since 'H' < 'h')
            System.out.println("s4.compareTo(s1): " + s4.compareTo(s1)); // Positive value (since 'h' > 'H')
        }
    }


