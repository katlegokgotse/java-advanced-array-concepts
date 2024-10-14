public class Recording {
    String title;
    String artist;
    double songDuration;
    public Recording(String title, String artist, double songDuration){
        this.title = title;
        this.artist = artist;
        this.songDuration = songDuration;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setSongDuration(double songDuration){
        this.songDuration = songDuration;
    }

    public double getSongDuration() {
        return songDuration;
    }
    @Override
    public String toString() {
        return "Recording{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songDuration=" + songDuration +
                '}';
    }
}
