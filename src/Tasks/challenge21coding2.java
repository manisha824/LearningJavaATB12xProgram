package Tasks;

public class challenge21coding2 {
    interface Drawable {
        void draw();
    }

    // Circle class implementing Drawable
    class Circle implements Drawable {
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Rectangle class implementing Drawable
    class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    // Main class to test
    public class Main {
        public void main(String[] args) {
            Drawable d1 = new Circle();
            Drawable d2 = new Rectangle();

            d1.draw();  // Output: Drawing a Circle
            d2.draw();  // Output: Drawing a Rectangle
        }
    }

}
