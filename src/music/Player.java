package music;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private final ArrayList<Track> queue;
    private Track currentTrack;
    private  boolean isPlaying;

    public Player() {
        queue = new ArrayList<>();
        currentTrack = null;
        isPlaying = false;
    }

    public void addToQueue(Track track) {

    }

    public void addAllToQueue(Playlist track) {

    }

    public void play(){

    }

    public void stop() {

    }

    public void next() {

    }

    public void previous() {

    }

    public Track getCurrentTrack(){
        return currentTrack;
    }

    public void shuffle() {
        Collections.shuffle(queue);
        // To do: pensar no comportamento currentTrack
    }
}

