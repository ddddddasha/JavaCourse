package Lesson4;

public class Cat {
    private int count;
    private String name = "noname";
    private int age = 0;
    public Cat(){}

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printInfoAboutCat(){
        System.out.println("Котик № " + this.count);
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: "+this.age);
    }
    public void setCount(int count){
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) { //переопределяем метод
        Cat otherCat = (Cat) obj;
        if (obj == null) { //если объекта нет
            return false; //возвращаем false
        }
        if (obj == this) { //проверяем ссылается ли объект по ссылке obj, на наш текущий, на this.
            // Ведь если так, то объекты равны и никаких дальнейших сравнений делать не надо.
            return true;
        }
        return this.name.equals(otherCat.name) && this.age == otherCat.age;
    }

    @Override
    public String toString() {
        String info = "Котик: " + getName() + ", его возраст: " + getAge() + " год";
        if (age == 1) {
            return info;
        } else if (age < 5 || age > 20 && age < 25) {
            return info.concat("а");
        } else {
            return info.replace("год", "лет");
        }
    }


}
