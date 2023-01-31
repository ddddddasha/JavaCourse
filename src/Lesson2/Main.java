package Lesson2;
/*
1. Создать два класса. +
2. Создать метод для запуска в одном классе. (метод main) +
3. Во втором классе создать глобальные переменные всех типов (примитивы и обертки). +
   3.1 И для каждой глобальной переменной геттеры и сеттеры. +
4. В классе с методом для запуска создать глобальные переменные с различными типами (примитивами и обертками). +
   А также в методе (main) создать локальные переменные (примитивы и обертки). +
5. Поэкспериментировать с присвоением переменных друг в друга и приведением типов, посмотреть какие ошибки получаться. +
6. Геттеры и сеттеры обязательно использовать, т.е. установить и получить значение. +
7. Вывести все переменные на консоль. (вывод на экран) +
8. Создавать классы, методы, переменные со всеми правилами именования. +
(code convention)
*/

public class Main {
    //локальные объектные переменные
    private int myint;
    private Integer myInteger;
    private long mylong;
    private boolean myboolean;
    private String myString;
    private char mychar;
    private byte mybyte;
    private Boolean myBoolean;
    //глобальные переменные
    private static double mydouble;
    private static Character myCharacter;
    private static short myshort;

    public static void main(String[] args){

        Main example = new Main();
        example.myint = 5;
        example.myInteger = 9;
        example.mylong = 1231232121211233213l;
        example.myboolean = true;
        example.myBoolean = false;
        example.mychar = 'c';
        example.mybyte = 127;
        myCharacter = '!';
        mydouble = 11.21;
        myshort = 128;

        int i = (int) example.mylong;
        System.out.println(i);
        System.out.println("---------------------------------------");
        System.out.println("All values in class Main:");
        System.out.println(example.myint);
        System.out.println(example.myInteger);
        System.out.println(example.mylong);
        System.out.println(example.myboolean);
        System.out.println(example.myBoolean);
        System.out.println(example.mychar);
        System.out.println(example.mybyte);
        System.out.println(myCharacter);
        System.out.println(mydouble);
        System.out.println(myshort);
        System.out.println("---------------------------------------");

        //преобразование типов и функции оберток
        example.myString = example.myInteger.toString();//преобразование int в String
        System.out.println(example.myString);
        System.out.println(example.myInteger.doubleValue());//преобразование в double
        System.out.println(example.myInteger.compareTo(example.myint)); //1 = (9 > 5)
        System.out.println(example.myint = (int) example.mybyte);
        //System.out.println((int) example.myboolean); error
        System.out.println((int) example.mybyte);
        System.out.println((byte) example.mylong);
        System.out.println((int) example.mychar);



        //Работа с сеттерами и геттерами
        Programmer person1 = new Programmer();
        person1.setName("Alex");
        person1.setSurname("Fox");
        person1.setAge((byte) 25);
        person1.setPosition("Senor");
        person1.setDistantly(false);
        person1.setSalary(350_000_000.501);
        person1.setWorkExperience(5.5f);
        person1.setWorkingHours(9.0);
        person1.setVacationHours(336);
        System.out.println("---------------------------------------");
        person1.printAllInfo();
        System.out.println("---------------------------------------\n\n");


    }

}
