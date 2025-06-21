package Tasks;

import java.util.Scanner;

public class challenge8coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Leap year condition:
        // divisible by 4 AND (not divisible by 100 OR divisible by 400)
        boolean isLeap = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }

        scanner.close();
    }
}



