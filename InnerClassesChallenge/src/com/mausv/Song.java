package com.mausv;

/**
 * Created by mausv on 8/1/2016.
 */
public class Song {
    private String title;
    private int duration;

    private Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public static Song createSong(String songTitle, int songDuration) {
        return new Song(songTitle, songDuration);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return (this.title);
    }
}
