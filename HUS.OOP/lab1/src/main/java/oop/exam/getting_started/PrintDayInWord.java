package oop.exam.getting_started;

public class PrintDayInWord {
    public static void main(String[] args) {
        int number = 5;

        switch (number) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Staurday");
                break;
            default:
                System.err.println("ERROR");
        }

    }
}
