package Project_1.BookApp.ModelsOfBook;

public class ComicBook extends BookStatus {
    String illustrator;
    String typeOfComicBook;

    public ComicBook(String title, String author) {
        super(title, author);
    }

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

}
