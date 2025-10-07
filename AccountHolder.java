import java.util.Date;

public class AccountHolder {
    private String role;
    private double ownershipPct;
    private Date since;
    private Client client;
    private Account account;

    public AccountHolder(Client client, Account account, String role, double ownershipPct, Date since) {
        this.client = client;
        this.account = account;
        this.role = role;
        this.ownershipPct = ownershipPct;
        this.since = since;
    }
}
