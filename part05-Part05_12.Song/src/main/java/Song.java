
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object song) {
        
        if(this == song) {
            return true;
        }
        
        if(!(song instanceof Song)) {
            return false;
        }
        
        Song newSong = (Song) song;
        
        if((this.name.equals(newSong.name)) &&
            this.artist.equals(newSong.artist) &&
            this.durationInSeconds == newSong.durationInSeconds) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
