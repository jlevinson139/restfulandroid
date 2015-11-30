package com.example.erin.staff.API;

import com.example.erin.staff.Models.User;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Erin on 15-11-30.
 */
public interface GitHubService {
    @GET("/users/{username}")
    Call<User> getUser(@Path("username") String username);
}