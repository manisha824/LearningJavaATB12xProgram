package Tasks;

public class challenge34coding4 {
        // Generic method to swap two elements in an array
        public static <T> void swap(T[] array, int i, int j) {
            if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length) {
                throw new IllegalArgumentException("Invalid array or indices");
            }

            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Example usage
        public static void main(String[] args) {
            String[] fruits = {"Apple", "Banana", "Cherry"};
            System.out.println("Before swap: ");
            for (String fruit : fruits) {
                System.out.print(fruit + " ");
            }

            swap(fruits, 0, 2);

            System.out.println("\nAfter swap: ");
            for (String fruit : fruits) {
                System.out.print(fruit + " ");
            }
        }
    }

