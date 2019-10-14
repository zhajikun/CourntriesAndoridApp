package com.devtides.countries2app.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.devtides.countries2app.model.CountryModel;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends ViewModel {
    //Observer
    public MutableLiveData<List<CountryModel>> countries = new MutableLiveData<>();
    //Observer
    public MutableLiveData<Boolean> countryLoadError = new MutableLiveData<>();
    //Observer
    public MutableLiveData<Boolean> loading = new MutableLiveData<>();

    public void refresh(){
        fetchCountries();
    }

    public void fetchCountries(){
        //https://raw.githubusercontent.com/DevTides/countries/master/countriesV2.json
        CountryModel country1 = new CountryModel("Albania", "Tirana", "");
        CountryModel country2 = new CountryModel("Brazil", "Brasilia", "");
        CountryModel country3 = new CountryModel("Czechia", "Praha", "");

        List<CountryModel> list = new ArrayList<>();
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country1);
        list.add(country2);
        list.add(country3);

        countries.setValue(list);
        countryLoadError.setValue(false);
        loading.setValue(false);
    }

}
