package Tasks;

public class challenge20coding2 {
    abstract class Shape {
        abstract double getArea();
    }

    // Rectangle subclass
    class Rectangle extends Shape {
        double length, width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        double getArea() {
            return length * width;
        }
    }

    // Circle subclass
    class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Main class to test
    public class Main {
        public void main(String[] args) {
            Shape rect = new Rectangle(5, 3);
            Shape circle = new Circle(4);

            System.out.println("Rectangle Area: " + rect.getArea());
            System.out.println("Circle Area: " + circle.getArea());
        }
    }

}
