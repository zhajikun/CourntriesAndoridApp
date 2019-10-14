package com.devtides.countries2app.model;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class CountriesService {

    private static final String BASE_URL = "https://raw.githubusercontent.com";

    private static CountriesService instantce;

    private CountriesApi api =  new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(CountriesApi.class);

    private CountriesService(){

    }

    public static CountriesService getInstance(){
        if(null == instantce){
            instantce = new CountriesService();
        }

        return instantce;
    }
}
