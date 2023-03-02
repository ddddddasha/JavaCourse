package lesson10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Constants {
    private static final Random rand = new Random();
    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public static final String MAIN_MENU = """
                        ------Добро пожаловать------
                        1 - работа с товарами
                        2 - работа с заказами
                        3 - выход из программы
                                                """;
    public static final String SECOND_MENU = """
                        ------Работа с товарами------
                        1 - добавить товар
                        2 - удалить товар
                        3 - список товаров
                        4 - выход в главное меню
                                                """;
    public static final String THIRD_MENU = """
                        ------Работа с заказами------
                        1 - оформить заказ
                        2 - отменить заказ
                        3 - список заказов
                        4 - выход в главное меню
                                                """;
    public static final String ENTER_PRODUCT_NAME = "Введите название товара:";
    public static final String DELETE_PRODUCT_ID = "Введите id товара, который хотите удалить:";
    public static final String DELETE_ORDER_ID = "Введите id заказа, который хотите удалить:";
    public static final String ERROR_INPUT = "Неправильный ввод";
    public static final String NUMBER_PRODUCTS = "Сколько товаров хотите заказать?";
    public static final String ENTER_PRODUCT_DATA = "Введите данные товара, который хотите заказать";

    public static int randomId(){
        return 100000 + rand.nextInt(900000);
    }

    public static String randomData(){
        Date date = new Date((long) ((2121212121212L)* Math.random()));
        return simpleDateFormat.format(date);
    }
}
