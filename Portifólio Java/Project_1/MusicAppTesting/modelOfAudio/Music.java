package Project_1.MusicAppTesting.modelOfAudio;

public class Music extends Audio {

    // Additional attributes specific to the Music class
    
    private String artist;
    private String album;
    private String genre;

    // Constructor

    public Music(String title, int duration, String artist, String genre) {
        super(title, duration);
        this.artist = artist;
        this.genre = genre;
    }

    // Getters and Setters

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public int getClassification() {
        if (this.getAmoutOfReproductions() > 1000) {
            return 10;
        } else {
            return 8;
        }
    }
}
