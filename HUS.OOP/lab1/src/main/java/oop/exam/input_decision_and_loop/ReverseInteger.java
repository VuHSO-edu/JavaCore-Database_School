package lab1;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println("The reverse is: " + reversedNumber);
        scanner.close();
    }
}

