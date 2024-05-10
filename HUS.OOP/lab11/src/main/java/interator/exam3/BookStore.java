package interator.exam3;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================
public class BookStore {

    public static void main(String[] args) {
        GenreBookCollection mysteryBooks = new GenreBookCollection();
        mysteryBooks.addBook(new Book("The Girl with the Dragon Tattoo", "Stieg Larsson"));
        mysteryBooks.addBook(new Book("Gone Girl", "Gillian Flynn"));

        GenreBookCollection sciFiBooks = new GenreBookCollection();
        sciFiBooks.addBook(new Book("Dune", "Frank Herbert"));
        sciFiBooks.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));

        printBooks("Mystery", mysteryBooks);
        printBooks("Sci-Fi", sciFiBooks);
    }

    private static void printBooks(String genre, GenreBookCollection bookCollection) {
        System.out.println("Books in the " + genre + " genre:");
        BookIterator iterator = bookCollection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
