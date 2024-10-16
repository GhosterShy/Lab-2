//4 Singlton
class Client {
    public void execute() {
        System.out.println("Doing something...");
    }
}


public class Main4 {
    public static void main(String[] args) {
        Client client = new Client();
        client.execute();

    }
}
