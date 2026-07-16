package Project_1.BookApp.MainCode;

import Project_1.BookApp.ModelsOfBook.BookStatus;
import Project_1.BookApp.ModelsOfBook.ComicBook;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainBookList {
    public static void main(String[] args) {

    // Setting only books

        var book1 = new BookStatus("Crime and Punishment", "Fyodor Dostoevsky", 1866);
        var book2 = new BookStatus("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        var book3 = new BookStatus("The Odyssey", "Homer", -800);
        var comicBook1 = new ComicBook("The Amazing Spider-Man", "Stan Lee", 1962);
        var comicBook2 = new ComicBook("One Piece", "Eiichiro Oda", 1997);


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

        // Chalenge 1

        System.out.println("\n-----------File of Books to read-----------\n");

        LinkedList<BookStatus> bookLinkedList = new LinkedList<>();
        bookLinkedList.add(book1);
        bookLinkedList.addLast(book2);
        bookLinkedList.addFirst(book3);
        bookLinkedList.add(comicBook1);
        bookLinkedList.add(comicBook2);

        bookLinkedList.sort(Comparator.comparing(BookStatus::getRealiseYear));

        System.out.println("Books in the list to read:" + "\n" + bookLinkedList);
    }
}
