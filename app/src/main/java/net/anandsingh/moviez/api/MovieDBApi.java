package net.anandsingh.moviez.api;

import net.anandsingh.moviez.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Anand Singh on 23-07-2016.
 */
public interface MovieDBApi {

    /**
     * Gets popular movies.
     *
     * @param apiKey the api key
     * @return the popular movies
     */
    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    /**
     * Gets top rated movies.
     *
     * @param apiKey the api key
     * @return the top rated movies
     */
    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

}

