package lesson9;

public enum Constants {
    ENTER_LOGIN ("Введите логин (должен состоять только из 7 цифр): "),
    ENTER_PASSWORD ("Введите пароль (должен содержать от 5 до 10 латинских букв): "),
    CHECKING_THE_NUMBER("-?\\d+(\\.\\d+)?"),
    CHECKING_LATIN_LETTERS("^[a-zA-Z]*$"),
    SUCCESSFUL_REGISTRATION("Регистрация прошла успешно"),
    FAILED_REGISTRATION("Регистрация не выполнена");

    private final String title;

    Constants(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
