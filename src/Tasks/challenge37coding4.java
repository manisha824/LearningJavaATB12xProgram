package Tasks;

public class challenge37coding4 {
    // Generic Pair class with two type parameters
    public static class Pair<T, U> {
        private T first;
        private U second;

        // Constructor
        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        // Getter for first value
        public T getFirst() {
            return first;
        }

        // Setter for first value
        public void setFirst(T first) {
            this.first = first;
        }

        // Getter for second value
        public U getSecond() {
            return second;
        }

        // Setter for second value
        public void setSecond(U second) {
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair{" + "first=" + first + ", second=" + second + '}';
        }

        // Example usage
        public static void main(String[] args) {
            Pair<String, Integer> pair = new Pair<>("Age", 30);
            System.out.println(pair);  // Output: Pair{first=Age, second=30}

            Pair<Double, Double> coordinates = new Pair<>(12.34, 56.78);
            System.out.println(coordinates);  // Output: Pair{first=12.34, second=56.78}
        }
    }

}
