package lesson8;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList <T> implements MyList<T>{
    private Object[] list;//array
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList(){
        this.list = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity){
        if(capacity > 0 ){
            this.list = new Object[capacity];
        }
        else {
            System.out.println(Errors.ARGUMENT_EXCEPTION);
        }
    }

    public MyArrayList(MyList<? extends T> col){ //Конструктор принимает другую коллекцию,
        // создавая новый массив с элементами переданной коллекции:
        Object[] newList = new Object[col.size()];
        for (int i = 0; i < newList.length; i++) {
            newList[i] = col.get(i);
        }
        list = newList;
    }

    private Object[] increaseArrayList(){
        return Arrays.copyOf(list, list.length * 2);
    }

    @Override
    public int size() {
        size = 0;
        for (Object item: list) {
            if(item != null){
                size++;
            }
            else break;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) { //проверяет содержится ли элемент.
        if (!isEmpty()){
            for (Object item: list) {
                if(item.equals(value)){
                    return true;
                }
            }
        }
        else {
            System.out.println(Errors.ARRAY_IS_EMPTY.getTitle());
        }
        return false;
    }

    @Override
    public boolean add(T value) { //добавляет элемент в конец списка
        if (size >= DEFAULT_CAPACITY){
            list = increaseArrayList(); //очистить поставить везде через цикл null
            list[size] = value;
            size++;
            return true;
        }
        list[size] = value;
        size++;
        return true;

    }

    @Override
    public boolean add(int index, T value) { //добавляет в список по индексу index объект value
        if(index <= size && index > -1){ //если не вышли за пределы массива (в конец можно поставить, но не дальше)
            Object[] tempArray = new Object[size+1];
            for (int i = 0; i < size + 1; i++) {
                if (i < index)
                    tempArray[i] = list[i];
                else if (i == index)
                    tempArray[i] = value;
                else
                    tempArray[i] = list[i - 1];
            }
            list = tempArray;
            size++;
        }
        else {
            System.out.println(Errors.INVALID_INDEX.getTitle());
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(T value) { //bool если удаление произошло успешно
        if(!isEmpty()){ //проверка на пустоту
            int i = 0;
            while (i<size){
                if(list[i].equals(value)){
                    remove(i);
                    return true;
                }
                i++;
            }
            if(i == size){
                System.out.println(Errors.ELEMENT_NOT_FOUND.getTitle());
                return false;
            }
        }
        else System.out.println(Errors.ARRAY_IS_EMPTY.getTitle());
        return false;
    }

    @Override
    public boolean addAll(MyList<? extends T> value) { //добавляет элементы одной коллекции в конец другой.
        Object[] newList = new Object[size + value.size()];
        System.arraycopy(list, 0, newList, 0, size);
        for (int i = 0; i < value.size(); i++) {
            newList[i + size] = value.get(i);
        }
        size();
        list = newList;
        return true;
    }

    @Override
    public T get(int index) { //возвращает объект из списка по индексу index
        if (!isEmpty() && (index < size && index > -1)){
            return (T) list[index];
        }
        else {
            System.out.println(Errors.INVALID_INDEX.getTitle() + "or" + Errors.ARRAY_IS_EMPTY.getTitle());
            return null;
        }
    }

    @Override
    public T remove(int index) { //удаляет элемент по индексу index, возвращает при этом удалённый объект
        if(index > -1 && index < size){
            T removeElement = (T) list[index];
            System.arraycopy(list, index + 1, list, index, size - index - 1);
            list[--size] = null;
            size();
            return removeElement;//изменить
        } else {System.out.println(Errors.INVALID_INDEX.getTitle());
            return null;}
    }

    @Override
    public T set(int index, T value) { //присваивает значение объекта value элементу,
        // который находиться по индексу index
        if(!isEmpty() && index < size){ //проверка на переполнения и на пустоту так как вставить нужно по необходимому индексу
            Object oldValue = list[index];
            list[index]=value;
            return (T) oldValue;
        }
        else {
            System.out.println(Errors.INVALID_INDEX.getTitle() + "or" + Errors.ARRAY_IS_EMPTY.getTitle());
            return null;
        }
    }

    @Override
    public int indexOf(Object value) { //возвращает индекс первого вхождения объекта value в список.
        // Если объект не найден вернуть -1;
        if(!isEmpty()){
            for (int i = 0; i < size; i++) {
                if(list[i].equals(value)){
                    return i;
                }
            }
        }
        else {
            System.out.println(Errors.ARRAY_IS_EMPTY.getTitle());
        }
        return -1;
    }

    public void printMyListArray(){
        for (Object item: list) {
            if(item == null){
                break;
            }
            else {
                System.out.print(item + " ");
            }
        }
        System.out.println();
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size() +
                '}';
    }
}
