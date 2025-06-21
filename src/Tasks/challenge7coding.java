package Tasks;

import java.util.Scanner;

public class challenge7coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All three numbers are equal: " + num1);
        } else if (num1 >= num2 && num1 >= num3) {
            // num1 is greater or equal to both num2 and num3
            if ((num1 == num2) || (num1 == num3)) {
                System.out.println("The largest number is " + num1 + " (appears more than once)");
            } else {
                System.out.println("The largest number is " + num1);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            // num2 is greater or equal to both num1 and num3
            if (num2 == num3) {
                System.out.println("The largest number is " + num2 + " (appears more than once)");
            } else {
                System.out.println("The largest number is " + num2);
            }
        } else {
            // num3 is largest
            System.out.println("The largest number is " + num3);
        }

        scanner.close();
    }
}


