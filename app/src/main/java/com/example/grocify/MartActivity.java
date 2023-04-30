package com.example.grocify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.grocify.adapters.CategoryAdapter;
import com.example.grocify.adapters.ExclusiveAdapter;
import com.example.grocify.adapters.LaysAdapter;
import com.example.grocify.adapters.OffersAdapter;
import com.example.grocify.adapters.TeaCoffeeAdapter;
import com.example.grocify.models.CategoryModels;
import com.example.grocify.models.ExclusiveModels;
import com.example.grocify.models.OffersModels;
import com.example.grocify.models.SnackModels;
import com.example.grocify.models.TeaCoffeeModels;

import java.util.ArrayList;
import java.util.List;

public class MartActivity extends AppCompatActivity {

    RecyclerView recyclerViewCategory;
    List<CategoryModels> categoryModels;
    CategoryAdapter categoryAdapter;

    RecyclerView recyclerViewTea;
    List<TeaCoffeeModels> teaCoffeeModels;
    TeaCoffeeAdapter teaCoffeeAdapter;

    RecyclerView recyclerViewSnack;
    List<SnackModels> snackModels;
    LaysAdapter laysAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart);

        getCategory();
        getTeaAndCoffee();
        getSnacks();
    }

    private void getSnacks() {

        recyclerViewSnack = findViewById(R.id.rec_snack);
        recyclerViewSnack.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewSnack.setHasFixedSize(true);

        snackModels = new ArrayList<>();
        snackModels.add(new SnackModels(R.drawable.chips6));
        snackModels.add(new SnackModels(R.drawable.chips2));
        snackModels.add(new SnackModels(R.drawable.chips3));
        snackModels.add(new SnackModels(R.drawable.chips5));
        snackModels.add(new SnackModels(R.drawable.chips));


        laysAdapter=new LaysAdapter(snackModels);
        recyclerViewSnack.setAdapter(laysAdapter);

    }

    private void getTeaAndCoffee() {

        recyclerViewTea = findViewById(R.id.rec_tea);
        recyclerViewTea.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewTea.setHasFixedSize(true);

        teaCoffeeModels = new ArrayList<>();
        teaCoffeeModels.add(new TeaCoffeeModels(R.drawable.coffee1));
        teaCoffeeModels.add(new TeaCoffeeModels(R.drawable.coffee6));
        teaCoffeeModels.add(new TeaCoffeeModels(R.drawable.coffee3));
        teaCoffeeModels.add(new TeaCoffeeModels(R.drawable.coffee4));
        teaCoffeeModels.add(new TeaCoffeeModels(R.drawable.coffee5));


        teaCoffeeAdapter=new TeaCoffeeAdapter(teaCoffeeModels);
        recyclerViewTea.setAdapter(teaCoffeeAdapter);
    }



    private void getCategory() {

        recyclerViewCategory = findViewById(R.id.rec_cat);
        recyclerViewCategory.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false));
        recyclerViewCategory.setHasFixedSize(true);

        categoryModels = new ArrayList<>();
        categoryModels.add(new CategoryModels(R.drawable.cart1));
        categoryModels.add(new CategoryModels(R.drawable.cart2));
        categoryModels.add(new CategoryModels(R.drawable.cart3));
        categoryModels.add(new CategoryModels(R.drawable.cart4));
        categoryModels.add(new CategoryModels(R.drawable.cart5));
        categoryModels.add(new CategoryModels(R.drawable.cart1));
        categoryModels.add(new CategoryModels(R.drawable.cart2));
        categoryModels.add(new CategoryModels(R.drawable.cart3));
        categoryModels.add(new CategoryModels(R.drawable.cart4));
        categoryModels.add(new CategoryModels(R.drawable.cart5));

        categoryAdapter=new CategoryAdapter(categoryModels);
        recyclerViewCategory.setAdapter(categoryAdapter);
    }
}