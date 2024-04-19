package cricle;

public class TestProgram101 {
    public static void main(String[] args) {
        Cricle cricle1 = new Cricle(1.1);
        System.out.println(cricle1);
        Cricle cricle2 = new Cricle(1.1);
        System.out.println(cricle2);
        cricle1.setRadius(2.2);
        System.out.println(cricle1);
        System.out.println("radius is: " + cricle1.getRadius());

        System.out.printf("area is:  %.2f%n" ,  cricle1.getArea());
        System.out.printf("circumference is:  %.2f%n" ,  cricle1.getCircumference());


    }
}
