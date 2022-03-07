package task4;

public class Square implements Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 4 * side;
    }

    @Override
    public double perimeter() {
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Area of square = " + area()
                + ". Perimeter of square = " + perimeter();
    }
}
