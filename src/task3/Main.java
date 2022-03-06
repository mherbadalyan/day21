package task3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(10,"Some Animal");
        System.out.println(animal);

        Animal cat = new Cat(15, "Murzik");
        System.out.println(cat);

        Cat cat1 = new Cat(20,"Barsik");
        System.out.println(cat1);
    }
}
