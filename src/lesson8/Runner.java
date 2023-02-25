package lesson8;

public class Runner {
    public void run(){

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println("Добавление в ArrayList по одному элементу в конец:");
        myArrayList.add(12);
        myArrayList.add(2);
        myArrayList.add(90);
        myArrayList.add(90);
        myArrayList.printMyListArray();
        System.out.println("Добавление элемента 13 в ArrayList по заданному индексу 2:");
        myArrayList.add(2, 13);
        myArrayList.printMyListArray();
        System.out.println("Удаление элемента, которого нет в массиве:");
        Integer i = 122;
        Integer j = 90;
        myArrayList.remove(j);
        myArrayList.remove(i);
        System.out.println("Удаление элемента по индексу 1: ");
        myArrayList.remove(1);
        myArrayList.printMyListArray();
        System.out.println("Получение элемента по заданному индексу 0: ");
        System.out.println(myArrayList.get(0));
        System.out.println("Замена элемента по заданному индексу 0:");
        myArrayList.set(0, 11);
        myArrayList.printMyListArray();
        System.out.println("Получение индекса элемента 13:");
        System.out.println(myArrayList.indexOf(13));
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>(3);//создание листа с заданной вместимость элементов
        myArrayList1.add(12);
        myArrayList1.add(20);
        myArrayList1.add(45);
        System.out.println("Новый ArrayList:");
        myArrayList1.printMyListArray();
        System.out.println("Добавление элементов нового ArrayList в старый с функцией addAll:");
        myArrayList.addAll(myArrayList1);
        myArrayList.printMyListArray();
        System.out.println("Количество элементов в старом массиве стало: " + myArrayList.size());
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>(3);
        myArrayList2.add(22);
        myArrayList2.add(33);
        myArrayList2.add(55);
        System.out.println("Добавление элементов ArrayList через конструктор:");
        MyArrayList<Integer> myArrayList3 = new MyArrayList<>(myArrayList2);
        System.out.println(myArrayList3);
    }

}
