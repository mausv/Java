package com.mausv;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by mausv on 8/1/2016.
 */
public class Album {
    private String title;
    private ArrayList<Song> listOfSongs;

    private Album(String title) {
        this.title = title;
        this.listOfSongs = new ArrayList<>();
    }

    public static Album createAlbum(String albumTitle) {
        return new Album(albumTitle);
    }

    public void addSong(String songTitle, int songDuration) {
        listOfSongs.add(Song.createSong(songTitle, songDuration));
    }

    public void getListOfSongs() {
        System.out.println("\nAlbum: " + title);
        for(int i = 0; i < listOfSongs.size(); i++) {
            System.out.println((i+1) + ". " + listOfSongs.get(i).getTitle());
        }
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> songs) {
        if(checkIfExists(trackNumber)) {
            songs.add(listOfSongs.get(trackNumber-1));
        }
        return false;
    }

    public boolean addSongToPlaylist(String trackTitle, LinkedList<Song> songs) {
        if(checkIfExists(trackTitle)) {
            songs.add(listOfSongs.get(getId(trackTitle)));
        }
        return false;
    }

    private boolean checkIfExists(int track) {
        int index = track - 1;
        if(index >= 0 && index < listOfSongs.size()) {
            return true;
        }
        return false;
    }
    private boolean checkIfExists(String trackTitle) {
        for (Song checkedSong: listOfSongs) {
            if(checkedSong.getTitle().equals(trackTitle)) {
                return true;
            }
        }
        System.out.println("Track doesn't exist");
        return false;
    }

    private int getId(String trackTitle) {
        for(int i = 0; i < listOfSongs.size(); i++) {
            if(listOfSongs.get(i).getTitle().equals(trackTitle)) {
                return i;
            }
        }
        return -1;
    }
}
