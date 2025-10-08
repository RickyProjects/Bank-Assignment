import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String accountNumber;
    private String nickname;
    protected double balance;
    

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Error: Insufficient balance.");
        }  
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }

}
