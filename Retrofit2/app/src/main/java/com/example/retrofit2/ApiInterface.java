package com.example.retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/retrofit/getuser.php")
    Call<List<UserListResponse>> getUsersList();
}
