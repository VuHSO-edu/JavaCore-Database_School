package lab1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        System.out.println("Circle Computation: ");
        circleComputation();
        System.out.println("---------------------");
        System.out.println("Sphere Computation: ");
        sphereComputation();
        System.out.println("---------------------");
        System.out.println("Cylinder Computation: ");
        cylinderComputation();
    }

    public static void circleComputation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        double diameter = 2.0 * radius;
        double circumference = 2.0 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
    }

    public static void sphereComputation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }

    public static void cylinderComputation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        double volume = baseArea * height;
        System.out.printf("Base Area is: %.2f%n", baseArea);
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}


