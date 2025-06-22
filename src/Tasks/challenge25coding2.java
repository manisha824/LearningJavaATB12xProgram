package Tasks;

public class challenge25coding2 {
    // Outer class
    class Outer {
        int outerValue = 10;

        // Inner class
        class Inner {
            void display() {
                System.out.println("Accessing outerValue from Inner: " + outerValue);
            }
        }

        // Method in Outer class to use Inner class
        void showInner() {
            Inner inner = new Inner();
            inner.display();
        }
    }

    // Main class to test the interaction
    public class Main {
        public void main(String[] args) {
            Outer outer = new Outer();
            outer.showInner();  // Accessing inner class from outer class
        }
    }
}
