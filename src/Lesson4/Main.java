package Lesson4;
/*
1.  Создаем два класса. Класс Cat и класс для запуска приложения (Main, Runner). +
2.  У кота есть имя и возраст. Есть дефолтное значение имени и возраста. +
3.  При запуске приложения используем четыре цикла.
4.  Первый while создает 10 котиков и выводит на консоль дефолтное имя и возраст. +
5.  Во втором цикле for создаем 10 котиков, вводим их возраст и имя через сеттер, и выводим в консоль через геттер.
6.  Третий цикл do while создает 10 котиков вводит имя и возраст через конструктор. Выводим в консоль.
7.  В четвертом цикле foreach выводим  массив из пяти котиков, у них выводим имя и возраст.
Способ инициализации возраста и имени - на ваше усмотрение.
Имена котиков создавать как набор символов, через рандом класс Random.
Возраст котиков рандомное значение от 1 до 28.
Сгенерировать метод equals и toString для класса Cat.
*/

import java.util.Random;

public class Main {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static String generateString()
    {
        String randomName = "";
        Random rand = new Random();
        int length = rand.nextInt(1,8);
        char[] name = new char[length];

        for(int i = 0; i < length; i++){
            name[i] = alphabet.charAt(rand.nextInt(alphabet.length()));
        }
        for (int i = 0; i < name.length; i++) {
            randomName += name[i];
        }
        return randomName;
    }
    private static int generateInt(){
        Random rand = new Random();
        return rand.nextInt(1,28);
    }

    public static void main(String[] args) {
        //создаем массив из котов
        Cat[] cats = new Cat[10];
        //помещаем в массив объекты котов
        int i = 0 ;
        while (i<10){
            cats[i] = new Cat();
            cats[i].setCount(i+1);
            cats[i].printInfoAboutCat();
            i++;
        }
        cats = null;

        cats = new Cat[10];
        for (int j = 0; j<10; j++){
            cats[j] = new Cat();
            cats[j].setCount(j+1);
            System.out.println("-----" + cats[j].getCount() + "-ый котик"+"-----");
            cats[j].setName(generateString());
            cats[j].setAge(generateInt());
            System.out.println("Имя: " + cats[j].getName());
            System.out.println("Возраст: " + cats[j].getAge());
        }
        cats = null;

        cats = new Cat[10];
        int j = 0;
        do {
            System.out.println("-----------------------");
            cats[j] = new Cat(generateString(), generateInt());
            cats[j].setCount(j+1);
            cats[j].printInfoAboutCat();
            j++;
        } while (j<10);

        for (Cat item : cats) {
            System.out.println(item.toString());
        }
    }
}
