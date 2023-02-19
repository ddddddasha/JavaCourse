package lesson8;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(12);
        myArrayList.add(2);
        myArrayList.add(90);
        System.out.println(myArrayList.size());
        myArrayList.printMyListArray();
        myArrayList.add(3, 13);
        System.out.println("--------------");

        myArrayList.printMyListArray();
        System.out.println("--------------");
        Integer i = 122;
        myArrayList.remove(i);
        myArrayList.printMyListArray();

        System.out.println(myArrayList.get(0));
        myArrayList.set(0, 11);
        myArrayList.printMyListArray();
        System.out.println(myArrayList.indexOf(13));
        System.out.println(myArrayList.remove(3));


        MyArrayList<Integer> arrlist = new MyArrayList<>(3);
        arrlist.add(12);
        arrlist.add(20);
        arrlist.add(45);

        myArrayList.addAll(arrlist);
        myArrayList.printMyListArray();
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());


        MyArrayList<Integer> arrlist2 = new MyArrayList<>(3);
        arrlist2.add(22);
        arrlist2.add(33);
        arrlist2.add(55);

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>(arrlist2);
        System.out.println(myArrayList2.toString());
    }

}
