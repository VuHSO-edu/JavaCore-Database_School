package lab1;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        sumProductMinMax3();
        sumProductMinMax5();
    }

    public static void sumProductMinMax3() {
        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int min;
        int max;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        System.out.println("Enter 1st integer: " + number1);
        System.out.println("Enter 2nd integer: " + number2);
        System.out.println("Enter 3rd integer: " + number3);
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }

    public static void sumProductMinMax5() {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int sum;
        int product;
        int min;
        int max;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number4 = sc.nextInt();
        number5 = sc.nextInt();
        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;
        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        if (number5 < min) {
            min = number5;
        }
        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
        }
        System.out.println("Enter 1st integer: " + number1);
        System.out.println("Enter 2nd integer: " + number2);
        System.out.println("Enter 3rd integer: " + number3);
        System.out.println("Enter 4th integer: " + number4);
        System.out.println("Enter 5th integer: " + number5);
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
