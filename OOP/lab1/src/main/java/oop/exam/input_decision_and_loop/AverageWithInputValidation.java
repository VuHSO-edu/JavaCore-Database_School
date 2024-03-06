package lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        calculateAverage();
    }

    public static void calculateAverage() {
        final int NUM_STUDENTS = 3;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            boolean isValid = false;
            int mark;

            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                mark = scanner.nextInt();

                if (mark >= 0 && mark <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);

            sum += mark;
        }
        double average = (double) sum / NUM_STUDENTS;
        System.out.printf("The average is: %.2f", average);
        scanner.close();
    }
}
