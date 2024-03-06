public class RecursionExercise {

    public static int factorrial(int n) {
        return (n == 0) ? 1 : n * factorrial(n-1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        return (n == 1) ? 1 : fibonacci(n-1) + fibonacci(n-2);
    }

    public static int numOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + numOfDigits(n / 10);
    }

    public static int lengthOfSequence(int n) {
        if (n == 1) {
            return 1;
        }
        return lengthOfSequence(n - 1) + numOfDigits(n);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }




    public static void main(String[] args) {
        //System.out.println("factorrial(10) = " + factorrial(10));
        //System.out.println("fibonacci(10) = " + fibonacci(10));
//        int n = 12;
//        System.out.println("Length of S(" + n + "): " + lengthOfSequence(n));

        //System.out.println(gcd(10, 5));


    }

}
