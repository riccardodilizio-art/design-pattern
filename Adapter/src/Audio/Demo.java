package Audio;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "musica.mp3");
        audioPlayer.play("mp4", "musica.mp4");
        audioPlayer.play("vlc", "musica.vlc");
        audioPlayer.play("avi", "musica.avi");
    }
}
