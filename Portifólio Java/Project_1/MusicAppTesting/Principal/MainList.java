package Project_1.MusicAppTesting.Principal;

import Project_1.MusicAppTesting.modelOfAudio.Music;
import Project_1.MusicAppTesting.modelOfAudio.Podcast;

import java.util.ArrayList;
import java.util.Collections;

public class MainList {

    //Adding some music and podcast to the list of favorites
    public static void main(String[] args) {

        // Create instances of Music and Podcast
        Music music1 = new Music("The Man Jesus Christ", 180, "Jimmy Clifton", "Christian");
        Music music2 = new Music("You raise me up", 240, "Josh Groban", "Pop");
        Podcast podcast1 = new Podcast("Flow Podcast", 600, "Monark");
        Podcast podcast2 = new Podcast("Podpah", 900, "Igor Cavalari");

        // Set attributes for the Music instances
        ArrayList<Music> musicList = new ArrayList<>();

        musicList.add(music1);
        musicList.add(music2);
        Collections.sort(musicList);

        System.out.println("Sorted Music List: " + musicList);

        // Set attributes for the Podcast list

        ArrayList<Podcast> podcastList = new ArrayList<>();

        podcastList.add(podcast1);
        podcastList.add(podcast2);
        Collections.sort(podcastList);
        
        System.out.println("Sorted Podcast List: " + podcastList);
    }
}
