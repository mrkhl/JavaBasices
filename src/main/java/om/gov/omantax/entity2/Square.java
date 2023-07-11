package om.gov.omantax.entity2;

public class Square extends Shape{
    private double length;

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void drow() {
        System.out.println("Square");

    }

    @Override
    public double calcArea() {
        return length*length;
    }
}
