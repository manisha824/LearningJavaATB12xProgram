package Tasks.Tasks;

import java.util.Scanner;

public class RightAngled_Triangle_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int num = sc.nextInt();
        int i=1;

        while(i<=num){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
