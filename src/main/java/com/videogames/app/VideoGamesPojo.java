package com.videogames.app;

import java.util.List;

public class VideoGamesPojo {

     private int id;
    private String name;
    private String releaseDate;
    private int reviewScore;
    private String category;
    private String rating;

     public int getId() {
        return id;
    }

    public void setId(int ID) {
        this.id = ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String ReleaseDate) {
        this.releaseDate = ReleaseDate;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int ReviewScore) {
        this.reviewScore = ReviewScore;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String Category) {
        this.category = Category;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String Rating) {
        this.rating = Rating;
    }


}


