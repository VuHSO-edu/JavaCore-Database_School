package lab1;

public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;
        extractDigits(n);
    }

    public static void extractDigits(int n) {
        int number = 0;
        while (n > 0) {
            int digits = n % 10;
            System.out.print(digits + " ");
            n = n / 10;
        }
    }
}
