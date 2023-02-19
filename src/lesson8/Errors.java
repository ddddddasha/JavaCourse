package lesson8;

public enum Errors {
    ARGUMENT_EXCEPTION ("Передан недопустимый аргумент"),
    INVALID_INDEX ("Передано недопустимое значение индекса"),
    ARRAY_IS_EMPTY ("Ошибка! Массив пуст"),
    ELEMENT_NOT_FOUND("element not found");
    private final String title;

    Errors(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
