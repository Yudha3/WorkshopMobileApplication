package com.yudha.retrovolley.retrofit;

import com.yudha.retrovolley.Request;
import com.yudha.retrovolley.User;
import com.yudha.retrovolley.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MethodHTTP {

    @GET("User_Registration.php")
    Call<UserResponse> getUser();

    @POST("User_Registration.php")
    Call<Request> sendUser(@Body User user);
}
