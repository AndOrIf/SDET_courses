package HomeWork2_1;

public class CheckValidation {

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("\\w+")) {
                throw new LoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания.");
            }

            if (login.length() >= 20) {
                throw new LoginException("Логин должен содержать не более 20 символов.");
            }

            if (!password.matches("\\w+")) {
                throw new PasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания.");
            }

            if (password.length() >= 20) {
                throw new PasswordException("Пароль должен содержать не более 20 символов.");
            }

            if (!password.equals(confirmPassword)) {
                throw new PasswordException("Пароли не совпадают.");
            }
            System.out.println("Успех!");
            return true;

        } catch (LoginException | PasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return false;
        }
    }
}
