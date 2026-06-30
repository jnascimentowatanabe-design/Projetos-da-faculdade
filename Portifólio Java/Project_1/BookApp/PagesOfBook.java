package Project_1.BookApp;

public class PagesOfBook {
    int numberOfPages;
    int goalsPerDay;
    double avarageCompletionTime;
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
}
