package hus.oop.vuhso.polynomials;

public interface Poly {
    double[] coefficients();
    double coefficient(int degree);
    int degree();
    Poly derivative();
}
