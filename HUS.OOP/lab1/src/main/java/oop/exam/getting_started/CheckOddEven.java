package oop.exam.getting_started;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Number is " + number);
        if (number % 2 == 0) {
            System.out.println("Number is Odd Number");
        } else {
            System.out.println("Number is Even Number");
        }
        System.out.println("Bye!");
    }
}
