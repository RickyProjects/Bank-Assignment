public class SavingsAccount extends Account{
    private double interestRate;
    private String nickname;

    public SavingsAccount(String accountNumber, String nickname, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;  
        this.nickname = nickname;
    }

    public void accrueInterest(){
        balance *= interestRate;
    }

    public String toString() {
        return "[" + "Savings Account #" + getAccountNumber() + " | Balance: $" + balance + " | Interest: " + interestRate + "]";
    }


}
