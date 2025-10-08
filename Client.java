import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    protected String clientId;
    protected String legalName;
    protected String contactEmail;
    protected String phone;
    protected List<Account> accounts = new ArrayList<>();

    public Client(String clientId, String legalName, String contactEmail, String phone){
        this.clientId = clientId;
        this.legalName = legalName;
        this.contactEmail = contactEmail;
        this.phone = phone;
    }

    public void addAccount(Account a) {
        if (!accounts.contains(a)) {
            accounts.add(a);
            
        } else {
            System.out.println("Error: Account already exists.");
        }
    }

    public void removeAccount(Account a) {
        if (!accounts.remove(a)) {
            System.out.println("Error: Account not found.");
        }
    }

    public List<Account> listAccounts() {
        return accounts;
    }

    public String toString() {
        return "Client ID: " + clientId + ", Name: " + legalName;
    }

}