package lesson7;

/*
1. Создать два завода по производству роботов
    1.1 Должно быть три разных робота.
    1.2 У каждого робота может быть три разных головы и три разных туловища.
2. Первый завод делает тела, второй - головы. У каждой части должно быть название.
3. Создать объект самого робота, который и будет состоять из тела и головы. У робота должно быть имя.
4. Вывести на консоль 9 созданных роботов с названиями тех частей которые были созданы.
5. Использовать енамы, интерфейсы, переопределить toString().
6. Дженерики и вложенные классы использовать по желанию.
*/

import lesson7.robots.RobotCollector;

public class Main {
    public static void main(String[] args) {
        RobotCollector robotCollector = new RobotCollector();
        robotCollector.releaseRobots();

    }
}
