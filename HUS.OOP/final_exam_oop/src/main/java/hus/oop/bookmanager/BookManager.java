package hus.oop.bookmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        /* TODO */
        this.bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return this.bookList;
    }

    /**
     * Kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        return index >= 0 && index <= limit;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPos(Book book, int index) {
        /* TODO */
        bookList.add(index, book);
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
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        if (checkBoundaries(index, bookList.size() - 1)) {
            return bookList.get(index);
        } else {
            return null;
        }
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo title.
     * @return
     */
    public List<Book> sortIncreasingByTitle() {
        /* TODO */
        List<Book> sortBook = new LinkedList<>(bookList);
        Collections.sort(sortBook, new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                return left.getTitle().compareTo(right.getTitle());
            }
        });

        return sortBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title tăng dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingTitleAndPrice() {
        /* TODO */
        List<Book> sortBook = new LinkedList<>(bookList);

        Collections.sort(sortBook, new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                if (left.getTitle().compareTo(right.getTitle()) == 0) {
                    return Double.compare(right.getPrice(), left.getPrice());
                } else {
                    return left.getTitle().compareTo(right.getTitle());
                }
            }
        });

        return sortBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title giảm dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingTitleAndPrice() {
        /* TODO */

        List<Book> sortBook = new LinkedList<>(bookList);
        Collections.sort(sortBook, new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                if (left.getTitle().compareTo(right.getTitle()) == 0) {
                    return Double.compare(right.getPrice(), left.getPrice());
                } else {
                    return right.getTitle().compareTo(left.getTitle());
                }
            }
        });

        return sortBook;
    }

    /**
     * Sắp xếp book theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */

        List<Book> sortBook = new LinkedList<>(bookList);
        Collections.sort(sortBook, new MyBookComparator() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        return sortBook;
    }

    /**
     * Sắp xếp book theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */

        List<Book> sortBook = new LinkedList<>(bookList);
        Collections.sort(sortBook, new MyBookComparator() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });

        return sortBook;
    }



    /**
     * Sắp xếp book theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        List<Book> sortBook = new LinkedList<>(bookList);
        Collections.sort(sortBook, new MyBookComparator() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.getPages(), o2.getPages());
            }
        });

        return sortBook;
    }



    /**
     * Sắp xếp book theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */

        List<Book> sortBook = new LinkedList<>(bookList);
        Collections.sort(sortBook, new MyBookComparator() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getPages(), o1.getPages());
            }
        });

        return sortBook;
    }


    /**
     * Lọc ra howMany book có giá lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPrice(int howMany) {
        /* TODO */

        return bookList.stream()
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .limit(howMany)
                .collect(Collectors.toList());
    }

    public List<Book> filterBookLowestPrice(int howMany) {
        return bookList.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .limit(howMany)
                .collect(Collectors.toList());
    }


    /**
     * Lọc ra những book có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(double lowerBound) {
        /* TODO */

        return bookList.stream()
                .filter(book -> book.getPrice() > lowerBound)
                .collect(Collectors.toList());

    }

    /**
     * Lọc ra howMany book có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */

        return bookList.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .limit(howMany)
                .collect(Collectors.toList());

    }

    /**
     * Lọc ra howMany book có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        return bookList.stream()
                .filter(book -> book.getPages() < upperBound)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        return bookList.stream()
                .filter(book -> book.getPublisher().equals(publisher))
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        return bookList.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        return bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());

    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}

