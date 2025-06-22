package Tasks;

public class challenge18coding2 {
    static class BankAccount {
        private double balance;

        // Constructor to initialize balance (optional)
        BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                System.out.println("Initial balance can't be negative. Setting to 0.");
                this.balance = 0;
            }
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount);
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        // Method to check balance
        public double getBalance() {
            return balance;
        }
    }
    public class Main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(1000);

            account.deposit(500);
            account.withdraw(300);
            account.withdraw(1500); // Should print "Insufficient balance"
            account.deposit(-50);   // Should print validation message

            System.out.println("Current Balance: " + account.getBalance());
        }
    }

}
