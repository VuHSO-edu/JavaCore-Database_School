package hus.oop.bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    private static final BookManager bookManager = new BookManager();

    public static void main(String[] args) {
        init();
        testOriginalData();
        System.out.println("Test testSortIncreasingTitleAndPrice ");
        testSortIncreasingTitleAndPrice();
        System.out.println("testFilterBooksHighestPrice");
        testFilterBooksHighestPrice();
        System.out.println("testFilterBooksLowestPrice");
        testFilterBooksLowestPrice();
        System.out.println("testFilterBooksOfAuthor");
        testFilterBooksOfAuthor();
        System.out.println("testFilterBooksOfGenre");
        testFilterBooksOfGenre();
        System.out.println("testFilterBooksOfPublisher");
        testFilterBooksOfPublisher();
        System.out.println("testSortDecreasingTitleAndPrice");
        testSortDecreasingTitleAndPrice();
        System.out.println("testPriceOfBooksDecreasing");
        testPriceOfBooksDecreasing();
        System.out.println("testPriceOfBooksIncreasing");
        testPriceOfBooksIncreasing();




        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BookManager>.txt (Ví dụ, NguyenVanA_123456_BookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookManager>.zip (Ví dụ, NguyenVanA_123456_BookManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào bookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
                Book newBook = new Book.BookBuilder(dataList.get(0)) // title
                        .withAuthor(dataList.get(1)) // author
                        .withGenre(dataList.get(2)) // genre
                        .withPages(Integer.parseInt(dataList.get(3))) // pages
                        .withPrice(Double.parseDouble(dataList.get(4))) // price
                        .withPublisher(dataList.get(5)) // publisher
                        .build();
                bookManager.insertAtEnd(newBook);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        List<Book> books = bookManager.getBookList();
        System.out.print(books);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo tiêu chí, đầu tiên theo title tăng dần, sau đó theo giá giảm dần.
     */
    public static void testSortIncreasingTitleAndPrice() {
        /* TODO */
        List<Book> books = bookManager.sortIncreasingTitleAndPrice();
        System.out.println(books);
        System.out.println();

    }

    /**
     * Test sắp xếp book theo tiêu chí, đầu tiên theo title giảm dần, sau đó theo giá giảm dần.
     */
    public static void testSortDecreasingTitleAndPrice() {
        /* TODO */
        List<Book> books = bookManager.sortDecreasingTitleAndPrice();
        System.out.println(books);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo giá tăng dần.
     */
    public static void testPriceOfBooksIncreasing() {
        /* TODO */
        List<Book> books = bookManager.sortIncreasingPrice();
        System.out.println(books);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo giá giảm dần
     */
    public static void testPriceOfBooksDecreasing() {
        /* TODO */
        List<Book> books = bookManager.sortDecreasingPrice();
        System.out.println(books);
        System.out.println();
    }

    /**
     * Test lọc ra những book có giá rẻ nhất.
     */
    public static void testFilterBooksLowestPrice() {
        /* TODO */
        List<Book> books = bookManager.filterBookLowestPrice(10);
        System.out.println(books);
        System.out.println();
    }

    /**
     * Test lọc ra những book có giá cao nhất.
     */
    public static void testFilterBooksHighestPrice() {
        /* TODO */
        List<Book> books = bookManager.filterHighestPrice(10);
        System.out.println(books);
        System.out.println();
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        /* TODO */
        List<Book> books = bookManager.filterBooksOfAuthor("Goswami Jaideva");
        System.out.println(books);
        System.out.println();
    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        /* TODO */
        List<Book> books = bookManager.filterBooksOfPublisher("Wiley");
        System.out.println(books);
        System.out.println();
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        /* TODO */
        List<Book> books = bookManager.filterBooksOfGenre("signal_processing");
        System.out.println(books);
        System.out.println();
    }


}
