package hus.oop.strategy_pattern.sort;

import java.util.Scanner;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================
public class App {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("Before sorting:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble sort");
        System.out.println("2. Selection sort");
        System.out.println("3. Insertion sort");
        String choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        if (choice.equals("1")) {
            Sorter sorter = new Sorter(new BubbleSort());
            sorter.sort(numbers);
            for (int i : numbers) {
                System.out.print(i + " ");
            }
        } else if (choice.equals("2")) {
            Sorter sorter = new Sorter(new SelectionSort());
            sorter.sort(numbers);
            for (int i : numbers) {
                System.out.print(i + " ");
            }
        } else if (choice.equals("3")) {
            Sorter sorter = new Sorter(new InsertionSort());
            sorter.sort(numbers);
            for (int i : numbers) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
