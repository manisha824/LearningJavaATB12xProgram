package Tasks;

public class challenge1coding {
    public static void main(String[] args) {
        // Integer types
        byte b = 100;           // 8-bit integer
        short s = 30000;        // 16-bit integer
        int i = 1_000_000;      // 32-bit integer (underscore for readability)
        long l = 10000000000L;  // 64-bit integer (note the 'L' suffix)

        // Floating-point types
        float f = 3.14f;        // 32-bit floating-point (note the 'f' suffix)
        double d = 3.1415926535; // 64-bit floating-point

        // Character type
        char c = 'A';           // single character enclosed in single quotes

        // Boolean type
        boolean bool = true;    // true or false

        // String type (not a primitive, but very commonly used)
        String str = "Hello, Java!";

        // Print the variables
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
        System.out.println("String value: " + str);
    }
}

