package hus.oop.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        double[] coefficients = coefficients();
        for (int i = 0; i < coefficients.length; i++) {
            if (i == 0) {
                sb.append(coefficients[i]);
            } else if (i == 1) {
                sb.append(" + ").append(coefficients[i]).append("x");
            } else {
                sb.append(" + ").append(coefficients[i]).append("x^").append(i);
            }
        }
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] coefficients = coefficients();
        double[] derivativeCoefficients = new double[coefficients.length - 1];
        for (int i = 1; i < coefficients.length; i++) {
            derivativeCoefficients[i - 1] = coefficients[i] * i;
        }
        return derivativeCoefficients;
    }
}
