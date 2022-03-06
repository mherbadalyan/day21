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
    public double Area() {
        return 4 * side;
    }

    @Override
    public double Perimeter() {
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Area of square = " + Area()
                + ". Perimeter of square = " + Perimeter();
    }
}
