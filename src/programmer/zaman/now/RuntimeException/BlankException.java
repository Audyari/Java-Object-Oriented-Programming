package programmer.zaman.now.RuntimeException;

public class BlankException extends RuntimeException {

    public BlankException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}