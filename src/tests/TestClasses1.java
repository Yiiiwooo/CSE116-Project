package tests;



import ratings.Rating;
import ratings.Reviewer;
import ratings.Song;

import java.util.HashMap;

public class TestClasses1 {
    public boolean compareSongs(Song s1, Song s2){
        if(s1.getArtist().equals(s2.getArtist()) && s1.getTitle().equals(s2.getTitle()) && s1.getSongID().equals(s2.getSongID())){
            return true;
        }
        return false;
    }
    public boolean compareRatings(Rating r1,Rating r2){
        if(r1.getRating() == r2.getRating() && r1.getReviewerID().equals(r2.getReviewerID())){
            return true;
        }
        return false;
    }
    public boolean compareReviewers(Reviewer re1,Reviewer re2){
        if(re1.getReviewerID().equals(re2.getReviewerID())){
            return true;
        }
        return false;
    }


}
