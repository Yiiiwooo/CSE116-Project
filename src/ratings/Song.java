package ratings;

public class Song {
    private String title;
    private String artist;
    private String ID;
    public Song(String title,String artist,String ID){

    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getArtist(){
        return this.artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getSongID(){
        return this.artist;
    }
    public void setSongID(String ID){
        this.ID = ID;
    }



}
