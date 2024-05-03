package hus.oop.polynomial;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */

    final double ERROR = 0.01;
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        if ((polynomial.evaluate(lower) * polynomial.evaluate(upper) )>= 0) {
            return 0;
        }
        double temp = lower;
        while ((upper - lower) >= ERROR) {
            temp = (lower + upper) / 2;
            if (polynomial.evaluate(temp) == 0.0) {
                break;
            } else if (polynomial.evaluate(temp) * polynomial.evaluate(lower) < 0) {
                upper = temp;
            } else {
                lower = temp;
            }
        }
        return temp;

    }
}
