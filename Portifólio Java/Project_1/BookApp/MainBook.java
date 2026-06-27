package Project_1.BookApp;

public class MainBook {
    public static void main(String[] args) {
        System.out.println("---------Welcome to the Book App!----------\n");
        System.out.println("See the basic information about the book below:\n");

        BookStatus book1 = new BookStatus();
        book1.setTitle("Crime and Punishment");
        book1.setAuthor("Fyodor Dostoevsky");
        book1.setRealiseYear(1866);
        book1.setBookplan(true);

        book1.showsBookBasicStatus();
        book1.isBookPlan(book1.getBookplan());
        book1.bookGrade(4.5);
        book1.bookGrade(5.0);
        System.out.println("Average Grade: " + book1.getBookGrade());
    }
}
