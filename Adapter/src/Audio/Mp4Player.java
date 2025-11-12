package Audio;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //non supportato
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Riproduzione mp4 file "+fileName);
    }
}
