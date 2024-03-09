package my_complex;

import java.util.Scanner;

public class TestProgramMyComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex myComplex1 = new MyComplex(real1,imag1);
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex myComplex2 = new MyComplex(real2, imag2);

        System.out.print("Number 1 is: " + "(" + myComplex1.toString() +")");
        System.out.println();
        if (myComplex1.isReal()) {
            System.out.println("(" + myComplex1.toString() + ")" + " is a pure real number");
        } else {
            System.out.println("(" + myComplex1.toString() + ")" + " is NOT a pure real number");
        }

        if (myComplex1.isImaginary()) {
            System.out.println("(" + myComplex1.toString() + ")" + " is a pure imaginary number");
        } else {
            System.out.println("(" + myComplex1.toString() + ")" + " is NOT a pure imaginary number");
        }

        if (myComplex1.equals(myComplex2)) {
            System.out.println("(" + myComplex1.toString() + ")" + "is equal to (" + myComplex2.toString() + ")" );
        } else {
            System.out.println("(" + myComplex1.toString() + ")" + "is NOT equal to (" + myComplex2.toString() + ")" );
        }

        System.out.println("(" + myComplex1.toString() + ") +" + "(" + myComplex2.toString() + ") = " + myComplex1.addNew(myComplex2).toString() );
    }
}
