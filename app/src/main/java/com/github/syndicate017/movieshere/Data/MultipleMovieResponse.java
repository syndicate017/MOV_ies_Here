package com.github.syndicate017.movieshere.Data;

import com.github.syndicate017.movieshere.Models.MovieObjectModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

//This class is used for getting the multiple movie request - Popular Movies
public class MultipleMovieResponse {

    //Finding the movieObjectModel object
    @SerializedName("total_results")
    @Expose
    private int totalCountResults;

    @SerializedName("results")
    @Expose
    private List<MovieObjectModel> movieObjectModelList;


    public int getTotalCountResults() {
        return totalCountResults;
    }

    public List<MovieObjectModel> getMovieObjectModelList() {
        return movieObjectModelList;
    }

    @Override
    public String toString() {
        return "MultipleMovieResponse{" +
                "totalCountResults=" + totalCountResults +
                ", movieObjectModelList=" + movieObjectModelList +
                '}';
    }
}
