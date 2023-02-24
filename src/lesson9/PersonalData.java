package lesson9;

import lesson9.exceptions.ValueRangeError;

public class PersonalData {
    private String login;
    private String password;
    private static final Integer MIN_LENGTH = 4;
    private static final Integer MAX_LENGTH = 11;
    public static final Integer LOGIN_LENGTH = 7;
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) throws ValueRangeError {
        if(password.length() > MIN_LENGTH && password.length() < MAX_LENGTH){
            this.password = password;
        }
        else throw new ValueRangeError("Недопустимое количество символов");
    }

    public String getLogin() {
        return login;
    }

    public String getPassword(){
        return password;
    }
}
