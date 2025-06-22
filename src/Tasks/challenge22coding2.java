package Tasks;

public class challenge22coding2 {
    interface Flyable {
        void fly();
    }

    // Swimmable interface
    interface Swimmable {
        void swim();
    }

    // Duck class implementing both interfaces
    class Duck implements Flyable, Swimmable {
        public void fly() {
            System.out.println("Duck is flying.");
        }

        public void swim() {
            System.out.println("Duck is swimming.");
        }
    }

    // Main class to test
    public class Main {
        public void main(String[] args) {
            Duck d = new Duck();
            d.fly();   // Output: Duck is flying.
            d.swim();  // Output: Duck is swimming.
        }
    }

}
