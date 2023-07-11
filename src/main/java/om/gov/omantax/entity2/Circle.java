package om.gov.omantax.entity2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void drow() {
        System.out.println("Circle");

    }

    @Override
    public double calcArea() {
        return Math.PI* Math.pow(radius, 2);
    }
}
