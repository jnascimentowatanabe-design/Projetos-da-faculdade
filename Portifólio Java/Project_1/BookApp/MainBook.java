package Project_1.BookApp;

public class MainBook {
    public static void main(String[] args) {
        System.out.println("---------Welcome to the Book App!----------\n");
        System.out.println("See the basic information about the book below:\n");

        BookStatus book1 = new BookStatus();
        book1.title = "Crime and Punishment";
        book1.author = "Fyodor Dostoevsky";
        book1.realiseYear = 1866;
        book1.Bookplan = true;

        book1.showsBookBasicStatus();
        book1.isBookPlan();
    }
}
