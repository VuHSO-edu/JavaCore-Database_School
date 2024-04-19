import java.util.Scanner;

public class ArrayExercise {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] createArray(Scanner in) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = Integer.parseInt(in.nextLine());
        int[] items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = in.nextInt();

        }
        return items;
    }

    public static void printArray(int[] arr) {
        System.out.print("The value are: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(in.nextLine());

        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            int grade = in.nextInt();
            while (grade < 0 || grade > 100) {
                System.out.println("Grade must be between 0 and 100. Please enter again.");
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grade = in.nextInt();
            }
            grades[i] = grade;
        }

        return grades;
    }

    public static void simpleGradesStatistics() {
        int[] grades = generateStudentGrade(scanner);
        int sum = 0;
        int min = grades[0];
        int max = grades[0];

        for (int grade : grades) {
            sum += grade;
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }
        double average = (double) sum / grades.length;

        System.out.println("The average is: " + String.format("%.2f", average));
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }


    public static String hexadecimalToBinary(String hexStr) {
        hexStr = hexStr.toUpperCase();
        final String[] HEX_BITS ={"0000","0001","0010","0011",
                                "0100","0101","0110","0111",
                                "1000", "1001", "1010", "1011",
                                "1100","1101","1110","1111"};
        String digits = "0123456789ABCDEF";
        String binStr = "";
        for (int i = 0; i < hexStr.length(); i++) {
            char ch = hexStr.charAt(i);
            binStr += HEX_BITS[digits.indexOf(ch)] + " ";
        }
        return binStr;
    }

    public static void testHexadecimalToBinary() {
        System.out.print("Enter a Hexdecimal string: ");
        String hexStr = scanner.nextLine();

        if (StringAndCharacterExercise.isHexString(hexStr)) {
            System.out.print("The equivalent binary for hexadecimal \""
                    + hexStr + "\" is: " + hexadecimalToBinary(hexStr));
        } else {
            System.err.println(hexStr + " is not Hexadecimal");
        }
    }

    public static String decimalToHexadecimal(int positiveInteger) {
        if (positiveInteger == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();

        while (positiveInteger > 0) {
            int remainder = positiveInteger % 16;
            char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
            hexadecimal.insert(0, hexDigit);
            positiveInteger /= 16;
        }

        return hexadecimal.toString();
    }

    public static void testDecimalToHexadecimal() {
        System.out.print("Enter a decimal number: ");
        int positiveInteger = scanner.nextInt();

        if (positiveInteger < 0) {
            System.out.println("Input must be a positive decimal number.");
            return;
        }

        String hexadecimal = decimalToHexadecimal(positiveInteger);
        System.out.println("The equivalent hexadecimal number is " + hexadecimal);
    }
    public static void main(String[] args) {
       // printArray(createArray(scanner));
       // simpleGradesStatistics();

        //testHexadecimalToBinary();

        //testDecimalToHexadecimal();

    }
}
