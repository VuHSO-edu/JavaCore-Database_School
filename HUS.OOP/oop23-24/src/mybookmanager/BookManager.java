package mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        /* TODO */
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public MyList getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        /* TODO */
        bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        /* TODO */
        bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        /* TODO */
        bookList.insertAtPosition(book, index);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        bookList.remove(index);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        if (index < 0 || index >= bookList.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + bookList.size());
        }

        MyIterator iterator = bookList.iterator();
        Book currentBook = null;

        for (int i = 0; i <= index; i++) {
            currentBook = (Book) iterator.next();
        }

        return currentBook;
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        if (bookList.size() == 0) {
            return null; // return null if the list is empty
        }

        MyIterator iterator = bookList.iterator();
        Book highestPriceBook = (Book) iterator.next(); // start with the first book

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPrice() > highestPriceBook.getPrice()) {
                highestPriceBook = currentBook; // update if the current book has a higher price
            }
        }

        return highestPriceBook;
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        if (bookList.size() == 0) {
            return null; // return null if the list is empty
        }

        MyIterator iterator = bookList.iterator();
        Book lowestPriceBook = (Book) iterator.next(); // start with the first book

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPrice() < lowestPriceBook.getPrice()) {
                lowestPriceBook = currentBook; // update if the current book has a lower price
            }
        }

        return lowestPriceBook;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        if (bookList.size() == 0) {
            return null; // return null if the list is empty
        }

        MyIterator iterator = bookList.iterator();
        Book highestPagesBook = (Book) iterator.next(); // start with the first book

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPages() > highestPagesBook.getPages()) {
                highestPagesBook = currentBook; // update if the current book has more pages
            }
        }

        return highestPagesBook;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        if (bookList.size() == 0) {
            return null; // return null if the list is empty
        }

        MyIterator iterator = bookList.iterator();
        Book lowestPagesBook = (Book) iterator.next(); // start with the first book

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPages() < lowestPagesBook.getPages()) {
                lowestPagesBook = currentBook; // update if the current book has fewer pages
            }
        }

        return lowestPagesBook;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        /* TODO */
        MyList filteredBooks = new MyLinkedList();
        MyIterator iterator = bookList.iterator();

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getPublisher().equals(publisher)) {
                filteredBooks.insertAtEnd(currentBook);
            }
        }

        return filteredBooks;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        /* TODO */
        MyList filteredBooks = new MyLinkedList();
        MyIterator iterator = bookList.iterator();

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getGenre().equals(genre)) {
                filteredBooks.insertAtEnd(currentBook);
            }
        }

        return filteredBooks;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        /* TODO */
        MyList filteredBooks = new MyLinkedList();
        MyIterator iterator = bookList.iterator();

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            if (currentBook.getAuthor().equals(author)) {
                filteredBooks.insertAtEnd(currentBook);
            }
        }

        return filteredBooks;
    }
}