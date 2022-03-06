package task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(25);
        Shape[] shapes = {circle, rectangle, square};
        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }
    }
}
