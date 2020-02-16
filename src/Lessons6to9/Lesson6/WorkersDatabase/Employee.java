package Lessons6to9.Lesson6.WorkersDatabase;

public class Employee {
    private String name;
    private String surname;
    private char sex;
    private int departmentID;
    private float salary;
    private int age;
    private int kids;
    private boolean married;

    //gettery i settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    //tworzy stringa ze wszystkich pól tego obiektu
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", departmentID=" + departmentID +
                ", salary=" + salary +
                ", age=" + age +
                ", kids=" + kids +
                ", married=" + married +
                '}';
    }

    public Employee(String name, String surname, char sex, int departmentID, float salary, int age, int kids, boolean married) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.departmentID = departmentID;
        this.salary = salary;
        this.age = age;
        this.kids = kids;
        this.married = married;
    }

    public void okrojoneDane(int index) {
        String napis = "Employee "+index+" {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary + '}';
        System.out.println(napis);
    }

    public void wyswietlDrukowane(){
        String napis = "Employee{" +
                "name='" + name.toUpperCase() + '\'' +
                ", surname='" + surname.toUpperCase() + '\'' +
                '}';
        System.out.println(napis);

    }

    public boolean sprawdzCzyPensjaPowyzej(float podanaWartosc){
        return salary>podanaWartosc;
        }

    }

