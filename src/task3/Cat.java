package task3;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public String sound() {
        return "Myau";
    }

    @Override
    public String toString() {
        return "Cat age = " + super.getAge() +
                ", name = " + super.getName() + " and makes this sound " + sound();
    }
}
