package Record_Class;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Panggil Objek record USER DAN PASSWORD");
    }

    LoginRequest(String username){
        this(username,"");
    }

    LoginRequest(){
        this("","");
    }

    void sayHello(){
        System.out.println("SAY HELLO");
    }

}

