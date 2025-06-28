package Tasks.Tasks;

public class challenge30coding3 {
    private static final int ITERATIONS = 100_000;

    public static void main(String[] args) {
        System.out.println("Benchmarking string concatenation methods with " + ITERATIONS + " iterations.\n");

        // 1. Using String concatenation with += operator
        long startTime = System.nanoTime();
        String result1 = concatWithString();
        long endTime = System.nanoTime();
        System.out.printf("String concatenation with '+=' took: %.3f seconds%n", (endTime - startTime) / 1_000_000_000.0);

        // 2. Using StringBuilder
        startTime = System.nanoTime();
        String result2 = concatWithStringBuilder();
        endTime = System.nanoTime();
        System.out.printf("String concatenation with StringBuilder took: %.3f seconds%n", (endTime - startTime) / 1_000_000_000.0);

        // 3. Using StringBuffer
        startTime = System.nanoTime();
        String result3 = concatWithStringBuffer();
        endTime = System.nanoTime();
        System.out.printf("String concatenation with StringBuffer took: %.3f seconds%n", (endTime - startTime) / 1_000_000_000.0);

        // Optional: Verify results length to avoid optimization skipping
        System.out.println("\nResult lengths:");
        System.out.println("String length: " + result1.length());
        System.out.println("StringBuilder length: " + result2.length());
        System.out.println("StringBuffer length: " + result3.length());
    }

    private static String concatWithString() {
        String s = "";
        for (int i = 0; i < ITERATIONS; i++) {
            s += "a";
        }
        return s;
    }

    private static String concatWithStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    private static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }
        return sb.toString();
    }
}
