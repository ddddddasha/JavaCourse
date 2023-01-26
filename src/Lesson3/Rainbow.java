package Lesson3;
import java.util.Scanner;

public class Rainbow {
    public static final int NUMBER_RED = 1;
    public static final int NUMBER_ORANGE = 2;
    public static final int NUMBER_YELLOW = 3;
    public static final int NUMBER_GREEN = 4;
    public static final int NUMBER_BLUE = 5;
    public static final int NUMBER_DARK_BLUE = 6;
    public static final int NUMBER_VIOLET = 7;

    public static final String RED = "красный";
    public static final String ORANGE = "оранжевый";
    public static final String YELLOW = "желтый";
    public static final String GREEN = "зеленый";
    public static final String BLUE = "голубой";
    public static final String DARK_BLUE = "синий";
    public static final String VIOLET = "фиолетовый";

    public void whatColorIsIt(int number){


        switch(number){
            case 1:
                System.out.println( RED );
                break;
            case 2:
                System.out.println( ORANGE );
                break;

            case 3:
                System.out.println( YELLOW );
                break;
            case 4:
                System.out.println( GREEN );
                break;
            case 5:
                System.out.println( BLUE );
                break;
            case 6:
                System.out.println( DARK_BLUE );
                break;
            case 7:
                System.out.println( VIOLET );
                break;
            default:
                System.out.println("Вы вышли из диапазона");
        }

    }

    public void colorSelection(){
        System.out.println("---------------------------------");
        System.out.println("Цвета радуги:");
        System.out.println("1 - " + RED);
        System.out.println("2 - " + ORANGE);
        System.out.println("3 - " + YELLOW);
        System.out.println("4 - " + GREEN);
        System.out.println("5 - " + BLUE);
        System.out.println("6 - " + DARK_BLUE);
        System.out.println("7 - " + VIOLET);
        System.out.println("---------------------------------");

        System.out.println("1 - оставить один цвет");
        System.out.println("2 - смешать два цвета");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш выбор: ");
        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Выберите цвет:");
            int number = scanner.nextInt();
            whatColorIsIt(number);
        }
        else if(choice == 2){
            System.out.println("Выберите два цвета:");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            mixColors(number1,number2);
        }
        else {
            System.out.println("У вас есть только 2 выбора!");
        }

    }

    public void mixColors(int number1, int number2){
        switch (number1){
            case NUMBER_RED:
                System.out.print(RED.replace("ый", "о-"));
                whatColorIsIt(number2);
                break;
            case NUMBER_ORANGE:
                System.out.print(ORANGE.replace("ый", "о-"));
                whatColorIsIt(number2);
                break;
            case NUMBER_YELLOW:
                System.out.print(YELLOW.replace("ый", "о-"));
                whatColorIsIt(number2);
                break;
            case NUMBER_GREEN:
                System.out.print(GREEN.replace("ый", "о-"));
                whatColorIsIt(number2);
                break;
            case NUMBER_BLUE:
                System.out.print(BLUE.replace("ый", "о-"));
                whatColorIsIt(number2);
                break;
            case NUMBER_DARK_BLUE:
                System.out.print(DARK_BLUE.replace("ый", "о-"));
                whatColorIsIt(number2);
                break;
            case NUMBER_VIOLET:
                System.out.print(VIOLET.replace("ый", "о-"));
                whatColorIsIt(number2);
                break;
            default:
                System.out.println("Вы вышли из диапазона");
        }
    }
}


