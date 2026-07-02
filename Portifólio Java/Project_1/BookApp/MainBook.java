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

        BookStatus book2 = new BookStatus();
        book2.setTitle("The Great Gatsby");
        book2.setAuthor("F. Scott Fitzgerald");
        book2.setRealiseYear(1925);
        book2.setBookplan(false);
        book2.bookGrade(4.0);
        book2.bookGrade(4.5);

        book2.showsBookBasicStatus();
        book2.isBookPlan(false);

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

        ComicBook comicBook2 = new ComicBook();

        comicBook2.setTitle("One Piece");
        comicBook2.setAuthor("Eiichiro Oda");
        comicBook2.setRealiseYear(1997);
        comicBook2.setIllustrator("Eiichiro Oda");
        comicBook2.setTypeOfComicBook("Manga");

        comicBook2.showsBookBasicStatus();
        System.out.println("Illustrator: " + comicBook2.getIllustrator());
        System.out.println("Type of Comic Book: " + comicBook2.getTypeOfComicBook());
        comicBook2.setBookplan(false);
        comicBook2.isBookPlan(false);


//Pages of book
        PagesOfBook pages = new PagesOfBook();

        //BOOKS

        //Crime and Punishment
        pages.setNumberOfPages(320);
        pages.setGoalsPerDay(20);
        pages.calculatingAvaregeCompletionTime();
        pages.showsPagesOfBook(book1);

        //The Great Gatsby
        pages.setNumberOfPages(180);
        pages.setGoalsPerDay(10);
        pages.calculatingAvaregeCompletionTime();
        pages.showsPagesOfBook(book2);

        //COMIC BOOKS

        //The Amazing Spider-Man
        pages.setNumberOfPages(150);
        pages.setGoalsPerDay(15);
        pages.calculatingAvaregeCompletionTime();
        pages.showsPagesOfBook(comicBook1);

        //One Piece
        pages.setNumberOfPages(1000);
        pages.setGoalsPerDay(50);
        pages.calculatingAvaregeCompletionTime();
        pages.showsPagesOfBook(comicBook2);

       
    }

}
