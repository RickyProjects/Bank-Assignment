public class LoanAccount extends Account{
    private double interestRate;
    private double principal;

    public LoanAccount(String accountNumber, double balance, double principal, double interestRate){
        super(accountNumber, 0);
        this.principal = principal;
        this.interestRate = interestRate;  
    }

    public void accrueInterest(){
        principal *= interestRate;
    }

    public void makePayment(double amount){
        principal -= amount;
    }

    public String toString() {
        return "[" + "Loan Account #" + getAccountNumber() + " | Principal: $" + principal + " | Interest: " + interestRate + " | Balance: $" + balance + "]";
    }

}