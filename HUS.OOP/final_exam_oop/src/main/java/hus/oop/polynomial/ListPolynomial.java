package hus.oop.polynomial;

import java.util.LinkedList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        this.coefficients = new LinkedList<>();
    }

    public ListPolynomial(Double[] coefficients) {
        this.coefficients = List.of(coefficients);
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficientAt(int index) {
        /* TODO */
        return this.coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return mảng các hệ số của đa thức
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return this.coefficients.stream().mapToDouble(Double::doubleValue).toArray();
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtStart(double coefficient) {
        /* TODO */
        coefficients.add(0, coefficient);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtEnd(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void insertAtPosition(int index, double coefficient) {
        /* TODO */
        coefficients.add(index, coefficient);
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void set(int index, double coefficient) {
        /* TODO */
        coefficients.set(index, coefficient);
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        if (this.coefficients.size() - 1 == 1) {
            return 0;
        } else {
            return this.coefficients.size() - 1;
        }
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
            double result = 0;
            double temp = 1;
            for (int i = 0 ; i <= degree() ; i++) {
                temp *= x;
                result += (double)coefficients.get(i) * temp;
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
        return null;
    }


    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        int degrees;
        if (degree() > another.degree() ) {
            degrees = degree();
            Double[] product = new Double[degrees + 1];
            for (int i = 0; i <= another.degree() ; i++ ) {
                        product[i] = this.coefficients.get(i) + another.coefficients.get(i);
            }
            return new ListPolynomial(product);
        } else {
            degrees = another.degree();
            Double[] product = new Double[degrees + 1];
            for (int i = 0; i <= degree() ; i++ ) {
                product[i] = this.coefficients.get(i) + another.coefficients.get(i);
            }
            return new ListPolynomial(product);
        }
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        int degrees;
        if (degree() > another.degree() ) {
            degrees = degree();
            Double[] product = new Double[degrees + 1];
            for (int i = 0; i <= another.degree() ; i++ ) {
                product[i] = this.coefficients.get(i) - another.coefficients.get(i);
            }
            return new ListPolynomial(product);
        } else {
            degrees = another.degree();
            Double[] product = new Double[degrees + 1];
            for (int i = 0; i <= degree() ; i++ ) {
                product[i] = this.coefficients.get(i) - another.coefficients.get(i);
            }
            return new ListPolynomial(product);
        }
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        int degrees = degree() + another.degree();
        Double[] product = new Double[degrees + 1];

        for(int m=0;m<=degree();m++){
            for(int n=0;n<= another.degree();n++){
                product[m+n]+=(this.coefficients.get(m)*another.coefficients.get(n) );
            }
        }

        return new ListPolynomial(product);
    }
}
