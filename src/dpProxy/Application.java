package dpProxy;

public class Application {
    public static void main(String[] args) {
        Client client=new Client();
        client.setStandard(new Proxy());
        client.process();
    }
}
