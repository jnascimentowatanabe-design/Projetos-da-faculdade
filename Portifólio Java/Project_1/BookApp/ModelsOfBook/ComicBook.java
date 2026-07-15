package Project_1.BookApp.ModelsOfBook;

public class ComicBook extends BookStatus {
    String illustrator;
    String typeOfComicBook;
    
    // Constructor

    public ComicBook(String title, String author) {
        super(title, author);
    }

    // Getters and Setters

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getTypeOfComicBook() {
        return typeOfComicBook;
    }

    public void setTypeOfComicBook(String typeOfComicBook) {
        this.typeOfComicBook = typeOfComicBook;
    }

    @Override
    public String toString() {
        return "Comicbook: " + getTitle() + "(" + getRealiseYear() + ")";
    }
}
