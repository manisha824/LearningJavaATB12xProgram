package Tasks;

public class Task4 {
    public static void main(String[] args) {
        int n1 = 25;
        int n2 = 42;
        int n3 = 17;

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        System.out.println("The largest number is: " + max);
    }
}
