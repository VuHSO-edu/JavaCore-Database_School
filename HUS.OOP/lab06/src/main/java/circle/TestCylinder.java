package circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        System.out.println("Cylinder1:"
                + "\nradius= " + cylinder.getRadius()
                + "\nheight= " + cylinder.getHeight()
                + "\ncolor= " + cylinder.getColor()
                + "\nbase area= " + cylinder.getArea()
                + "\nvolume= " + cylinder.getVolume()
        );
        System.out.println();
        Cylinder cylinder2 = new Cylinder();
        System.out.println("Cylinder2:"
                + "\nradius= " + cylinder2.getRadius()
                + "\nheight= " + cylinder2.getHeight()
                + "\ncolor= " + cylinder2.getColor()
                + "\nbase area= " + cylinder2.getArea()
                + "\nvolume= " + cylinder2.getVolume()
        );
        System.out.println();
        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder3:"
                + "\nradius= " + cylinder3.getRadius()
                + "\nheight= " + cylinder3.getHeight()
                + "\ncolor= " + cylinder3.getColor()
                + "\nbase area= " + cylinder3.getArea()
                + "\nvolume= " + cylinder3.getVolume()
        );
    }
}
