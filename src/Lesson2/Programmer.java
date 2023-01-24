package Lesson2;

public class Programmer {
    //примитивы
    private byte age;
    private static final String COMPANY = "Google";
    private double salary;
    private boolean isDistantly; //удаленно или нет
    //обертки
    private String name;
    private String surname;
    private Float workExperience; //опыт работы
    private String position; // должность
    private Integer vacationHours; //часы отпуска
    private Double workingHours; //продолжительность рабочего дня

    //гетеры
    public byte getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getisDistantly() {
        return isDistantly;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Float getWorkExperience() {
        return workExperience;
    }

    public String getPosition() {
        return position;
    }

    public Integer getVacationHours() {
        return vacationHours;
    }

    public Double getWorkingHours() {
        return workingHours;
    }

    //сеттеры
    public void setAge(byte age) {
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setDistantly(boolean distantly) {
        isDistantly = distantly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWorkExperience(Float workExperience) {
        this.workExperience = workExperience;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setVacationHours(Integer vacationHours) {
        this.vacationHours = vacationHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }


    public void printAllInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Age: " + this.getAge());
        System.out.println("Company: "+ COMPANY);
        System.out.println("Position: " + this.getPosition());
        System.out.println("is Distantly: " + this.getisDistantly());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Work experience: " + this.getWorkExperience());
        System.out.println("Working (hours): " + this.getWorkingHours());
        System.out.println("Vacation (hours): " + this.getVacationHours());
    }
}
