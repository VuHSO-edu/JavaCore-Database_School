package rootsolver;

public class MyMath {

    public static double sin(double x) {

        /* TODO */
        int n = 100; // Number of terms in the Taylor series expansion
        double result = x;
        double term = x;
        for (int i = 1; i <= n; i++) {
            term *= -1 * x * x / (2 * i * (2 * i + 1));
            result += term;
        }
        return result;
    }

    public static double cos(double x) {
        /* TODO */
        int n = 100; // Number of terms in the Taylor series expansion
        double result = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= -1 * x * x / (2 * i * (2 * i - 1));
            result += term;
        }
        return result;
    }

    public double exp(double x) {
        /* TODO */
        int n = 100; // Number of terms in the Taylor series expansion
        double result = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            result += term;
        }
        return result;
    }

    public double ln(double x) {
        /* TODO */
        if (x <= 0) {
            throw new IllegalArgumentException("Input must be a positive number");
        }

        int n = 100; // Number of terms in the power series expansion
        double result = 0.0;
        double fraction = (x - 1) / (x + 1);

        for (int i = 0; i < n; i++) {
            double term = 1.0 / (2 * i + 1);
            result += term * Math.pow(fraction, 2 * i + 1);
        }

        result *= 2;
        return result;
    }
}
