package HomeWork2_1;

public class LoginException extends Exception {
    public LoginException() {
        super("Логин неверен.");
    }

    public LoginException(String message) {
        super(message);
    }
}
