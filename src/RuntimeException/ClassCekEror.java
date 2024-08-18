package RuntimeException;

import Record_Class.LoginRequest;

public class ClassCekEror {

    public static void ClassCekErorPakeTunTime(LoginRequest loginRequest)  {
        if (loginRequest.username() == null) {
            throw new ClassTangkapEror("USERNAME NULL");
        } else if (loginRequest.username().isBlank()) {
            throw new ClassTangkapEror("USERNAME IS BLANK");
        } else if (loginRequest.password() == null ) {
            throw new ClassTangkapEror("PASSWORD IS NULL");
        } else if (loginRequest.password().isBlank()) {
            throw new ClassTangkapEror("USERNAME IS BLANK");
        }
    }
}