package com.example.retrofitex.Service;

import com.example.retrofitex.Model.CountryModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {
    @GET("countries")
    Call<CountryModel> getData();
}
