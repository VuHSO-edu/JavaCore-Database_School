package hus.oop.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return this.coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return this.coefficients.stream()
                .mapToDouble(Double::doubleValue)
                .toArray();
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        this.coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        /* TODO */
        this.coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        this.coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        if (this.coefficients.isEmpty()) {
            return -1;
        }
        return this.coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0;
        double tmp = 1;
        for (int i = 0; i < this.coefficients.size(); i++) {
            result += this.coefficients.get(i) * tmp;
            tmp *= x;
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 1; i < this.coefficients.size(); i++) {
            derivative.append(this.coefficients.get(i) * i);
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        int size = Math.max(this.coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < size; i++) {
            double coefficient = 0;
            if (i < this.coefficients.size()) {
                coefficient += this.coefficients.get(i);
            }
            if (i < another.coefficients.size()) {
                coefficient += another.coefficients.get(i);
            }
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        int size = Math.max(this.coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < size; i++) {
            double coefficient = 0;
            if (i < this.coefficients.size()) {
                coefficient += this.coefficients.get(i);
            }
            if (i < another.coefficients.size()) {
                coefficient -= another.coefficients.get(i);
            }
            result.append(coefficient);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        int size = this.coefficients.size() + another.coefficients.size() - 1;
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < size; i++) {
            double coefficient = 0;
            for (int j = 0; j <= i; j++) {
                if (j < this.coefficients.size() && i - j < another.coefficients.size()) {
                    coefficient += this.coefficients.get(j) * another.coefficients.get(i - j);
                }
            }
            result.append(coefficient);
        }
        return result;
    }
}
