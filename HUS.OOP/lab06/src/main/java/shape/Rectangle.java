package shape;

public class Rectangle extends Shape {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() + "]" +
                ", width=" + width +
                ", length=" + length + ']';
    }

}
