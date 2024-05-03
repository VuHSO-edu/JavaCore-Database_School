package hus.oop.strategy_pattern.exam;

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
        String text = "Hello world";

        System.out.println("1. Capitalize");
        System.out.println("2. Lowercase");
        System.out.println("3. Uppercase");
        System.out.println("Choose formatter:");
        String choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        if (choice.equals("1")) {
            TextEditor editor = new TextEditor(new CapitalizeFormatter());
            editor.print(text);
        } else if (choice.equals("2")) {
            TextEditor editor = new TextEditor(new LowerCaseFormatter());
            editor.print(text);
        } else if (choice.equals("3")) {
            TextEditor editor = new TextEditor(new UpperCareFormatter());
            editor.print(text);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
