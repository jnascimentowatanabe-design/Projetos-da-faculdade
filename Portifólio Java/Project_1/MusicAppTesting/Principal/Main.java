package Project_1.MusicAppTesting.Principal;
import Project_1.MusicAppTesting.modelOfAudio.Music;
import Project_1.MusicAppTesting.modelOfAudio.Podcast;

public class Main {
    public static void main(String[] args) {

        // Create instances of Music and Podcast classes
        
        Music music = new Music();
        Podcast podcast = new Podcast();

        // Set attributes for the Music instance

            //The Man Jesus Christ
        music.setTitle("The Man Jesus Christ");
        music.setArtist("Jimmy Clifton");
        music.setAlbum("The Man Jesus Christ");
        music.setGenre("Christian");

        // Set attributes for the Podcast instance

            //Flow Podcast
        podcast.setTitle("Flow Podcast");
        podcast.setHost("Monark");
        podcast.setDescription("Flow Podcast is a Brazilian podcast that features interviews with various guests, including celebrities, artists, and public figures. The show is known for its informal and relaxed style, allowing guests to share their personal stories and experiences in a candid manner.");
        
        // Play the Music and Podcast instances and enjoy them 1000 times each
        for (int i = 0; i < 1000; i++) {
            music.play();
            podcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            music.enjoy();
            podcast.enjoy();
        }
    }
}
