package Tasks.Tasks;

import java.util.Scanner;

public class Check_if_a_Number_is_Prime_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean isprime = true;
        int i=2;
        while(i<=Math.sqrt(num)){
            if(num%i==0){
                isprime=false;
                break;
            }i++;
        }
        if(isprime){
            System.out.println("Number is prime");
        }else System.out.println("Number is not prime");
    }
}
