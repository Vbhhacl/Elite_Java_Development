package mmoce.bank;

public class Account {
    private double balance;
    private double overdraft;

    public Account() {
     
    }

    public Account(double balance) {
        this.balance = balance;
        overdraft = 10000;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } 
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws BalanceException {
        //if (amount <= 0) {
        //    System.out.println("Invalid");
        //    return ;
        //}
        if (balance + overdraft >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } 
        else {
            //System.out.println("Insufficient balance");
        	throw new BalanceException("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return "Account [Balance=" + balance + ", Overdraft=" + overdraft + "]";
    }
}