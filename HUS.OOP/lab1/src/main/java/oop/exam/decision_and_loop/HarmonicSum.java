package lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        harmonicSum();
    }

    public static void harmonicSum(){
        final int MAX_DENOMINATOR = 5000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            sumL2R += (1 / (double) denominator);
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        for (int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--) {
            sumR2L += (1 / (double) denominator);
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);
        if (sumL2R != sumR2L) {
            absDiff = (sumL2R > sumR2L) ? sumL2R - sumR2L : sumR2L - sumL2R;
            System.out.println("The two sums aren't the same and absolute different is: " + absDiff);
        } else {
            System.out.println("The two sums are the same");
        }
    }
}
