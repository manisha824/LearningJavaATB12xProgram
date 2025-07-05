package Tasks;

public class challenge39coding4 {
        // Generic method to print elements of any type of array
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] strArray = {"Hello", "Java", "Generics"};
            Double[] doubleArray = {1.1, 2.2, 3.3};

            System.out.println("Integer Array:");
            printArray(intArray);

            System.out.println("String Array:");
            printArray(strArray);

            System.out.println("Double Array:");
            printArray(doubleArray);
        }
    }

