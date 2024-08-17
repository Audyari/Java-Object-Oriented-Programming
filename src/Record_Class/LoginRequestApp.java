package Record_Class;

public class LoginRequestApp {

    public static void main(String[] args) {

        LoginRequest testObjek = new LoginRequest("AUDYARI","Password");

        System.out.println(testObjek.username());
        System.out.println(testObjek.password());

        System.out.println(testObjek);
        System.out.println(testObjek.getClass());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Asep"));
        System.out.println(new LoginRequest("ASEP SHOP","APSSORD"));

        testObjek.sayHello();

    }

}
