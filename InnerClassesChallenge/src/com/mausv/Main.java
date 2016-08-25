package com.mausv;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Album> albumList = new ArrayList<>();
        LinkedList<Song> playList = new LinkedList<>();

        Album album1 = Album.createAlbum("Long Road");
        Album album2 = Album.createAlbum("Mythical");
        album1.addSong("Bad name", 100);
        album1.addSong("The circle", 150);
        album1.addSong("So rude", 200);
        album2.addSong("Polish", 120);
        album2.addSong("Paranoia", 140);
        album2.addSong("Kill em all", 160);
        album2.addSong("Interesting fact", 125);

        albumList.add(album1);
        albumList.add(album2);

        /*album1.addSongToPlaylist(1, playList);
        album1.addSongToPlaylist(2, playList);
        album1.addSongToPlaylist(3, playList);
        album2.addSongToPlaylist("Kill em all", playList);*/

        //printSongs(playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;
        int action = 6;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        printMenu();
        while(!quit) {
            System.out.println("Option = ");
            action = scan.nextInt();
            scan.nextLine();
            switch(action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    //Forward
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                        forward = true;
                    }
                    break;
                case 2:
                    //Back
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Start of playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    //Remove current song
                    if(listIterator.hasNext() || listIterator.hasPrevious()) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        } else if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    break;
                case 4:
                    //Replay current song
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Start of playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of playlist");
                        }
                    }
                    break;
                case 5:
                    //Print playlist
                    printSongs(playList);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printSongs(LinkedList<Song> list) {
        for(Song song: list) {
            System.out.println(song.toString());
        }
    }

    private static void printMenu() {
        System.out.println("0. Quit");
        System.out.println("1. Go forward");
        System.out.println("2. Go back");
        System.out.println("3. Remove current song");
        System.out.println("4. Replay current song");
        System.out.println("5. Print playlist");
        System.out.println("6. Print menu");

    }
}
