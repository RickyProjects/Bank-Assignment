public class CheckingAccount extends Account{
    private String nickname;

    public CheckingAccount(String accountNumber, double balance, String nickname) {
        super(accountNumber, balance);
        this.nickname = nickname;
    }
}
