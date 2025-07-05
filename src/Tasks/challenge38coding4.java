package Tasks;

public class challenge38coding4 {
    public class MaxValueFinder {

        public static Integer findMax(Integer[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            Integer max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] != null && array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Integer[] numbers = {4, 10, 12, 17, 11};
            System.out.println("Maximum value is: " + findMax(numbers));
        }
    }

}
