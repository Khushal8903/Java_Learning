/*
Q5. Create a banking system to compute interest and transaction charges.
Requirements
Create interface Transactable:
deposit()
withdraw()
Create abstract class BankAccount:
accNo, name, balance
abstract double calculateInterest()
Create 3 child classes:
SavingsAccount
CurrentAccount
FixedDepositAccount
Logic:
Savings → 6% interest
Current → no interest, but 500 monthly maintenance fee
FD → interest based on duration:
< 1 year → 6%
1–3 years → 7.5%
3 years → 8.25%
Withdraw logic:
Savings → allow only if balance ≥ 1000
Current → allow overdraft up to −5000
FD → withdrawal not allowed before maturity
Show:
Interest
Final balance after deposit/withdraw
Account summary
Explanation
This question uses:
Complex conditional logic
Different behavior in each subclass
Polymorphism + abstraction + interface combination
Real banking rules
*/
import java.util.*;


interface Transactable {
    void deposit(double amount);
    void withdraw(double amount);
}

abstract class BankAccount implements Transactable {
    String accNo, name;
    double balance;

    BankAccount(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void showSummary() {
        System.out.println("--------------------------------------------------");
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance        : " + balance);
        System.out.println("--------------------------------------------------");
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.06; // 6%
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println(" Withdrawal denied! Minimum balance of ₹1000 required.");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return 0; 
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println(" Overdraft limit exceeded (limit = -5000)");
        }
    }

    public double monthlyMaintenanceFee() {
        return 500;
    }
}

class FixedDepositAccount extends BankAccount {
    int years;
    boolean matured;

    FixedDepositAccount(String accNo, String name, double balance, int years, boolean matured) {
        super(accNo, name, balance);
        this.years = years;
        this.matured = matured;
    }

    public double calculateInterest() {
        if (years < 1) return balance * 0.06;
        if (years <= 3) return balance * 0.075;
        return balance * 0.0825;
    }

    public void deposit(double amount) {
        System.out.println("Cannot deposit into FD after creation.");
    }

    public void withdraw(double amount) {
        if (!matured) {
            System.out.println("Withdrawal not allowed before maturity!");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Fixed Deposit Account");
        int type = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Account Number:");
        String accNo = sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        BankAccount acc = null;

        switch (type) {
            case 1:
                acc = new SavingsAccount(accNo, name, balance);
                break;

            case 2:
                acc = new CurrentAccount(accNo, name, balance);
                break;

            case 3:
                System.out.println("Enter FD Duration (in years):");
                int years = sc.nextInt();
                System.out.println("Is FD matured? (true/false):");
                boolean matured = sc.nextBoolean();
                acc = new FixedDepositAccount(accNo, name, balance, years, matured);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

    
        System.out.println("\nEnter amount to deposit:");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.println("Enter amount to withdraw:");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

       
        double interest = acc.calculateInterest();
        System.out.println("\nInterest Earned: " + interest);

       
        if (acc instanceof CurrentAccount) {
            double fee = ((CurrentAccount) acc).monthlyMaintenanceFee();
            acc.balance -= fee;
            System.out.println("Monthly Maintenance Fee Deducted: " + fee);
        }

        
        acc.balance += interest;

        
        System.out.println("\nFINAL ACCOUNT SUMMARY:");
        acc.showSummary();
    }
}