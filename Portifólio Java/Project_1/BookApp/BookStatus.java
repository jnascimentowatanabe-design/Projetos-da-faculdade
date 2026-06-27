package Project_1.BookApp;

public class BookStatus {
    private String title;
    private String author;
    private int realiseYear;
    private double evaluation;
    private int amountOfEvaliations;
    private boolean Bookplan;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public void setRealiseYear(int realiseYear) {
        this.realiseYear = realiseYear;
    }

    public boolean getBookplan() {
        return isBookPlan(Bookplan);
    }

    public void setBookplan(boolean bookplan) {
        Bookplan = bookplan;
    }




    public void showsBookBasicStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Realise Year: " + realiseYear);
        System.out.println("Average Grade: " + getBookGrade());
    }

    public void bookGrade(double grade) {
        evaluation += grade;
        amountOfEvaliations++;
        
    }

    public double getBookGrade() {
        return evaluation / amountOfEvaliations;
    }

    public boolean isBookPlan(boolean Bookplan) {
        if (Bookplan) {
            System.out.println("This book is in the plan.");
        } else {
            System.out.println("This book is not in the plan.");
        }
        return Bookplan;
    }
}
