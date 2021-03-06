package L_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> listSong;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.listSong = new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration){
        if (findSong(name) == null) {
            Song newSong = new Song(name, duration);
            this.listSong.add(newSong);
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song checkedSong: this.listSong){
            if(checkedSong.getTitle().equals(title)){
                return  checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playList){
        int index = trackNumber - 1;
        if (index >= 0 && index < this.listSong.size()){
            playList.add(this.listSong.get(index));
            return true;
        }
        System.out.println("This album does not have a track" + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.artist + " - " + this.listSong;
    }
}
