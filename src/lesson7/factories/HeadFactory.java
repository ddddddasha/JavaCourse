package lesson7.factories;

import lesson7.robots.Robot;

public class HeadFactory implements Factory<HeadShapes> {

    @Override
    public void makeRobots(HeadShapes headShapes, Robot[] robots) {
        int i = 0;
        for (Robot item: robots) {
            i++;
            item.setRobotNumber(i);
            item.setHeadType(HeadShapes.randomHead().toString());
        }
    }
}
