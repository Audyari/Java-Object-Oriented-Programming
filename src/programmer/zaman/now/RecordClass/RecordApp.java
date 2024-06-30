package programmer.zaman.now.RecordClass;

public class RecordApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Audy", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Audy1"));
        System.out.println(new LoginRequest("Audy3", "rahasia"));

    }
}
