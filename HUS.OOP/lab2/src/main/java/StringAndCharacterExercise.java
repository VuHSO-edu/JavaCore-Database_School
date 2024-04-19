import java.util.Scanner;

public class StringAndCharacterExercise {
    static Scanner scanner = new Scanner(System.in);
    public static String reverseString(String inStr) {
        String outStr = "";
        for (int i = inStr.length() - 1; i >= 0 ; i--) {
            outStr += inStr.charAt(i);
        }

        return outStr;
    }

    public static void testReverseString() {
        System.out.println("Enter a String: ");
        String inStr = scanner.nextLine();
        System.out.println("The reverse of the String " + "\"" + inStr + "\"" + "\"" + reverseString(inStr) + "\"" );
    }

    public static int countVowels(String inStr) {
       inStr =  inStr.toUpperCase();
        int temp = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (c == 'A' || c == 'U' || c == 'E' || c == 'I' || c == 'O' ) {
                temp++;
            }
        }
        return temp;
    }

    public static int countDigits(String inStr) {
        int temp = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isDigit(c)){
                temp++;
            }
        }
        return temp;
    }

    public static void testCountVowelsDigits() {
        System.out.println("Enter a String ");
        String inStr = scanner.nextLine();
        System.out.println(inStr.toUpperCase());
        System.out.print("Number of vowels: " + countVowels(inStr));
        System.out.print(" (");
        System.out.printf("%.2f", (double) countVowels(inStr) / inStr.length() * 100);
        System.out.print(")");
        System.out.println();
        System.out.print("Number of digits: " + countDigits(inStr));
        System.out.print(" (");
        System.out.printf("%.2f", (double)countDigits(inStr) / inStr.length() * 100);
        System.out.print(")");
    }

    public static String phoneKeyPad(String inStr) {
        String outStr = "";
        inStr = inStr.toLowerCase();
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);

            switch (ch) {
                case 'a', 'b', 'c' -> outStr += "2";
                case 'd', 'e', 'f' -> outStr += "3";
                case 'g', 'h', 'i' -> outStr += "4";
                case 'j', 'k', 'l' -> outStr += "5";
                case 'm', 'n', 'o' -> outStr += "6";
                case 'p', 'q', 'r', 's' -> outStr += "7";
                case 't', 'u', 'v' -> outStr += "8";
                case 'w', 'x', 'y', 'z' -> outStr += "9";
                default -> System.out.println("Error");
            }
        }
        return outStr;
    }

    public static void testPhoneKeyPad() {
        System.out.println("Enter a String: ");
        String inStr = scanner.nextLine();

        System.out.println(phoneKeyPad(inStr));
    }

    public static String cipherCaesarCode(String inStr) {
        inStr = inStr.toUpperCase();
        String outStr = "";

        for (int i = 0; i < inStr.length(); i++) {
            char ch = (char)(((inStr.charAt(i) - 'A' + 3) % 26) + 'A');
            outStr += (char)ch;
        }
        return outStr;
    }

    public static void testCipherCaesarCode() {
        System.out.print("Enter a plaintext string: ");
        String inStr = scanner.nextLine();
        System.out.println("The ciphertext string is: " + cipherCaesarCode(inStr));
    }

    public static String decipherCaesarCode(String inStr) {
        inStr = inStr.toUpperCase();
        String outStr = "";

        for (int i = 0; i < inStr.length(); i++) {
            char ch = (char)((inStr.charAt(i) - 3) % 10);
            outStr += (char)ch;
        }
        return outStr;
    }

    public static void testDecipherCaesarCode() {
        System.out.print("Enter a ciphertext string: ");
        String inStr = scanner.nextLine();
        System.out.println("The plaintext string is: " + decipherCaesarCode(inStr));
    }

    public static boolean isHexString(String hexStr) {
        hexStr = hexStr.toUpperCase();

        for (int i = 0; i < hexStr.length(); i++) {
            char inChar = hexStr.charAt(i);
            if (!((inChar >= '0' && inChar <= '9' ) || (inChar >= 'A' && inChar <= 'F'))){
                return false;
            }
        }
        return true;

    }

    public static void testHexString() {
        System.out.print("Enter a hex string: ");
        String hexStr = scanner.nextLine();

        if (isHexString(hexStr)) {
            System.out.println("\"" + hexStr + "\"" + " is a hex string");
        } else {
            System.out.println("\"" + hexStr + "\"" + " is NOT a hex string");
        }
    }

    public static int binaryToDecimal(String binStr) {
//        int decimal = 0;
//        int p = 0;
//        while(true){
//            if(binaryNumber == 0){
//                break;
//            } else {
//                int temp = binaryNumber%10;
//                decimal += temp*Math.pow(2, p);
//                binaryNumber = binaryNumber/10;
//                p++;
//            }
//        }
//        return decimal;

        return Integer.parseInt(binStr,2);
    }
    public static void testBinaryToDecimal() {
        System.out.print("Enter a Binary string: ");
        String binStr = scanner.nextLine();
        try {
            System.out.println("The equivalent decimal number for binary " + "\"" +
                    binStr + "\"" + " is " + binaryToDecimal(binStr));
        } catch (Exception e) {
            System.err.print("error: invalid binary string " );
            System.err.print( "\"" + binStr + "\"");
        }
    }

    public static int hexadecimalToDecimal(String hexStr) {
//        int decimal = 0;
//        hexStr = hexStr.toUpperCase();
//        String digits = "0123456789ABCDEF";
//        if (isHexString(hexStr)) {
//            for (int i = 0; i < hexStr.length(); i++) {
//                char ch = hexStr.charAt(i);
//                int digit = digits.indexOf(ch);
//                decimal = decimal * 16 + digit;
//            }
//        }
//        return decimal;
        return Integer.parseInt(hexStr, 16);
    }

    public static void testHexadecimalToDecimal() {
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = scanner.nextLine();
        int decimal = hexadecimalToDecimal(hexStr);
        if (decimal != 0) {
            System.out.println("The equivalent decimal number for hexadecimal \""
                    + "\" is: " + hexadecimalToDecimal(hexStr));
        } else {
            System.err.println("error: invalid hexadecimal string \"" + hexStr +"\"");
        }
    }


    public static int octalToDecimal(String octalStr) {
        int temp = octalStr.length() - 1;
        int decimal = 0;

        for (int i = 0; i < octalStr.length(); i++) {
            int digit = Character.getNumericValue(octalStr.charAt(i));
            decimal += digit * Math.pow(8, temp);
            temp--;
        }
        return decimal;
    }

    public static void testOctalToDecimal() {
        System.out.print("Enter an Octal string:");
        String octal = scanner.nextLine();
        System.out.println("The equivalent decimal number \"" +octal+"\" is:" + octalToDecimal(octal) );
    }


    public static int radixNToDecimal(String radixNStr, int radix) {
        int decimal = 0;
        radixNStr = radixNStr.toUpperCase();
        final String digits = "0123456789ABCDEF";
            for (int i = 0; i < radixNStr.length(); i++) {
                char ch = radixNStr.charAt(i);
                int digit = digits.indexOf(ch);
                decimal = decimal * radix + digit;
            }

        return decimal;
    }

    public static void testRadixNToDecimal() {
        System.out.print("Enter the radix: ");
        int radix = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the string: ");
        String radixNStr = scanner.nextLine();

        System.out.println("The equivalent decimal number \"" +radixNStr+
                "\" is:" + radixNToDecimal(radixNStr, radix) );

    }
    public static void main(String[] args) {
        //testReverseString();

        //testCountVowelsDigits();

        //testPhoneKeyPad();

       //testCipherCaesarCode();

        //testDecipherCaesarCode();

        //testHexString();

        //testBinaryToDecimal();

        testHexadecimalToDecimal();

        //testOctalToDecimal();

        //testRadixNToDecimal();


    }
}
