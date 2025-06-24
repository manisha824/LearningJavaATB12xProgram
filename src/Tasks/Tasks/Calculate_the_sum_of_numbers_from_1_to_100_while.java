package Tasks.Tasks;

public class Calculate_the_sum_of_numbers_from_1_to_100_while {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("The sum is:"+sum);
    }
}
