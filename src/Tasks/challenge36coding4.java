package Tasks;

public class challenge36coding4 {
        public static void main(String[] args) {
            // Autoboxing: converting int primitive to Integer object automatically
            int primitiveInt = 100;
            Integer boxedInteger = primitiveInt;  // Autoboxing happens here
            System.out.println("Autoboxed Integer: " + boxedInteger);

            // Unboxing: converting Integer object to int primitive automatically
            Integer anotherInteger = new Integer(200);
            int unboxedInt = anotherInteger;  // Unboxing happens here
            System.out.println("Unboxed int: " + unboxedInt);

            // Using Integer in expressions (autoboxing and unboxing combined)
            Integer sum = boxedInteger + anotherInteger;  // Both unboxed, added, then autoboxed
            System.out.println("Sum (Integer): " + sum);
        }
    }

