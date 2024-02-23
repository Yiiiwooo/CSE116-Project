package ratings;

public class Rating {
    private String reviewerID;
    private int reviewerRating;
    public Rating(String reviewerID,int reviewerRating ){



        if(reviewerRating<1 || reviewerRating>5){
            this.reviewerRating = -1;
        }else{
            this.reviewerRating = reviewerRating;
        }

    }
    public String getReviewerID(){
        return this.reviewerID;
    }
    public void setReviewerID(String reviewerID){
        this.reviewerID = reviewerID;
    }
    public int getRating(){
        return this.reviewerRating;
    }
    public void setRating(int reviewerRating){
        if(reviewerRating<1 || reviewerRating>5){
            this.reviewerRating = -1;
        }else{
            this.reviewerRating = reviewerRating;
        }
    }
}
