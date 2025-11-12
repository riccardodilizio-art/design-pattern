package Audio;
//CLasse che supporta solo MP3
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Riproduzione file MP3 "+ fileName);
        }else  if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            //uso un adattatore per altri formati
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Formato non supportato "+audioType);
        }
    }
}
