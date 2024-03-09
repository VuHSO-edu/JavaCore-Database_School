package my_polynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder polynomial = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i != getDegree()) polynomial.append(" + ");
                polynomial.append(coeffs[i]);
                if (i > 0) polynomial.append("x");
                if (i > 1) polynomial.append("^").append(i);
            }
        }
        return polynomial.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = getDegree(); i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(getDegree(), right.getDegree()) + 1;
        double[] newCoeffs = new double[maxDegree];

        for (int i=0; i <= getDegree(); i++) newCoeffs[i] += this.coeffs[i];

        for(int j=0; j <= right.getDegree(); j++) newCoeffs[j] += right.coeffs[j];

        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right){
        int degree=this.getDegree()+right.getDegree();
        double[] product=new double[degree+1];

        for(int m=0;m<=this.getDegree();m++){
            for(int n=0;n<=right.getDegree();n++){
                product[m+n]+=(this.coeffs[m]*right.coeffs[n]);
            }
        }

        return new MyPolynomial(product);
    }

}
