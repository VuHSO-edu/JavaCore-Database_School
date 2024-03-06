import java.util.Scanner;

public class NestedLoopsExercise {
    private static Scanner scanner = new Scanner(System.in);

    public static void squarePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testSquarePattern() {
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scanner.nextLine());

        if (size < 0) {
            throw new IllegalStateException("non-negative integer");
        }
        squarePattern(size);
        scanner.close();
    }

    public static void checkerPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern() {
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scanner.nextLine());

        if (size < 0) {
            throw new IllegalStateException("non-negative integer");
        }
        checkerPattern(size);
    }

    public static void timeTable(int n) {
        System.out.print("*  |");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void testTimeTable() {
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scanner.nextLine());

        if (size < 0) {
            throw new IllegalStateException("non-negative integer");
        }

        timeTable(size);
        scanner.close();
    }

    public static void triangularPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col <= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col >= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scanner.nextLine());
        scanner.close();

        triangularPatternA(size);
        System.out.println();
        triangularPatternB(size);
        System.out.println();
        triangularPatternC(size);
        System.out.println();
        triangularPatternD(size);
    }

    public static void boxPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row + col == n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == col || row + col == n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        boxPatternA(size);
        System.out.println();
        boxPatternB(size);
        System.out.println();
        boxPatternC(size);
        System.out.println();
        boxPatternD(size);
    }

    public static void hillPatternA(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= 2 * rows - 1; col++) {
                if (row + col >= rows + 1 && row >= col - rows + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int rows) {
        for (int row = rows; row >= 1; row++) {
            for (int col = 1; col >= 2 * rows - 1; col++) {
                if (row + col >= rows + 1 && row <= col - rows + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows; col++) {
                if (row + col >= rows + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int rows) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testHillPatternX() {
        System.out.print("Enter the rows: ");
        int rows = Integer.parseInt(scanner.nextLine());
        scanner.close();

        hillPatternA(rows);
        System.out.println();

    }

    public static void main(String[] args) {
        //testSquarePattern();
        //testCheckerPattern();
        //testTimeTable();
        //testTriangularPattern();
        //testBoxPattern();
        testHillPatternX();

    }

}
