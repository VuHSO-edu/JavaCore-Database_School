import java.util.Arrays;
import java.util.Scanner;

public class MethodExercise {
    private static Scanner scanner = new Scanner(System.in);
    public static int exponent(int base, int exp) {
        if (exp == 0) {
            return 1;
        }

        int result = base;
        for (int i = 1; i < exp; i++) {
            result *= base;
        }

        return result;
    }

    public static void testExponent() {
        System.out.print("Enter the base: ");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the exponent: ");
        int exp = Integer.parseInt(scanner.nextLine());

        if (exp < 0) {
            throw new IllegalStateException("Exp is a non-negative integer");
        }
        System.out.println(base + " raise to the power of " + exp + " is: " + exponent(base,exp));
    }


    public static boolean hasEight(int number) {
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number /= 10;
        }

        return false;
    }
    public static int testMagicSum(Scanner in) {
        final int SENTINEL = -1;
        int sum = 0;

        System.out.print("Enter a positive integers (or -1 to end): ");
        int number = Integer.parseInt(scanner.nextLine());

        while (true) {

            if (number == SENTINEL) {
                break;
            }
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integers (or -1 to end): ");
            number = Integer.parseInt(scanner.nextLine());
        }

        return sum;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static boolean contains(int[] array, int key) {
        for (int num : array) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static boolean equals(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static int[] copyOf(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0; // Pad with zero if index exceeds original array length
            }
        }
        return newArray;
    }

    public static boolean swap(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        //testExponent();

        //System.out.println("The magic sum is: " + testMagicSum(scanner));

    }
}
