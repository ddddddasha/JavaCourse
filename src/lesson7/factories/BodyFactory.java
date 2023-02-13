package lesson7.factories;

import lesson7.robots.Robot;

public class BodyFactory implements Factory<BodyShapes> {

    @Override
    public void makeRobots(BodyShapes bodyShapes, Robot[] robots) {
        for (Robot item: robots) {
            item.setBodyType(bodyShapes.randomBody().toString());
        }
    }
}
