package Tasks;

public class challenge19coding2 {
    abstract class Employee {
        protected String name;
        protected double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        // Abstract method to calculate salary, to be implemented by subclasses
        public abstract double calculateSalary();

        // Method to display employee info
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Base Salary: $" + baseSalary);
        }
    }

    // Manager subclass
    class Manager extends Employee {
        private double bonus;

        public Manager(String name, double baseSalary, double bonus) {
            super(name, baseSalary);
            this.bonus = bonus;
        }

        // Manager's salary includes base salary plus bonus
        @Override
        public double calculateSalary() {
            return baseSalary + bonus;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Salary: $" + calculateSalary());
        }
    }

    // Developer subclass
    class Developer extends Employee {
        private double overtimePay;

        public Developer(String name, double baseSalary, double overtimePay) {
            super(name, baseSalary);
            this.overtimePay = overtimePay;
        }

        // Developer's salary includes base salary plus overtime pay
        @Override
        public double calculateSalary() {
            return baseSalary + overtimePay;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Overtime Pay: $" + overtimePay);
            System.out.println("Total Salary: $" + calculateSalary());
        }
    }

    public class Main {
        public void main(String[] args) {
            Manager manager = new Manager("Alice", 80000, 15000);
            Developer developer = new Developer("Bob", 70000, 5000);

            manager.displayInfo();
            System.out.println();
            developer.displayInfo();
        }
    }
}

