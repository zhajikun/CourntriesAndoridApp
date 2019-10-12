package com.devtides.countries2app.view;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devtides.countries2app.R;
import com.devtides.countries2app.model.CountryModel;

import java.util.List;

import butterknife.BindView;

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>{


    private List<CountryModel> countries;

    public CountryListAdapter(List<CountryModel> countries){
        this.countries = countries;
    }

    public void updateCountries(List<CountryModel> countries){
        this.countries.clear();
        this.countries.addAll(countries);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return this.countries.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageView)
        ImageView countryImage;



        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(CountryModel country){

        }

    }

}
