package com.github.syndicate017.movieshere.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * The type Movie.
 */
//Model Class for Movies Object
public class Movie implements Parcelable {

    private int movieId;
    private String movieTitle;
    private String movieOverview;
    private String movieReleaseDate;
    private double movieVoteAverage;
    private String moviePosterPath;

    /**
     * Instantiates a new Movie.
     */
    public Movie() {
    }

    /**
     * Instantiates a new Movie.
     *
     * @param movieId          the movie id
     * @param movieTitle       the movie title
     * @param movieOverview    the movie overview
     * @param movieReleaseDate the movie release date
     * @param movieVoteAverage the movie vote average
     * @param moviePosterPath  the movie poster path
     */
    public Movie(int movieId, String movieTitle, String movieOverview, String movieReleaseDate, double movieVoteAverage, String moviePosterPath) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieOverview = movieOverview;
        this.movieReleaseDate = movieReleaseDate;
        this.movieVoteAverage = movieVoteAverage;
        this.moviePosterPath = moviePosterPath;
    }

    /**
     * Instantiates a new Movie.
     *
     * @param in the in
     */
    protected Movie(Parcel in) {
        movieId = in.readInt();
        movieTitle = in.readString();
        movieOverview = in.readString();
        movieReleaseDate = in.readString();
        movieVoteAverage = in.readDouble();
        moviePosterPath = in.readString();
    }

    /**
     * The constant CREATOR.
     */
    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    /**
     * Gets movie id.
     *
     * @return the movie id
     */
    public int getMovieId() {
        return movieId;
    }

    /**
     * Sets movie id.
     *
     * @param movieId the movie id
     */
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    /**
     * Gets movie title.
     *
     * @return the movie title
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * Sets movie title.
     *
     * @param movieTitle the movie title
     */
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    /**
     * Gets movie overview.
     *
     * @return the movie overview
     */
    public String getMovieOverview() {
        return movieOverview;
    }

    /**
     * Sets movie overview.
     *
     * @param movieOverview the movie overview
     */
    public void setMovieOverview(String movieOverview) {
        this.movieOverview = movieOverview;
    }

    /**
     * Gets movie release date.
     *
     * @return the movie release date
     */
    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    /**
     * Sets movie release date.
     *
     * @param movieReleaseDate the movie release date
     */
    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    /**
     * Gets movie vote average.
     *
     * @return the movie vote average
     */
    public double getMovieVoteAverage() {
        return movieVoteAverage;
    }

    /**
     * Sets movie vote average.
     *
     * @param movieVoteAverage the movie vote average
     */
    public void setMovieVoteAverage(double movieVoteAverage) {
        this.movieVoteAverage = movieVoteAverage;
    }

    /**
     * Gets movie poster path.
     *
     * @return the movie poster path
     */
    public String getMoviePosterPath() {
        return moviePosterPath;
    }

    /**
     * Sets movie poster path.
     *
     * @param moviePosterPath the movie poster path
     */
    public void setMoviePosterPath(String moviePosterPath) {
        this.moviePosterPath = moviePosterPath;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(movieId);
        parcel.writeString(movieTitle);
        parcel.writeString(movieOverview);
        parcel.writeString(movieReleaseDate);
        parcel.writeDouble(movieVoteAverage);
        parcel.writeString(moviePosterPath);
    }
}
