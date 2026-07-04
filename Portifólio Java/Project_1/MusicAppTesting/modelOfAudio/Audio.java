package Project_1.MusicAppTesting.modelOfAudio;
import java.util.Scanner;

public class Audio {

    // Attributes of the Audio class

    private String title;
    private int duration;
    private int amoutOfReproductions;
    private int likes;
    private int classification;

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

    public int getAmoutOfReproductions() {
        return amoutOfReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public int getClassification() {
        return classification;
    }

    // Method to play the audio and increase the amount of reproductions

    public void play() {
        System.out.println("Playing audio: " + title);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Amount of reproductions: " + amoutOfReproductions);
        System.out.println("Likes: " + likes);
        System.out.println("Classification: " + classification);

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
}
