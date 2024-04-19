import java.util.Scanner;

public class AlgorithmsNumberTheoryExercise {

    private static final Scanner scanner = new Scanner(System.in);
    public static boolean isPerfect(int aPosInt) {
        int sum = 1;
        for (int i = 2; i * i <= aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
                if (i != aPosInt / i)
                    sum += aPosInt / i;
            }
        }
        return sum == aPosInt && aPosInt != 1;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 1;
        for (int i = 2; i * i <= aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
                if (i != aPosInt / i)
                    sum += aPosInt / i;
            }
        }
        return sum < aPosInt;
    }

    public static void listNeitherDeficientNorPerfect(int upperBound) {
        int count = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " numbers found (" + (count * 100.0 / upperBound) + "%)");
    }

    public static void perfectNumberList() {
        System.out.print("Enter the upper bound: ");
        int upperBound = Integer.parseInt(scanner.nextLine());
        int perfectCount = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                perfectCount++;
            }
        }
        System.out.println("\n" + perfectCount + " perfect numbers found (" + (perfectCount * 100.0 / upperBound) + "%)");

        int count = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " numbers found (" + (count * 100.0 / upperBound) + "%)");
    }

    public static boolean isPrime(int aPosInt) {
        boolean[] isPrime = new boolean[aPosInt + 1];

        for (int i = 2; i <= aPosInt; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= aPosInt; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= aPosInt; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime[aPosInt];
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt; i++) {
            if (isPrime(i) && aPosInt % i == 0 ) {
                product *= i;
            }
        }
        return product == aPosInt;
    }

    public static void perfectPrimeFactorList() {
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
        scanner.close();

        System.out.println("These numbers are equal to the product of prime factors:");
        int count = 1;
        for (int i = 2; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i) && !isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " numbers found (" + (count * 100.0 / upperBound) + "%)");
    }

    public static int gcd(int a,int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        //perfectNumberList();

//        System.out.print("Please enter the upper bound: ");
//        int upperBound = scanner.nextInt();
//
//        int count = 1;
//        for (int i = 2; i <= upperBound; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//                count++;
//                if (count % 10 == 0)
//                    System.out.println();
//            }
//        }
//
//        double percentage = ((double) count / upperBound) * 100;
//        System.out.printf("%n[%d primes found (%.2f%%)]%n", count, percentage);

        //perfectPrimeFactorList();

        //System.out.println("gcd(10,120) = " + gcd(10, 120));

    }
}
