package lab4;

class BankAccount {
    String depositorName;
    long accNumber;
    String accType;
    double balance;
    static double rateOfInterest = 4.5; 

    public BankAccount() {
        depositorName = "Unknown";
        accNumber = 0;
        accType = "Savings";
        balance = 0.0;
    }

    public BankAccount(String name, long accNum, String type, double bal) {
        depositorName = name;
        accNumber = accNum;
        accType = type;
        balance = bal;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Success! Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw(double amount) {
        double minBalance = 500.0; 
        
        if (balance - amount >= minBalance) {
            balance = balance - amount;
            System.out.println("Success! Withdrawn: " + amount);
        } else {
            System.out.println("Transaction Failed! Insufficient balance (Min 500 required).");
        }
    }

    public void display() {
        System.out.println("----------------------------");
        System.out.println("Account Number: " + accNumber);
        System.out.println("Name: " + depositorName);
        System.out.println("Type: " + accType);
        System.out.println("Current Balance: " + balance);
    }

    public static void displayRate() {
        System.out.println("Current Bank Interest Rate: " + rateOfInterest + "%");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        
        BankAccount.displayRate();
        
        System.out.println("\n--- Creating Default Account ---");
        BankAccount b1 = new BankAccount();
        b1.display();
        
        System.out.println("\n--- Creating Real Account ---");
        BankAccount b2 = new BankAccount("Aryan", 123456789, "Savings", 1000.0);
        b2.display();
        
        System.out.println("\n Depositing 500...");
        b2.deposit(500);
        
        System.out.println("\n Withdrawing 200...");
        b2.withdraw(200); 
        
        System.out.println("\n Withdrawing 1000...");
        b2.withdraw(1000); 
        
        b2.display();
    }
}