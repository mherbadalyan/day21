package task4;

public class Rectangle implements Shape{
    private double side1;
    private double side2;

    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double Area() {
        return 2 * (side1 + side2);
    }

    @Override
    public double Perimeter() {
        return side1 * side2;
    }

    @Override
    public String toString() {
        return "Area of rectangle = " + Area()
                + ". Perimeter of rectangle = " + Perimeter();
    }
}
