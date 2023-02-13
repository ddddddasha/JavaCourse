package lesson7.robots;

import lesson7.factories.BodyFactory;
import lesson7.factories.BodyShapes;
import lesson7.factories.HeadFactory;
import lesson7.factories.HeadShapes;

import java.util.Random;

public class RobotCollector {

    private Robot[] robots = new Robot[9];

    public void createRobots(){
        for (int i = 0; i < 9; i++) {
            robots[i]=new Robot();
        }
    }

    public static class RandomName {
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        private Random rand = new Random();

        public static String generateName()
        {
            Random rand = new Random();
            StringBuilder stringBuilder = new StringBuilder();

            int length = 7;
            char[] element = new char[length];
            for(int i = 0; i < length; i++){
                element[i] = ALPHABET.charAt(rand.nextInt(ALPHABET.length()));
            }
            for (int i = 0; i < element.length; i++) {
                stringBuilder.append(element[i]);
            }
            return stringBuilder.toString();
        }
    }

    public void giveTheName(Robot[] robots){
        for (Robot item: robots) {
            item.setRobotName(RandomName.generateName());
        }
    }

    public void releaseRobots(){
        createRobots();
        HeadFactory headFactory = new HeadFactory();
        BodyFactory bodyFactory = new BodyFactory();
        headFactory.makeRobots(HeadShapes.randomHead(), robots);
        bodyFactory.makeRobots(BodyShapes.randomBody(), robots);
        giveTheName(robots);
        for (Robot item:robots) {
            System.out.println(item.toString());
        }
    }
}
