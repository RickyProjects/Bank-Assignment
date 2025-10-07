import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> clients = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addClient(Client c) {
        if (!clients.contains(c)) {
            clients.add(c);
        } else {
            System.out.println("Error: Client already exists.");
        }
    }

    public void removeClient(Client c) {
        if (!clients.remove(c)) {
            System.out.println("Error: Client not found.");
        }
    }
    
    public List<Client> listClients() {
        return clients;
    }

}
