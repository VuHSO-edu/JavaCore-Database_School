package rootsolver;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double x = lower; // Initial guess
        for (int i = 0; i < maxIterations; i++) {
            double fx = function.evaluate(x);
            double dfx = function.derivative(x);

            if (Math.abs(dfx) < tolerance) {
                return Double.NaN;
            }

            double dx = fx / dfx;
            x = x - dx;

            if (Math.abs(dx) < tolerance) {
                return x;
            }
        }

        throw new IllegalArgumentException("Exceeded max iterations");
    }
}
