public class LoyaltyAccount extends Account{
    private String loyaltyId;
    private int pointsBalance;
    private String nickname;

    public LoyaltyAccount(String loyaltyId, int pointsBalance, String nickname, String accountNumber, double balance){
        super(accountNumber, balance);
        this.loyaltyId = loyaltyId;
        this.nickname = nickname;
        this.pointsBalance = 0;
    }

    public void earn(int points){
        pointsBalance += points;
    }

    public void redeem(int points){
        if (points <= pointsBalance){
            pointsBalance -= points;
            Redemption r = new Redemption();
        } else {
            System.out.println("Error: Insufficient points.");
        }
    }

    public int getPoints(){
        return pointsBalance;
    }
}
