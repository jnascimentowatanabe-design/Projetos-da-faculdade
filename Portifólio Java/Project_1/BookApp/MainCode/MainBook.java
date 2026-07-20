package Project_1.BookApp.MainCode;

import Project_1.BookApp.PagesOfBook;
import Project_1.BookApp.ModelsOfBook.BookStatus;
import Project_1.BookApp.ModelsOfBook.ComicBook;
import Project_1.BookApp.WishListBook;

public class MainBook {
    public static void main(String[] args) {
        System.out.println("---------Welcome to the Book App!----------\n");
        System.out.println("See the basic information about the book below:\n");

// Setting only books
        var book1 = new BookStatus("Crime and Punishment", "Fyodor Dostoevsky", 1866);
        book1.setBookplan(true);
        book1.bookGrade(4.5);
        book1.bookGrade(5.0);

        book1.showsBookBasicStatus();
        book1.isBookPlan(true);



        var book2 = new BookStatus("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        book2.setBookplan(false);
        book2.bookGrade(4.0);
        book2.bookGrade(4.5);

        book2.showsBookBasicStatus();
        book2.isBookPlan(false);


        var book3 = new BookStatus("The Odyssey", "Homer", -800);
        book3.setBookplan(false);
        book3.bookGrade(4.5);
        book3.bookGrade(5.0);

        book3.showsBookBasicStatus();
        book3.isBookPlan(true);

        var book4 = new BookStatus("Mere Christianity", "C.S. Lewis", 1952);
        book4.setBookplan(true);
        book4.bookGrade(4.5);
        book4.bookGrade(5.0);

        book4.showsBookBasicStatus();
        book4.isBookPlan(true);

// Setting comic books
        var comicBook1 = new ComicBook("The Amazing Spider-Man", "Stan Lee", 1962);

        comicBook1.setRealiseYear(1962);
        comicBook1.setIllustrator("Steve Ditko");
        comicBook1.setTypeOfComicBook("Superhero");

        comicBook1.showsBookBasicStatus();
        System.out.println("Illustrator: " + comicBook1.getIllustrator());
        System.out.println("Type of Comic Book: " + comicBook1.getTypeOfComicBook());
        comicBook1.setBookplan(false);
        comicBook1.isBookPlan(false);

        var comicBook2 = new ComicBook("One Piece", "Eiichiro Oda", 1997);

        comicBook2.setRealiseYear(1997);
        comicBook2.setIllustrator("Eiichiro Oda");
        comicBook2.setTypeOfComicBook("Manga");

        comicBook2.showsBookBasicStatus();
        System.out.println("Illustrator: " + comicBook2.getIllustrator());
        System.out.println("Type of Comic Book: " + comicBook2.getTypeOfComicBook());
        comicBook2.setBookplan(false);
        comicBook2.isBookPlan(false);

        var comicBook3 = new ComicBook("Avengers: Secret Wars", "Stan Lee", 1984);
        comicBook3.setRealiseYear(1984);
        comicBook3.setIllustrator("Steve Ditko");
        comicBook3.setTypeOfComicBook("Superhero");

        comicBook3.showsBookBasicStatus();
        System.out.println("Illustrator: " + comicBook3.getIllustrator());
        System.out.println("Type of Comic Book: " + comicBook3.getTypeOfComicBook());
        comicBook3.setBookplan(false);
        comicBook3.isBookPlan(false);

//Pages of book

        System.out.println("\n---------See the pages of the book below:----------\n");
        
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

        //The Odyssey
        pages.setNumberOfPages(500);
        pages.setGoalsPerDay(25);
        pages.calculatingAvaregeCompletionTime();
        pages.showsPagesOfBook(book3);

        //Mere Christianity
        pages.setNumberOfPages(250);
        pages.setGoalsPerDay(15);
        pages.calculatingAvaregeCompletionTime();
        pages.showsPagesOfBook(book4);

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

        //Avengers: Secret Wars
        pages.setNumberOfPages(200);
        pages.setGoalsPerDay(20);
        pages.calculatingAvaregeCompletionTime();
        pages.showsPagesOfBook(comicBook3);

// Wish List

        var wishList = new WishListBook();
        wishList.addBookToWishList(book1);
        wishList.addBookToWishList(book2);
        wishList.addBookToWishList(book3);
        wishList.addBookToWishList(comicBook1);
        wishList.addBookToWishList(comicBook2);
        wishList.seeSizeOfWishList();
        wishList.showingWishList();
    }

}
