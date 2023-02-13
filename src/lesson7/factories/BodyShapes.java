package lesson7.factories;

import java.util.Random;

public enum BodyShapes {
    BOX ("Квадратное тело"),
    CIRCLE ("Круглое тело"),
    TRIANGLE ("Треугольное тело");
    private static final Random rand = new Random();
    private final String title;

    public static BodyShapes randomBody()  {
        BodyShapes[] bodyShapes = values();
        return bodyShapes[rand.nextInt(bodyShapes.length)];
    }

    BodyShapes(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
