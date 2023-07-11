package om.gov.omantax.entity2;

public class Triangle extends Shape {
private double length;
private double height;

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void drow() {
        System.out.println("Triangle");

    }

    @Override
    public double calcArea() {
        return 0.5 * length * height;
    }
}
