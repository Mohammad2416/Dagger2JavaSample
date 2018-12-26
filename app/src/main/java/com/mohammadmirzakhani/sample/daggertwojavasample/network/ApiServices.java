package com.mohammadmirzakhani.sample.daggertwojavasample.network;

import com.mohammadmirzakhani.sample.daggertwojavasample.model.Banner;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {
    @GET("banners")
    Call<Banner> getBanners();

    @GET("banners")
    Observable<Banner> getBannersWithRx();
}

