import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book(BookGenre.CRIME);
    }

    @Test
    public void canGetGenre(){
        assertEquals(BookGenre.CRIME, book.getBookGenre());
    }
}
