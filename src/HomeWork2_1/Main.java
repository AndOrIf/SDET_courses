package HomeWork2_1;

public class Main extends CheckValidation {
    public static void main(String[] args) {
        // Пример использования метода validate
        System.out.println(validate("valid_login", "password123", "password123"));
        System.out.println(validate("НеПравильныйЛогин_123", "pass", "pass"));
        System.out.println(validate("invalid_loginnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "password123", "password123"));
        System.out.println(validate("valid_login", "пароль123", "пароль123"));
        System.out.println(validate("valid_login", "password1231231132311231231231232131313", "password1231231132311231231231232131313"));
        System.out.println(validate("valid_login", "pass", "password123"));
    }
}

