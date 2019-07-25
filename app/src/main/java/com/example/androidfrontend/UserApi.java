package com.example.androidfrontend;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserApi {

    @POST("userToken")
    Call<Void> createUser(@Body UserToken user);
}
