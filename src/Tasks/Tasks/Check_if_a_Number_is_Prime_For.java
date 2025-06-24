package Tasks.Tasks;

import java.util.Scanner;

public class Check_if_a_Number_is_Prime_For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }if(isprime){
            System.out.println("Number is prime");
        }else System.out.println("Number is not prime");
    }
    }


