package by.it.shvaibovich.lesson06;

public class Dog {
   private String name;
    private int age;
    private int weight;
    private double power;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Кличка: " + name +". Возраст: " + age;
    }

    boolean win(Dog otherDog){
double my=20*this.age+30*this.weight+50*this.power;
double other=20*otherDog.age+30*otherDog.weight+50*otherDog.power;
if (my>other) return true;
else return false;
    }


}
