package Tasks.Tasks;

import java.util.Scanner;

public class Multiplication_Table_of_a_Given_Number_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table value");
        int num = sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num+"x"+i+"="+num*i);
            i++;
        }

    }
}
