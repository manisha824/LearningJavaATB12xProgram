package Tasks;

public class challenge40coding4 {
    public class ExceptionPropagationDemo {

        void method3() {
            int result = 10 / 0;  // ArithmeticException occurs here
        }

        void method2() {
            method3();  // Exception propagates here if not caught in method3()
        }

        void method1() {
            try {
                method2();  // Exception propagates here if not caught in method2()
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in method1: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
            obj.method1();
            System.out.println("Program continues after exception handling.");
        }
    }

}
