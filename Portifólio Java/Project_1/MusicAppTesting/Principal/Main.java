package Project_1.MusicAppTesting.Principal;
import Project_1.MusicAppTesting.modelOfAudio.Music;
import Project_1.MusicAppTesting.modelOfAudio.MyFavorite;
import Project_1.MusicAppTesting.modelOfAudio.Podcast;

public class Main {
    public static void main(String[] args) {

        
        // Set attributes for the Music instance
        
        //The Man Jesus Christ
        Music music = new Music("The Man Jesus Christ", 180, "Jimmy Clifton", "Christian");
        
        music.setAmountOfReproductions(180); 
        music.setLikes(600);
        
        // Set attributes for the Podcast instance
        
        //Flow Podcast
        Podcast podcast = new Podcast("Flow Podcast", 600, "Monark");
        
        podcast.setDescription("Flow Podcast is a Brazilian podcast that features interviews with various guests, including celebrities, artists, and public figures. The show is known for its informal and relaxed style, allowing guests to share their personal stories and experiences in a candid manner.");
        podcast.setLikes(400);

        // Show information about the Music and Podcast instances

        music.showInformation();
        podcast.showInformation();

        // Play the Music and Podcast instances and enjoy them 1000 times each

        for (int i = 0; i < 1000; i++) {
            music.play();
            podcast.play();
        }
        
        for (int i = 0; i < 1; i++) {
            music.enjoy();
            podcast.enjoy();
        }

        // Show information about the Music and Podcast instances

        music.showInformation();
        podcast.showInformation();

        // Include the Music and Podcast instances in MyFavorite

        MyFavorite myFavorite = new MyFavorite();
        myFavorite.include(music);
        myFavorite.include(podcast);
    }
}
