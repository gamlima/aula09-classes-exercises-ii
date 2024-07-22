package music;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private final ArrayList<Track> tracks;
    private  String title;

    public Playlist(String title) {
        tracks = new ArrayList<>();
        this.title = title;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack (Track track) {
        tracks.remove(track);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
       for (var track : tracks) {
        s.append(track);
        s.append("\n");
       }

       return s.toString();
    }

    public void shuffle(){
        Collections.shuffle(tracks);
    }
}
