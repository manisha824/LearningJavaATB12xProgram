package Tasks.Tasks;

public class Write_Using_For_loop_and_While_Loop {
    public static void main(String[] args) {
        int sum=0;

        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("Total sum: "+sum);
    }
}
