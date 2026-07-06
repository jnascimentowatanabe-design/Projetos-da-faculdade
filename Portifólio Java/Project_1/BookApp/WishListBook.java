package Project_1.BookApp;
import Project_1.BookApp.ModelsOfBook.BookStatus;
import java.util.ArrayList;

public class WishListBook extends BookStatus {
    ArrayList<BookStatus> wishListBook = new ArrayList<>();

    public void addBookToWishList(BookStatus book) {
        wishListBook.add(book);
    }

    public void seeSizeOfWishList() {
        System.out.println("The size of the wish list is: " + wishListBook.size());
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + "(" + getRealiseYear() + ")";
    }
}
