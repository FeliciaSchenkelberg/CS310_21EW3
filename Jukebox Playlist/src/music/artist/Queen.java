package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Queen {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Queen() {
    }
    
    public ArrayList<Song> getQueenSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                               //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Bohemian Rhapsody", "Queen");              //Create a song
         Song track2 = new Song("Another One Bites the Dust", "Queen");     //Create another song
         Song track3 = new Song("Killer Queen", "Queen");                   //Create a third song
         this.albumTracks.add(track1);                                      //Add the first song to song list for Queen
         this.albumTracks.add(track2);                                      //Add the second song to song list for Queen
         this.albumTracks.add(track3);                                      //Add the third song to song list for Queen
         return albumTracks;                                                //Return the songs for Queen in the form of an ArrayList
    }
}