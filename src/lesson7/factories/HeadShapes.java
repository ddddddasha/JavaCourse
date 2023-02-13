package lesson7.factories;
import java.util.Random;

public enum HeadShapes {

    BOX ("Квадратная голова"),
    CIRCLE ("Круглая голова"),
    TRIANGLE ("Треугольная голова");
    private String title;
    private static final Random rand = new Random();

    HeadShapes(String title){
        this.title = title;
    }

    public static HeadShapes randomHead()  {
        HeadShapes[] headShapes = values();
        return headShapes[rand.nextInt(headShapes.length)];
    }

    public String getTitle() {
        return title;
    }

}
