package Project_1.BookApp;
import Project_1.BookApp.ModelsOfBook.BookStatus;
import java.util.ArrayList;

public class WishListBook {
    
    ArrayList<BookStatus> wishListBook = new ArrayList<>();

    public void addBookToWishList(BookStatus book) {
        wishListBook.add(book);
    }

    public void seeSizeOfWishList() {
        System.out.println("The size of the wish list is: " + wishListBook.size());
    }

    public void showingWishList() {
        System.out.println("Books in the wish list:");
        for (BookStatus book : wishListBook) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}


