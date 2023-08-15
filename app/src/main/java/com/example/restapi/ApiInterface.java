package com.example.restapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("posts/{id}")
    public Call<Post> getPost(@Path("id") int userId);
}
