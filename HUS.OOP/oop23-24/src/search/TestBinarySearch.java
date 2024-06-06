package search;

import java.util.Random;



public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật toán tìm kiếm nhị phân với
          mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */
        testBubbleSort();
        System.out.println();
        testInsertionSort();
        System.out.println();
        testSelectionSort();
        System.out.println();

    }

    private static void testSortAndSearch(BinarySearch search, double[] data, String algorithmName) {
        System.out.println("Using " + algorithmName + " Algorithm:");
        System.out.print("Before sorting: ");
        printArray(data);
        search.sort(data, true);
        System.out.print("After sorting: ");
        printArray(data);

        Random rand = new Random();
        double value = data[rand.nextInt(data.length)];
        System.out.print("Binary search giá trị " + value + ": ");
        int index = search.search(data, value);
        System.out.println(index);
    }

    private static void printArray(double[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }

    private static void testBubbleSort() {
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;
        double[] data = new double[n];

        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(101); // Random integer between 0 and 100
            data[i] = value;
        }

        BinarySearch search = BinarySearch.getInstance();
        search.setSorter(new BubbleSort());
        testSortAndSearch(search, data, "Bubble Sort");
    }

    private static void testInsertionSort() {
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;
        double[] data = new double[n];

        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(101); // Random integer between 0 and 100
            data[i] = value;
        }

        BinarySearch search = BinarySearch.getInstance();
        search.setSorter(new InsertionSort());
        testSortAndSearch(search, data, "Insertion Sort");
    }

    private static void testSelectionSort() {
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;
        double[] data = new double[n];

        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(101); // Random integer between 0 and 100
            data[i] = value;
        }

        BinarySearch search = BinarySearch.getInstance();
        search.setSorter(new SelectionSort());
        testSortAndSearch(search, data, "Selection Sort");
    }

}
