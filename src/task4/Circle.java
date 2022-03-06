package task4;

public class Circle implements Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * Math.pow(radius , 2);
    }

    @Override
    public double Perimeter() {
        return 4 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Area of circle = " + Area()
                + ". Perimeter of circle = " + Perimeter();
    }
}
