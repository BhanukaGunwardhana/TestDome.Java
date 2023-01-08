package Java_Advanced.TestDomeTests;

import java.nio.file.FileStore;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isInRepeatingPlaylist() {
        try {
            Song s=this.nextSong;
            Song startSong=s;
           while(s!=null){
            
                s=s.nextSong;
                if(startSong.equals(s)){
                    return true;
                }
           }
           return false;
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
       

        first.setNextSong(second);
        second.setNextSong(first);
       

        System.out.println(first.isInRepeatingPlaylist());
    }
}
 
