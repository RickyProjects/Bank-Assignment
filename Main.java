public class Main {
    public static void main(String[] args) {

        Bank bmo = new Bank("BMO");

        Client ricardo = new Individual("C001", "Ricardo A", "ricardo@gmail.com", "555-1234");
        Client jack = new Individual("C002", "Jack M", "jack@gmail.com", "666-1234");
        Client shirina = new Individual("C003", "Shirina H", "shirina@gmail.com", "777-1234");

        Account R_savings = new SavingsAccount("1", "Ricardo's Savings", 500.0, 1.02);
        Account J_savings = new SavingsAccount("2", "Jacks's Savings", 1000.0, 1.03);
        Account S_savings = new SavingsAccount("3", "Shirina's Savings", 1500.0, 1.01);
        Account R_loan = new LoanAccount("4", 123.0, 100, 1.04);

        bmo.addClient(ricardo);
        bmo.addClient(jack);
        bmo.addClient(shirina);

        ricardo.addAccount(R_savings);
        ricardo.addAccount(R_loan);
        jack.addAccount(J_savings);
        shirina.addAccount(S_savings);

        System.out.println("Bank Clients:");
        System.out.println(bmo.listClients());

        System.out.println("Ricardo's Accounts:");
        System.out.println(ricardo.listAccounts());

        System.out.println("Jack's Accounts:");
        System.out.println(jack.listAccounts());

        System.out.println("Shirina's Accounts:");
        System.out.println(shirina.listAccounts());
        
    }
}
