package Project_1.BookApp.MainCode;

import Project_1.BookApp.ModelsOfBook.BookStatus;
import Project_1.BookApp.ModelsOfBook.ComicBook;
import java.util.ArrayList;

public class MainBookList {
    public static void main(String[] args) {

    // Setting only books

        var book1 = new BookStatus("Crime and Punishment", "Fyodor Dostoevsky");
        var book2 = new BookStatus("The Great Gatsby", "F. Scott Fitzgerald");
        var comicBook1 = new ComicBook("The Amazing Spider-Man", "Stan Lee");
        var comicBook2 = new ComicBook("One Piece", "Eiichiro Oda");


        ArrayList<BookStatus> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(comicBook1);
        bookList.add(comicBook2);

        for (BookStatus book : bookList) {
            if (book instanceof ComicBook comicBook) {
                System.out.println("Comic Book: " + comicBook.getTitle() + " by " + comicBook.getAuthor());
            } else {
                System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
