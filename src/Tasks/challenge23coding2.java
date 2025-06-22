package Tasks;

public class challenge23coding2 {
    class Calculator {
        // Add two integers
        int add(int a, int b) {
            return a + b;
        }

        // Add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Add two doubles
        double add(double a, double b) {
            return a + b;
        }
    }

    public class Main {
        public void main(String[] args) {
            Calculator calc = new Calculator();

            System.out.println("add(int, int): " + calc.add(5, 10));
            System.out.println("add(int, int, int): " + calc.add(2, 4, 6));
            System.out.println("add(double, double): " + calc.add(3.5, 4.2));
        }
    }

}
