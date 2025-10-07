public class InvestmentAccount extends Account{
    private String nickname;

    public InvestmentAccount(String accountNumber, double balance, String nickname) {
        super(accountNumber, balance);
        this.nickname = nickname;
    }
}