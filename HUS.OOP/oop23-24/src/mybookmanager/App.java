package mybookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        init();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_MyBookManager>.txt (Ví dụ, NguyenVanA_123456_MyBookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookMyManager>.zip (Ví dụ, NguyenVanA_123456_BookMyManager.zip),
          nộp lên classroom.
         */
        testOriginalData();
        testFilterBooksOfAuthor();
        testFilterBooksOfPublisher();
        testFilterBooksOfGenre();
        testGetHighestPriceBook();
        testGetLowestPriceBook();
        testGetHighestNumberOfPagesBook();
        testGetLowestNumberOfPagesBook();
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

            BookManager bookManager = BookManager.getInstance();
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
                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào BookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
                Book newBook = new Book.BookBuilder(dataList.get(0))
                        .withAuthor(dataList.get(1))
                        .withGenre(dataList.get(2))
                        .withPages(Integer.parseInt(dataList.get(3)))
                        .withPrice(Double.parseDouble(dataList.get(4)))
                        .withPublisher(dataList.get(5))
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
        BookManager bookManager = BookManager.getInstance();

        // Get the bookList from the BookManager
        MyList bookList = bookManager.getBookList();

        // Create an iterator for the bookList
        MyIterator iterator = bookList.iterator();

        // Iterate over the bookList and print the details of each book
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            System.out.println(currentBook.toString());
        }
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        /* TODO */
        BookManager bookManager = BookManager.getInstance();

        // Filter books of a specific author
        String author = "Author Name"; // replace with the actual author's name
        MyList filteredBooks = bookManager.filterBooksOfAuthor(author);

        // Print the details of the filtered books
        System.out.println("Books by " + author + ":");
        MyIterator iterator = filteredBooks.iterator();
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            System.out.println(currentBook.toString());
        }
    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        /* TODO */
        BookManager bookManager = BookManager.getInstance();

        // Filter books of a specific publisher
        String publisher = "Publisher Name"; // replace with the actual publisher's name
        MyList filteredBooks = bookManager.filterBooksOfPublisher(publisher);

        // Print the details of the filtered books
        System.out.println("Books by " + publisher + ":");
        MyIterator iterator = filteredBooks.iterator();
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            System.out.println(currentBook.toString());
        }
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        /* TODO */
        BookManager bookManager = BookManager.getInstance();

        // Filter books of a specific genre
        String genre = "Genre Name"; // replace with the actual genre
        MyList filteredBooks = bookManager.filterBooksOfGenre(genre);

        // Print the details of the filtered books
        System.out.println("Books of genre " + genre + ":");
        MyIterator iterator = filteredBooks.iterator();
        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            System.out.println(currentBook.toString());
        }
    }

    /**
     * Test lấy ra sách có giá cao nhất.
     */
    public static void testGetHighestPriceBook() {
        BookManager bookManager = BookManager.getInstance();

        // Get the book with the highest price
        Book highestPriceBook = bookManager.highestPriceBook();

        // Print the details of the book with the highest price
        if (highestPriceBook != null) {
            System.out.println("Book with the highest price: " + highestPriceBook.toString());
        } else {
            System.out.println("No books available.");
        }
    }

    /**
     * Test lấy ra sách có giá thấp nhất.
     */
    public static void testGetLowestPriceBook() {
        BookManager bookManager = BookManager.getInstance();

        // Get the book with the lowest price
        Book lowestPriceBook = bookManager.lowestPriceBook();

        // Print the details of the book with the lowest price
        if (lowestPriceBook != null) {
            System.out.println("Book with the lowest price: " + lowestPriceBook.toString());
        } else {
            System.out.println("No books available.");
        }
    }

    /**
     * Test lấy ra sách có số trang cao nhất.
     */
    public static void testGetHighestNumberOfPagesBook() {
        BookManager bookManager = BookManager.getInstance();

        // Get the book with the highest number of pages
        Book highestPagesBook = bookManager.highestNumberOfPagesBook();

        // Print the details of the book with the highest number of pages
        if (highestPagesBook != null) {
            System.out.println("Book with the highest number of pages: " + highestPagesBook.toString());
        } else {
            System.out.println("No books available.");
        }
    }

    /**
     * Test lấy ra sách có số trang thấp nhất.
     */
    public static void testGetLowestNumberOfPagesBook() {
        BookManager bookManager = BookManager.getInstance();

        // Get the book with the lowest number of pages
        Book lowestPagesBook = bookManager.lowestNumberOfPagesBook();

        // Print the details of the book with the lowest number of pages
        if (lowestPagesBook != null) {
            System.out.println("Book with the lowest number of pages: " + lowestPagesBook.toString());
        } else {
            System.out.println("No books available.");
        }
    }
}
