package com.devtides.countries2app.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.TextView;

import com.devtides.countries2app.R;
import com.devtides.countries2app.model.CountryModel;
import com.devtides.countries2app.viewmodel.ListViewModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.contriesList)
    RecyclerView counriesList;

    @BindView(R.id.list_error)
    TextView listError;

    @BindView(R.id.loading_view)
    TextView loadingView;

    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout refreshLayout;

    private ListViewModel viewModel;

    private CountryListAdapter adapter = new CountryListAdapter(new ArrayList<>());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        viewModel = ViewModelProviders.of(this).get(ListViewModel.class);
        viewModel.refresh();

        counriesList.setLayoutManager(new LinearLayoutManager(this));
        counriesList.setAdapter(adapter);

        observeViewModel();

    }

    private void observeViewModel() {
        viewModel.countries.observe(this, countryModels -> {
            if(countryModels != null){
                //counriesList
            }
        });
    }
}
