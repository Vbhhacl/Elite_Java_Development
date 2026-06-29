import java.util.List;

import com.mmcoe.dao.BookDao;
import com.mmcoe.dao.BookDaoCollectionImpl;
import com.mmcoe.pojo.Book;

public class TestDao {

    public static void main(String[] args) {

        BookDao dao = new BookDaoCollectionImpl();

        // Save Books
        dao.save(new Book(101, "Java Programming", "James Gosling", 500));
        dao.save(new Book(102, "Python Basics", "Guido Van Rossum", 450));
        dao.save(new Book(103, "C Programming", "Dennis Ritchie", 300));
        dao.save(new Book(104, "Data Structures", "Mark Allen", 650));

        System.out.println("All Books");
        List<Book> books = dao.list();
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("Find Book");
        Book book = dao.find(102);

        if (book != null)
            System.out.println(book);
        else
            System.out.println("Book Not Found");

        System.out.println("\nBooks Between Price 400 and 600");
        List<Book> list = dao.findByPrice(400, 600);

        for (Book b : list) {
            System.out.println(b);
        }

        System.out.println("\nDelete Book");
        if (dao.delete(103))
            System.out.println("Book Deleted");
        else
            System.out.println("Book Not Found");

        System.out.println("\nUpdated Book List");
        for (Book b : dao.list()) {
            System.out.println(b);
        }
    }
}