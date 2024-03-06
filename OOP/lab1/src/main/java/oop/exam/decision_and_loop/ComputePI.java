package lab1;

public class ComputePI {
    public static void main(String[] args) {
        computerPI();
    }
    public static void computerPI() {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (1 / (double) denominator);
            } else if (denominator % 4 == 3) {
                sum -= (1 / (double) denominator);
            } else {
                System.out.println("Impossible!!!");
            }
        }
        double PI = 4 * sum;
        System.out.println("PI is " + PI);
    }
}
