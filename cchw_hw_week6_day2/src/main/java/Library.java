import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> bookStock;
    private HashMap<BookGenre, Integer> genreLog;

    public Library(int capacity){
        this.bookStock = new ArrayList<>();
        this.capacity = capacity;
        this.genreLog = new HashMap<>();

        // Initialize genreLog with genres and no books
        for (BookGenre genre: BookGenre.values()) {
            genreLog.put(genre, 0);
        }
    }

    public int getBookCount(){
        return this.bookStock.size();
    }

    public void addBook(Book book){
        if (this.bookStock.size() < this.capacity){
            this.bookStock.add(book);
            addToGenreLog(book);
        }
    }

    /**
     *  Returns the number of books a library has of a specified genre
     *
     *  @param genre the genre of the book passed
     *  @return      the number of books in the genre
     */
    public int booksInGenreCount(BookGenre genre){
        return genreLog.get(genre);
    }


    public Book lendBook(){
        return this.bookStock.remove(0);
    }

    private void addToGenreLog(Book book){
        BookGenre genre = book.getBookGenre();
        int booksInGenre = genreLog.get(genre) + 1;
        genreLog.replace(genre, booksInGenre);
    }
}
