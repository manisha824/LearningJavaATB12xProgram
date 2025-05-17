package Tasks;

public class Task5 {
    public static void main(String[] args) {
        int age = 45; // You can change this value to test different ages

        String category = (age < 18) ? "Minor"
                : (age <= 65) ? "Adult"
                : "Senior";

        System.out.println("Age: " + age + " → " + category);
    }
}
