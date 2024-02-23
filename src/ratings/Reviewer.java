package ratings;

public class Reviewer {
    private String reviewerID;
    public Reviewer(String reviewerID){
        this.reviewerID = reviewerID;

    }
    public String getReviewerID(){
        return this.reviewerID;
    }
    public void setReviewerID(String reviewerID){
        this.reviewerID = reviewerID;
    }
    public void rateSong(int Rating){
        Rating Reviewer = new Rating(this.reviewerID, Rating);
    }

}
