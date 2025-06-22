package Tasks;

public class challenge17coding2 {
    static class Employee {
        private int id;
        private String name;
        private double salary;

        // Getter for id
        public int getId() {
            return id;
        }

        // Setter for id
        public void setId(int id) {
            this.id = id;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for salary
        public double getSalary() {
            return salary;
        }

        // Setter for salary
        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Employee emp = new Employee();

            emp.setId(101);
            emp.setName("John");
            emp.setSalary(50000);

            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
        }
    }
}
