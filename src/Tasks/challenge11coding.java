package Tasks;

import java.util.Scanner;

public class challenge11coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read value of N from user
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Print numbers from 1 to N
        System.out.print("Numbers from 1 to " + N + ": ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}



