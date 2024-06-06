package rootsolver;

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
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        if (function.evaluate(lower) * function.evaluate(upper) >= 0) {
            return Double.NaN;
        }

        double mid = lower;
        for (int i = 0; i < maxIterations; i++) {
            mid = (lower + upper) / 2;

            double midVal = function.evaluate(mid);
            if (Math.abs(midVal) < tolerance) {
                break;
            } else if (function.evaluate(lower) * midVal < 0) {
                upper = mid;
            } else {
                lower = mid;
            }
        }

        return mid;
    }
}
