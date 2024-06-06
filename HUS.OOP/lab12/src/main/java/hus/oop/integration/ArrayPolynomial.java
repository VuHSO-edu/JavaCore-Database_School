package hus.oop.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
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

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
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
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (this.size == this.coefficents.length) {
            this.enlarge();
        }
        this.coefficents[this.size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }

        if (this.size == this.coefficents.length) {
            this.enlarge();
        }

        System.arraycopy(this.coefficents, index, this.coefficents, index + 1, this.size - index);
        this.coefficents[index] = coefficient;
        this.size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }

        this.coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        if (this.size == 0) {
            return -1;
        }

        if (this.size == 1) {
            return 0;
        }

        return this.size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0;
        double tmp = 1;
        for (int i = 1; i < this.size; i++) {
            result += this.coefficents[i] * tmp;
            tmp *= x;
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
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < this.size; i++) {
            derivative.append(this.coefficents[i] * i);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int newSize = Math.max(this.size, another.size);
        double[] newCoefficents = new double[newSize];
        for (int i = 0; i < newSize; i++) {
            double thisCoefficient = i < this.size ? this.coefficents[i] : 0;
            double anotherCoefficient = i < another.size ? another.coefficents[i] : 0;
            newCoefficents[i] = thisCoefficient + anotherCoefficient;
        }
        this.coefficents = newCoefficents;
        this.size = newSize;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        int newSize = Math.max(this.size, another.size);
        double[] newCoefficents = new double[newSize];
        for (int i = 0; i < newSize; i++) {
            double thisCoefficient = i < this.size ? this.coefficents[i] : 0;
            double anotherCoefficient = i < another.size ? another.coefficents[i] : 0;
            newCoefficents[i] = thisCoefficient - anotherCoefficient;
        }
        this.coefficents = newCoefficents;
        this.size = newSize;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        int newSize = this.size + another.size - 1;
        double[] newCoefficents = new double[newSize];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < another.size; j++) {
                newCoefficents[i + j] += this.coefficents[i] * another.coefficents[j];
            }
        }
        this.coefficents = newCoefficents;
        this.size = newSize;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        int newCapacity = this.coefficents.length  + 1;
        double[] newCoefficents = new double[newCapacity];
        System.arraycopy(this.coefficents, 0, newCoefficents, 0, size);
        this.coefficents = newCoefficents;
    }
}
