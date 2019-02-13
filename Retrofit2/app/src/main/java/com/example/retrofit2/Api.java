package com.example.retrofit2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static Retrofit retrofit = null;
    public static ApiInterface getClient(){
        if(retrofit == null){
            retrofit = new  Retrofit.Builder()
                    .baseUrl("https://mobileappdatabase.in")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        return apiInterface;
    }
}
