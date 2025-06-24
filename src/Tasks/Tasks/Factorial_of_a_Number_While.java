package Tasks.Tasks;

public class Factorial_of_a_Number_While {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of  "+num+"  is ="+fact);
    }
}
