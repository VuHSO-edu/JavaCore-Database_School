import java.util.Scanner;

public class MathLibraryHomework {
    private static Scanner scanner = new Scanner(System.in);

    private static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double sin(double x, int numTerms) {
        double result = 0;
        for (int i = 0; i < numTerms; i++) {
            int n = 2 * i + 1;
            result += Math.pow(-1, i) * Math.pow(x, n) / factorial(n);
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 1;
        for (int i = 1; i < numTerms; i++) {
            int n = 2 * i;
            result += Math.pow(-1, i) * Math.pow(x, n) / factorial(n);
        }
        return result;
    }

    public static void testTrigonometric() {
        double x = Double.parseDouble(scanner.nextLine());
        int numTerms = Integer.parseInt(scanner.nextLine());

        System.out.println("x = " + x + ", Number of terms = " + numTerms);
        System.out.println("Computed sin(x): " + sin(x, numTerms));
        System.out.println("Math.sin(x): " + Math.sin(x));

        System.out.println("Computed cos(x): " + cos(x, numTerms));
        System.out.println("Math.cos(x): " + Math.cos(x));
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        double numerator = 1;
        double denominator = 2;

        for (int i = 0; i < numTerms; i++) {
            sum += numerator / denominator * x;

            numerator *= (2 * i + 1);
            denominator *= (2 * i + 2);
        }

        return sum;
    }

    public static void testSpecialSeries(double x, int numTerms) {
        System.out.println("x = " + x + ", Number of terms = " + numTerms);
        System.out.println("Sum of the special series: " + specialSeries(x, numTerms));
    }

    public static void factorialInt() {
        int i = 1;
        int fact = 1;
        while (Integer.MAX_VALUE / fact > i) {
            System.out.println("The factorial of " + i + " is " + fact);
            i++;
            fact *= i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }

    public static void factorialLong() {
        long i = 1;
        long fact = 1;
        while (Long.MAX_VALUE / fact > i) {
            System.out.println("The factorial of " + i + " is " + fact);
            i++;
            fact *= i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }

    public static void fibonacciInt() {
        int prev = 1;
        int curr = 1;
        int next;

        System.out.println("F(0) = " + prev);
        System.out.println("F(1) = " + curr);

        int n = 2;
        while (true) {
            next = prev + curr;

            if (next < 0) {
                System.out.println("F(" + n + ") is out of the range of int");
                break;
            }

            System.out.println("F(" + n + ") = " + next);

            prev = curr;
            curr = next;
            n++;
        }
    }

    public static void tribonacciInt() {
        int prevPrev = 0;
        int prev = 1;
        int curr = 1;
        int next;

        System.out.println("T(0) = " + prevPrev);
        System.out.println("T(1) = " + prev);
        System.out.println("T(2) = " + curr);

        int n = 3;
        while (true) {
            next = prevPrev + prev + curr;

            if (next < 0) {
                System.out.println("T(" + n + ") is out of the range of int");
                break;
            }

            System.out.println("T(" + n + ") = " + next);

            prevPrev = prev;
            prev = curr;
            curr = next;
            n++;
        }
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int number = Integer.parseInt(in, inRadix);
        return Integer.toString(number, outRadix);
    }

    public static void testNumberConversion() {
        System.out.print("Enter a number and radix: ");
        String number = scanner.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = scanner.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = scanner.nextInt();
        String convertedNumber = toRadix(number, inRadix, outRadix);
        System.out.println("\"" + number + "\" in radix " + inRadix + " is \"" + convertedNumber + "\" in radix " + outRadix + ".");
    }

    public static void main(String[] args) {
        //testTrigonometric();
        //testSpecialSeries();
        //testNumberConversion();
    }
}
