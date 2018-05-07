package com.mg;

import java.util.*;

public class Main {

    public static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("recovery","eminem");
        album.addsong("love the was you lie" , 6.1);
        album.addsong("not afraid",5.6);
        album.addsong("wtf",4.6);
        albums.add(album);

        album = new Album("purpose","jb");
        album.addsong("what do you mean",5.4);
        album.addsong("sorry",3.6);
        album.addsong("love yourself" , 4.4);
        albums.add(album);

        LinkedList<Song>  playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("love the way you lie" ,playlist);
        albums.get(0).addToPlaylist("wtf",playlist);
        albums.get(1).addToPlaylist("sorry" ,playlist);
        albums.get(1).addToPlaylist("love yourself" ,playlist );
        play(playlist);



    }

    private static void play(LinkedList<Song> playlist){
        boolean quit = false;
        boolean forward = true;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listerator = playlist.listIterator();
        if (listerator == null){
            System.out.println("no songs in the playlist");
            return;
        }else {
            System.out.println("now  playing " + listerator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("playlist is complete");
                    quit=true;
                    break;
                case 1:
                    if (!forward){
                        if (listerator.hasNext()){
                            listerator.next();
                        }
                        forward = true;
                    }

                    if (listerator.hasNext()){
                        System.out.println("now playing " + listerator.next().toString());
                    }else {
                        System.out.println("reached the end of the list");
                    }
                    break;

                case 2 :
                    if (forward){
                        if (listerator.hasPrevious()){
                            listerator.previous();
                            forward = false;
                        }
                        if (listerator.hasPrevious()){
                            System.out.println("now playing " + listerator.previous().toString());
                        }else {
                            System.out.println("reached the start of list");
                        }
                    }
                    break;
                case 3:
                    if (forward){
                        if (listerator.hasPrevious()){
                            System.out.println("now replaying " + listerator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("reached the start of the list");
                        }
                    }
                    else {
                        if (listerator.hasNext()){
                            System.out.println("now replaying " + listerator.next().toString());
                        forward=true;
                        }else {
                            System.out.println("reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playlist.size()>0)
                        listerator.remove();
                    if (listerator.hasNext())
                        System.out.println("now playing " + listerator.next());
                    else if (listerator.hasPrevious())
                        System.out.println("now playing " + listerator.previous());
                    break;


            }
        }
    }

    private static void printMenu(){
        System.out.println("available actions : \npress");
        System.out.println("0 - quit\n " +
                "1 - go forward\n" +
                "2 - go backward\n" +
                "3 - reply current song\n" +
                "4 - list songs in playlist\n" +
                "5 - print available actions\n" +
                "6 - to remove a song");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("===========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===================");
    }
}








