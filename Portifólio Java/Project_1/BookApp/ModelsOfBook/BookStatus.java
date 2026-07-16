package Project_1.BookApp.ModelsOfBook;

import Project_1.BookApp.InterfaceBookApp.evaluationInterface;

public class BookStatus implements evaluationInterface, Comparable<BookStatus> {
    private String title;
    private String author;
    private int realiseYear;
    private double evaluation;
    private int amountOfEvaliations;
    private boolean bookplan;

    // Constructor

    public BookStatus(String title, String author, int realiseYear) {
        this.title = title;
        this.author = author;
        this.realiseYear = realiseYear;
    }

    //Getters and Setters

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
        return isBookPlan(bookplan);
    }

    public void setBookplan(boolean bookplan) {
        this.bookplan = bookplan;
    }

    // Method to display basic book status


    public void showsBookBasicStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        bcOrAd(realiseYear);
        System.out.println("Average Grade: " + getBookGrade());
    }

    //Override method

    @Override
    public void bookGrade(double grade) {
        evaluation += grade;
        amountOfEvaliations++;
        
    }


    @Override
    public int compareTo(BookStatus other) {
        return this.getTitle().compareTo(other.getTitle());
    }

    @Override
    public double getBookGrade() {
        if (amountOfEvaliations == 0) {
            return 0.0; // Avoid division by zero
        }
        return evaluation / amountOfEvaliations;
    }

    @Override
    public String toString() {
        return "Book: " + title + "(" + getRealiseYear() + ")";
    }

    public boolean isBookPlan(boolean bookplan) {
        if (bookplan) {
            System.out.println("This book is in the plan.\n");
        } else {
            System.out.println("This book is not in the plan.\n");
        }
        return bookplan;
    }

    public int bcOrAd(int year) {
        if (year < 0) {
            System.out.println("Realise Year: " + Math.abs(year) + " BC.");
        } else {
            System.out.println("Realise Year: " + year + " AD.");
        }
        return year;
    }
}
