package Tasks.Tasks;

public class challenge28coding3 {
    public static void main(String[] args) {
            // 1. String concatenation
            String first = "Hello";
            String second = " World";
            String concatenated = first + second;  // Using + operator
            System.out.println("Concatenated String: " + concatenated);

            // 2. Length of the string
            int length = concatenated.length();
            System.out.println("Length of concatenated string: " + length);

            // 3. Substring extraction
            // Extract substring starting from index 6 to the end
            String substring1 = concatenated.substring(6);
            System.out.println("Substring from index 6: " + substring1);

            // Extract substring from index 0 to 5 (exclusive)
            String substring2 = concatenated.substring(0, 5);
            System.out.println("Substring from index 0 to 5: " + substring2);

            // 4. Character extraction
            // Get character at index 1
            char ch = concatenated.charAt(1);
            System.out.println("Character at index 1: " + ch);
        }
    }


