package lab1;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + nMax + " Fibonacci number are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        System.out.println();
        System.out.println("The average is " + (average = (double) sum / 20));
    }
}

