package Tasks;

public class challenge16coding2 {
    static class Student {
        String name;
        int rollNo;
        String section;

        // Constructor to initialize student details
        Student(String name, int rollNo, String section) {
            this.name = name;
            this.rollNo = rollNo;
            this.section = section;
        }

        // Method to print student details
        void printDetails() {
            System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Section: " + section);
        }
    }
    //You can create instances and call the method like this:

    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student("Alice", 101, "A");
            Student s2 = new Student("Bob", 102, "B");

            s1.printDetails();
            s2.printDetails();
        }
    }
}




