package com.github.syndicate017.movieshere.Data;

import com.github.syndicate017.movieshere.Utils.Credentials;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//This class is used for Create a Singleton for Retrofit
public class RetrofitAPIServices {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(Credentials.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static MovieAPI movieAPI = retrofit.create(MovieAPI.class);


    public MovieAPI getMovieAPI() {
        return movieAPI;
    }
}
