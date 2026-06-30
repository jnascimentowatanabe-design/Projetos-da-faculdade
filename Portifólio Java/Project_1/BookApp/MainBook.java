package Project_1.BookApp;

public class MainBook {
    public static void main(String[] args) {
        System.out.println("---------Welcome to the Book App!----------\n");
        System.out.println("See the basic information about the book below:\n");

// Setting only books
        BookStatus book1 = new BookStatus();
        book1.setTitle("Crime and Punishment");
        book1.setAuthor("Fyodor Dostoevsky");
        book1.setRealiseYear(1866);
        book1.setBookplan(true);
        book1.bookGrade(4.5);
        book1.bookGrade(5.0);

        book1.showsBookBasicStatus();
        book1.isBookPlan(true);

// Setting comic books
        ComicBook comicBook1 = new ComicBook();

        comicBook1.setTitle("The Amazing Spider-Man");
        comicBook1.setAuthor("Stan Lee");
        comicBook1.setRealiseYear(1962);
        comicBook1.setIllustrator("Steve Ditko");
        comicBook1.setTypeOfComicBook("Superhero");

        comicBook1.showsBookBasicStatus();
        System.out.println("Illustrator: " + comicBook1.getIllustrator());
        System.out.println("Type of Comic Book: " + comicBook1.getTypeOfComicBook());
        comicBook1.setBookplan(false);
        comicBook1.isBookPlan(false);




    }

}
