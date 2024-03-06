import java.util.Scanner;

public class DecisionAndLoopsHomework {
   public static final int SECRET_NUMBER = (int) (Math.random()*100);
    public static Scanner scanner = new Scanner(System.in);


    public static void guessNumber() {
    guessNumber(SECRET_NUMBER, scanner);
    scanner.close();
    }

    public static void guessNumber(int number, Scanner in) {
        int guessCount = 0;
        System.out.println("Key in your guess:");
        while (true) {

            int guess = in.nextInt();
            guessCount++;

            if (guess == number) {
                System.out.println("You got it in " + guessCount + " trials!");
                break;
            } else if (guess < number) {
                System.out.println("Try higher");
            } else if (guess > number) {
                System.out.println("Try lower");
            }
        }

    }

    public static void guessWord() {
        String guessedString = scanner.nextLine().toLowerCase();
        guessWord(guessedString, scanner);
    }

    public static void guessWord(String guessedString, Scanner in) {

        boolean[] guessedLetters = new boolean[guessedString.length()];
        int trials = 0;

        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String guess = scanner.nextLine().toLowerCase();
            trials++;
            if (guess.length() > 1) {
                if (guess.equals(guessedString)) {
                    System.out.println("Congratulations!");
                    System.out.println("You got in " + trials + " trials");
                    break;
                }
            } else {
                char ch = guess.charAt(0);
                boolean checkGuessed = false;
                for (int i = 0; i < guessedString.length(); i++) {
                    if (ch == guessedString.charAt(i)) {
                        guessedLetters[i] = true;
                        checkGuessed = true;
                    }
                }

                if (!checkGuessed ) {
                    System.out.println("Incorrect guess");
                    break;
                }
                boolean allGuessed = true;
                for (boolean guessedLetter : guessedLetters) {
                    if (!guessedLetter) {
                        allGuessed = false;
                        break;
                    }
                }
                if (allGuessed) {
                    System.out.println("Congratulations!");
                    System.out.println("You got in " + trials + " trials");
                    break;
                }
                System.out.print("Trial " + trials +":");
                for (int i = 0; i < guessedString.length(); i++) {
                    if (guessedLetters[i]) {
                        System.out.print(guessedString.charAt(i));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
    }




    public static void main(String[] args) {
        //guessNumber();
        //guessWord();
    }
}
