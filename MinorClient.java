public class MinorClient extends InternalClient {
    private String guardianName;

    public MinorClient(String clientId, String legalName, String email, String phone, String guardianName) {
        super(clientId, legalName, email, phone);
        this.guardianName = guardianName;
    }

}
