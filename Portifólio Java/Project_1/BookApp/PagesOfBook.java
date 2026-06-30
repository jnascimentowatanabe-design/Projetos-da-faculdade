package Project_1.BookApp;


public class PagesOfBook {
    int numberOfPages;
    int goalsPerDay;
    double avarageCompletionTime;

    

    public void showsPagesOfBook(BookStatus book) {
        System.out.println("Name of the book: " + book.getTitle());
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Goals Per Day: " + goalsPerDay);
        System.out.println("Average Completion Time: " + avarageCompletionTime + " days");
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getGoalsPerDay() {
        return goalsPerDay;
    }

    public void setGoalsPerDay(int goalsPerDay) {
        this.goalsPerDay = goalsPerDay;
    }

    public void calculatingAvaregeCompletionTime() {
       this.avarageCompletionTime = numberOfPages / goalsPerDay;
    }

    public double getAvarageCompletionTime() {
        return avarageCompletionTime;
    }
}
