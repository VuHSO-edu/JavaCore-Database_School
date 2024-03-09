package my_point_and_my_rectangle;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() + ",bottomRight=" + bottomRight.toString() + "]";
    }

    public double getPerimeter() {
        double width = this.topLeft.distance(this.bottomRight.getX(), this.topLeft.getY());
        double height = this.topLeft.distance(this.topLeft.getX(), this.bottomRight.getY());

        return 2 * (width + height);
    }

    public double getArea() {
        double width = this.topLeft.distance(this.bottomRight.getX(), this.topLeft.getY());
        double height = this.topLeft.distance(this.topLeft.getX(), this.bottomRight.getY());

        return width * height;
    }
}
