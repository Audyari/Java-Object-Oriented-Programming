package programmer.zaman.now.Exception;

public class ValidationApp {

    //@Fancy(name = "AnimalApp", tags = {"application", "java"})

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("eko", "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }




    }
}
