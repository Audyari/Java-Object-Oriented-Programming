package Exception;

import Record_Class.LoginRequest;

public class ClassCekEror {

    public static void cekEror(LoginRequest loginRequest) throws ClassTangkapEror, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("USERNAME NULL");
        } else if (loginRequest.username().isBlank()) {
            throw new ClassTangkapEror("USERNAME IS BLANK");
        } else if (loginRequest.password() == null ) {
            throw new NullPointerException("PASSWORD IS NULL");
        } else if (loginRequest.password().isBlank()) {
            throw new ClassTangkapEror("USERNAME IS BLANK");
        }
    }
}