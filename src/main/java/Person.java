public class Person {
    private String name;
    private int age;

    private String color;

    private int cars;

    private String lastName;

    private int houses;

    private String middleName;

   public Person(){}

    public Person(int age) {
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name,String middleName, String lastName, String color, int cars,  int age,int houses) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.cars = cars;
        this.lastName = lastName;
        this.houses = houses;
        this.middleName = middleName;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHouses() {
        return houses;
    }

    public void setHouses(int houses) {
        this.houses = houses;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

}
