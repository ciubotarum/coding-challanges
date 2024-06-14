package theory.examples;

public class Adapter {
    // Define the Target Interface: This is the interface your client expects to work with.
    // Target interface
    public interface MediaPlayer {
        void play(String audioType, String fileName);
    }

    // Create an Adaptee Class: This is the class with the existing interface that is incompatible with the target interface.
    // Adaptee class with an existing interface
    public static class Mp3Player {
        public void playMp3(String fileName) {
            System.out.println("Playing MP3 file: " + fileName);
        }
    }

    // Create an Adapter Class: This class implements the target interface and translates the requests to the adaptee.
    // Adapter class
    public static class MediaAdapter implements MediaPlayer {
        private Mp3Player mp3Player;

        public MediaAdapter(Mp3Player mp3Player) {
            this.mp3Player = mp3Player;
        }

        @Override
        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp3")) {
                mp3Player.playMp3(fileName);
            } else {
                System.out.println("Invalid audio type. MP3 supported only.");
            }
        }
    }

    // Create a Client Class: This class uses the adapter to play different types of media.
    // Client class
    public static class AudioPlayer implements MediaPlayer {
        private MediaAdapter mediaAdapter;

        @Override
        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp3")) {
                mediaAdapter = new MediaAdapter(new Mp3Player());
                mediaAdapter.play(audioType, fileName);
            } else {
                System.out.println("Invalid audio type. MP3 supported only.");
            }
        }
    }

    // Usage
    public static class MainAdapter {
        public static void main(String[] args) {
            Adapter.AudioPlayer audioPlayer = new Adapter.AudioPlayer();
            audioPlayer.play("mp3", "song.mp3"); // Output: Playing MP3 file: song.mp3
            audioPlayer.play("mp4", "movie.mp4"); // Output: Invalid audio type. MP3 supported only.
        }
    }

}

// Usage



