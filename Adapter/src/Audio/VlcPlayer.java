package Audio;

public class VlcPlayer implements AdvancedMediaPlayer{


    @Override
    public void playVlc(String fileName) {
        System.out.println("Riproduzione VLC "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //non supportato
    }
}
