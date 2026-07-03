package Project_1.MusicAppTesting.modelos;

public class Music extends Audio {

    // Additional attributes specific to the Music class
    
    private String artist;
    private String album;
    private String genre;

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
}
