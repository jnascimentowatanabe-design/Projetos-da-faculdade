package Project_1.BookApp;

public class BookStatus {
    String title;
    String author;
    int realiseYear;
    double evaluation;
    int amountOfEvaliations;
    boolean Bookplan;

    void showsBookBasicStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Realise Year: " + realiseYear);
    }

    void bookGrade(double grade) {
        evaluation += grade;
        amountOfEvaliations++;
    }

    double getBookGrade() {
        return evaluation / amountOfEvaliations;
    }

    boolean isBookPlan(boolean Bookplan) {
        if (Bookplan) {
            System.out.println("This book is in the plan.");
        } else {
            System.out.println("This book is not in the plan.");
        }
        return Bookplan;
    }
}
