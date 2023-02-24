package lesson9;

import lesson9.exceptions.ValueRangeError;
import lesson9.exceptions.ErrorEnteringNumbers;
import lesson9.exceptions.ErrorEnteringLatinLetters;
import java.util.Scanner;

public class Registration {
    private final Scanner scanner = new Scanner(System.in);
    private PersonalData personalData = new PersonalData();

    public void signUp() {
        System.out.println(Constants.ENTER_LOGIN.getTitle());
        enterLogin();
        System.out.println(Constants.ENTER_PASSWORD.getTitle());
        enterPassword();
        System.out.println();
        isRegistered();
    }

    public void enterLogin(){
        String login = scanner.next();
        try {
            if (isNumeric(login) && login.length() == PersonalData.LOGIN_LENGTH){
                personalData.setLogin(login);
            }
            else if (!isNumeric(login)) {
                throw new ErrorEnteringNumbers("Вы ввели не числовые значения");
            }
            else if(login.length() != PersonalData.LOGIN_LENGTH) {
                throw new ValueRangeError("Недопустимое количество символов");
            }
        }
        catch (ErrorEnteringNumbers | ValueRangeError e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Программа продолжается...");
        }

    }

    public void enterPassword(){
        try {
            String password = scanner.next();
            if(isAlpha(password)){
                personalData.setPassword(password);
            }
            else throw new ErrorEnteringLatinLetters("Должны быть только латинские буквы");
        }
        catch (ValueRangeError | ErrorEnteringLatinLetters e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches(Constants.CHECKING_THE_NUMBER.getTitle());
    }

    private static boolean isAlpha(String str) {
        return str != null && str.matches(Constants.CHECKING_LATIN_LETTERS.getTitle());
    }

    public void isRegistered(){
        if(personalData.getLogin() != null && personalData.getPassword() != null){
            System.out.println(Constants.SUCCESSFUL_REGISTRATION.getTitle());
            System.out.println(toString());
        }
        else System.out.println(Constants.FAILED_REGISTRATION.getTitle());
    }

    @Override
    public String toString() {
        return "PersonalData" + "\n" +
                "login: " + personalData.getLogin() + "\n" +
                "password: " + personalData.getPassword();

    }
}
