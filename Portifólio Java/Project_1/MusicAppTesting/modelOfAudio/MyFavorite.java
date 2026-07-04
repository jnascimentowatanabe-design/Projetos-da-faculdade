package Project_1.MusicAppTesting.modelOfAudio;

public class MyFavorite {

    public void include(Audio audio) {
        if (audio.getClassification() >= 8) {
            System.out.println("The audio " + audio.getTitle() + " has been added to your favorites.");
        } else {
            System.out.println("The audio " + audio.getTitle() + " is already in your favorites.");
        }
    }

}