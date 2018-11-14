import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThat;

public class LibraryTest {

    private Book book;
    private Library library;

    @Before
    public void before(){
        book = new Book(BookGenre.CRIME);
        library = new Library(2);
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void addBookOverCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.lendBook();
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canGetBooksInGenreCount(){
        library.addBook(book);
        int actual = library.booksInGenreCount(BookGenre.SCIFI);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void canAddToGenreLog(){
        library.addBook(book);
        int actual = library.booksInGenreCount(BookGenre.CRIME);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
