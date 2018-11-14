public class Book {

    private BookGenre genre;

    public Book(BookGenre genre){
        this.genre = genre;
    }

    public BookGenre getBookGenre(){
        return this.genre;
    }
}
