package lesson7.factories;

import lesson7.robots.Robot;

public interface Factory <T>{

    void makeRobots(T t, Robot[] robots);
}
