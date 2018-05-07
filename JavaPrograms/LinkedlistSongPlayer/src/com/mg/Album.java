package com.mg;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addsong(String title , double duration){
        if(findsong(title)==null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public Song findsong(String title){
        for (Song checkedsong : this.songs) {
            if (checkedsong.getTitle().equals(title)) ;
            return checkedsong;
        }
        return null;

    }

    public boolean addToPlaylist(int tracknumber , LinkedList<Song> playlist){
        int index = tracknumber -1;
        if ((index <0)&&(index>=songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album doesnt have a track" + tracknumber);
        return false;
    }

    public boolean addToPlaylist(String title , LinkedList<Song> playlist){
        Song checkedsong = findsong(title);
        if (checkedsong != null){
            playlist.add(checkedsong);
            return true;
        }
        System.out.println("the song " + title + " is not i the album");
        return false;
    }



}

