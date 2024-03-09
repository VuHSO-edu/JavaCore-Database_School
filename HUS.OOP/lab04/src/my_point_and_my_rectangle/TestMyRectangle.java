package my_point_and_my_rectangle;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(0, 0, 5, 5);
        System.out.println(rectangle1);
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Area: " + rectangle1.getArea());

        MyPoint topLeft = new MyPoint(1, 1);
        MyPoint bottomRight = new MyPoint(4, 4);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle2);
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Area: " + rectangle2.getArea());
    }
}
