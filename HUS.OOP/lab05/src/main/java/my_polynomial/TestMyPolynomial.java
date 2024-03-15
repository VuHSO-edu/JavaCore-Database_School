package my_polynomial;

import java.util.Scanner;

public class TestMyPolynomial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] coeffs = new double[10];

        for (int i = 0; i < 10; i++) {
            coeffs[i] = scanner.nextDouble();
        }

        MyPolynomial myPolynomial = new MyPolynomial(coeffs);
        System.out.println("myPolynomial = " + myPolynomial);
    }
}
