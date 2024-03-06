import java.util.Scanner;

public class ArrayHomework {
    private static Scanner scanner = new Scanner(System.in);

    public static void printArrayInStars(Scanner in) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = Integer.parseInt(scanner.nextLine());
        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = in.nextInt();
        }

        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + " : ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("∗");
            }
            System.out.println(" (" + items[idx] + ")");
        }
    }

    public static void printArrayInStars() {
        printArrayInStars(scanner);
    }

    public static <N extends Number> void print(N[][] matrix) {
        for (N[] row : matrix) {
            for (N val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static <N extends Number> boolean haveSameDimension(N[][] matrix1, N[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static <N extends Number> N[][] add(N[][] matrix1, N[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }
        var rows = matrix1.length;
        var cols = matrix1[0].length;
        N[][] result = new N[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static <N extends Number> N[][] subtract(N[][] matrix1, N[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction");
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        N[][] result = new N[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static <N extends Number> N[][] multiply(N[][] matrix1, N[][] matrix2) {
        var rows1 = matrix1.length;
        var cols1 = matrix1[0].length;
        var cols2 = matrix2[0].length;
        N[][] result = new N[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //printArrayInStars();
    }
}
