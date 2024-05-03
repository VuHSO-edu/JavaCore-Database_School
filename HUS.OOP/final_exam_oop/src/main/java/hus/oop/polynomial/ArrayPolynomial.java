package hus.oop.polynomial;

import java.lang.reflect.Array;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        this.coefficents = new double[DEFAULT_CAPACITY];
        this.size = DEFAULT_CAPACITY;
    }

    public ArrayPolynomial(double[] coefficents) {
        /* TODO */
        this.coefficents = coefficents;
        this.size = coefficents.length;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficientAt(int index) {
        /* TODO */
        return this.coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return this.coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtStart(double coefficient) {
        /* TODO */
        if (size == this.coefficents.length) {
            allocateMore();
        }

        for (int i = size ; i > 0; i--) {
            this.coefficents[i] = this.coefficents[i-1];
        }
        this.coefficents[0] = coefficient;
        size++;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtEnd(double coefficient) {
        /* TODO */
        if (size == this.coefficents.length) {
            allocateMore();
        }
        this.coefficents[size] = coefficient;
        size++;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void insertAtPosition(int index, double coefficient) {
        /* TODO */
        if (size == this.coefficents.length) {
            allocateMore();
        }

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        for (int i = size ;  i > index; i--) {
            this.coefficents[i] = this.coefficents[i-1];
        }
        this.coefficents[index] = coefficient;
        size--;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void set(int index, double coefficient) {
        /* TODO */
        this.coefficents[index] = coefficient;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        if (this.coefficents.length == 1) {
            return 0;
        } else {
            return this.coefficents.length - 1
        }
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0;
        double temp = 1;
        for (int i = 0 ; i <= degree() ; i++) {
            temp *= x;
            result += this.coefficents[i] * temp;
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        return null;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int degrees;
        if (degree() > another.degree() ) {
            degrees = degree();
            double[] product = new double[degrees + 1];
            for (int i = 0; i <= another.degree() ; i++ ) {
                product[i] = this.coefficents[i] + another.coefficents[i];
            }
          return new ArrayPolynomial(product);
        } else {
            degrees = another.degree();
            double[] product = new double[degrees + 1];
            for (int i = 0; i <= degree() ; i++ ) {
                product[i] = this.coefficents[i] + another.coefficents[i];
            }
           return new ArrayPolynomial(product);
        }
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        int degrees;
        if (degree() > another.degree() ) {
            degrees = degree();
            double[] product = new double[degrees + 1];
            for (int i = 0; i <= another.degree() ; i++ ) {
                product[i] = this.coefficents[i] - another.coefficents[i];
            }
            return new ArrayPolynomial(product);
        } else {
            degrees = another.degree();
            double[] product = new double[degrees + 1];
            for (int i = 0; i <= degree() ; i++ ) {
                product[i] = this.coefficents[i] - another.coefficents[i];
            }
            return new ArrayPolynomial(product);
        }
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
            int degrees = degree() + another.degree();
            double[] product = new double[degrees + 1];

            for(int m=0;m<=degree();m++){
                for(int n=0;n<= another.degree();n++){
                    product[m+n]+=(this.coefficents[m]*another.coefficents[n] );
                }
            }
            return new ArrayPolynomial(product);
    }

    /**
     * Thêm kích thước mảng gấp đôi để lưu đa thức.
     */
    private void allocateMore() {
        /* TODO */
        if (size == coefficents.length) {
            double[] newArray = new double[coefficents.length * 2];
            System.arraycopy(coefficents, 0, newArray, 0, size);
            coefficents = newArray;
        }
    }
}
