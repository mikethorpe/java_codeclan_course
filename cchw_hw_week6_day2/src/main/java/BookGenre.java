public enum BookGenre {
    THRILLER("Exciting stuff"),
    CRIME("Illegal stuff"),
    SCIFI("Questionable science stuff");

    private String description;

    BookGenre(String description){
        this.description = description;
    }
}
