package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to Java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        System.out.println();

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Gurhan";
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "Automation";
        audioBook.listen();

        System.out.println();

        Ebook ebook = new Ebook();
        ebook.title = "java data structures";
        ebook.author = "Savitch";
        ebook.type = "pragramming";
        ebook.price = 85.0;
        ebook.size = 2;
        ebook.pages = 1000;
        ebook.readBook();
    }
}
