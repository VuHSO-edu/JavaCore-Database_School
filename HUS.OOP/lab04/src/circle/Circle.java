package circle;

public class Circle {
    private double radius ;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle() {
        this.radius = 1;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "cricle.Cricle[" +
                "radius=" + radius +
                ']';
    }
}
