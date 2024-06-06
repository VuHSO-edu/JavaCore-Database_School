package rootsolver;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper]
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double lowerFunctionValue = function.evaluate(lower);
        double upperFunctionValue = function.evaluate(upper);

        for (int i = 0; i < maxIterations; i++) {
            double temp = upper;
            upper = upper - upperFunctionValue * (upper - lower) / (upperFunctionValue - lowerFunctionValue);
            upperFunctionValue = function.evaluate(upper);

            if (Math.abs(upper - temp) < tolerance) {
                return upper;
            }

            lower = temp;
            lowerFunctionValue = upperFunctionValue;
        }

        return upper;
    }
}
