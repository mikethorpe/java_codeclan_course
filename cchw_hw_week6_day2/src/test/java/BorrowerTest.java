import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        book = new Book(BookGenre.SCIFI);
        borrower = new Borrower();
        library = new Library(3);
        library.addBook(book);
    }

    @Test
    public void canGetCollectionCount(){
        assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.getCollectionCount());
    }

}
