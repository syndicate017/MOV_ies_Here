package com.github.syndicate017.movieshere.Data;

import com.github.syndicate017.movieshere.Models.MovieObjectModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//This class is used for getting the single movieObjectModel request - Search Movie
public class SingleMovieResponse {

    //Finding the movieObjectModel object
    @SerializedName("results")
    @Expose
    private MovieObjectModel movieObjectModel;

    public MovieObjectModel getMovie() {
        return movieObjectModel;
    }


    @Override
    public String toString() {
        return "SingleMovieResponse{" +
                "movieObjectModel=" + movieObjectModel +
                '}';
    }
}
