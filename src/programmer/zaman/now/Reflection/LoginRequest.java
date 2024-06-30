package programmer.zaman.now.Reflection;

public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}