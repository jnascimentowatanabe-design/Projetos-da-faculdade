package Project_1.MusicAppTesting.modelOfAudio;

public class Podcast extends Audio {

    // Additional attributes specific to the Podcast class
    
    private String host;
    private String description;

    // Getters and Setters

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int getClassification() {
        if (this.getLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
    
}
