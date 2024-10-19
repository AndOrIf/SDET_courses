package HomeWork2_1;

public class PasswordException extends Exception {
    public PasswordException() {
        super("Пароль неверен.");
    }

    public PasswordException(String message) {
        super(message);
    }
}
