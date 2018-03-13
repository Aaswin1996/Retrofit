package com.developer.aaswin.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aaswin on 13/3/18.
 */

public interface GitHubClient {

    @GET("users/{user}/repos")
    Call<List<GithubRepo>> GithubUsers(@Path("user") String User);
}
