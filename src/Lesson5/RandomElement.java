package Lesson5;
import java.util.Random;

public class RandomElement {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final double MAX_DOUBLE = 9.;
    private static final Random rand = new Random();
    public String generateString()
    {
        String randomElement = "";
        int length = 7;
        char[] element = new char[length];
        for(int i = 0; i < length; i++){
            element[i] = ALPHABET.charAt(rand.nextInt(ALPHABET.length()));
        }
        for (int i = 0; i < element.length; i++) {
            randomElement += element[i];
        }
        return randomElement;
    }
    public Float generateFloat(){
        return rand.nextFloat()*9;
    }
    public Double generateDouble(){
        return Math.random() * MAX_DOUBLE;
    }
    public int choose(){
        return rand.nextInt(1,3);
    }
}
