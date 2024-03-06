import java.util.Scanner;

public class StringAndCharacterHomework {
    private static Scanner scanner = new Scanner(System.in);
    public static String exchangeCipher(String inStr) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = (char) ('A' + 'Z' - ch);
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ('a' + 'z' - ch);
            }
            ciphertext.append(ch);
        }
        return ciphertext.toString().toUpperCase();
    }

    public static void testExchangeCipher() {

        System.out.print("Enter a plaintext string: ");
        String plaintext = scanner.nextLine();
        scanner.close();

        String ciphertext = exchangeCipher(plaintext);
        System.out.println("The ciphertext string is: " + ciphertext);
    }

    public static boolean isPalindromicPhrase(String inStr) {
        inStr = inStr.toLowerCase().replaceAll("[^a-z]", "");
        int forwardIndex = 0;
        int backwardIndex = inStr.length() - 1;

        while (forwardIndex < backwardIndex) {
            char forwardChar = inStr.charAt(forwardIndex);
            char backwardChar = inStr.charAt(backwardIndex);

            if (forwardChar != backwardChar) {
                return false;
            }

            forwardIndex++;
            backwardIndex--;
        }

        return true;
    }

    public static void testPalindromicPhrase() {
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        scanner.close();

        if (isPalindromicPhrase(phrase)) {
            System.out.println("\"" + phrase + "\" is a palindrome.");
        } else {
            System.out.println("\"" + phrase + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        //testExchangeCipher();
        //testPalindromicPhrase();

    }
}
