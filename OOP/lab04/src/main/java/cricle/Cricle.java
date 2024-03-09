package cricle;

public class Cricle {
    private double radius ;
    private String color;

    public Cricle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Cricle() {
        this.radius = 1;
        color = "red";
    }

    public Cricle(double radius, String color) {
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
