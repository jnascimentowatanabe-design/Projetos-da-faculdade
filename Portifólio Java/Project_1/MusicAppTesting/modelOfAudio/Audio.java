package Project_1.MusicAppTesting.modelOfAudio;
import java.util.Scanner;

public class Audio implements Comparable<Audio> {

    // Attributes of the Audio class

    private String title;
    private int duration;
    private int amoutOfReproductions;
    private int likes;
    private int classification;

    // Constructor of the Audio class

    public Audio(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getters and Setters

    public void setTitle (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setAmountOfReproductions(int amountOfReproductions) {
        this.amoutOfReproductions = amountOfReproductions;
    }

    public int getAmoutOfReproductions() {
        return amoutOfReproductions;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public int getClassification() {
        return classification;
    }

    // Method about the Information of the audio

    public void showInformation() {
        System.out.println("Title: " + this.title);
        System.out.println("Duration: " + this.duration);
        System.out.println("Amount of Reproductions: " + this.amoutOfReproductions);
        System.out.println("Likes: " + this.likes);
        System.out.println("Classification: " + this.classification);
    }

    // Method to play the audio and increase the amount of reproductions

    public void play() {
        this.amoutOfReproductions++;
    }

    // Method to enjoy the audio and increase the amount of likes

    Scanner scanner = new Scanner(System.in);

    public void enjoy() {
        System.out.println("Say if you liked the music or not: ");
        boolean like = scanner.nextBoolean();
        if (like == true) {
            this.likes ++;
        }
    }

    // Method to compare the audio by title
    @Override
    public int compareTo(Audio other) {
        return this.title.compareTo(other.title);
    }

   
}
