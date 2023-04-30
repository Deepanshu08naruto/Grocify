package com.example.grocify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.grocify.adapters.ExclusiveAdapter;
import com.example.grocify.adapters.MenuAdapter;
import com.example.grocify.adapters.OffersAdapter;
import com.example.grocify.models.ExclusiveModels;
import com.example.grocify.models.MenuModels;
import com.example.grocify.models.OffersModels;

import java.util.ArrayList;
import java.util.List;

public class MealActivity extends AppCompatActivity {

    RecyclerView recyclerViewOffers;
    List<OffersModels> offersModels;
    OffersAdapter offersAdapter;



    RecyclerView recyclerViewExclusive;
    List<ExclusiveModels> exclusiveModels;
    ExclusiveAdapter exclusiveAdapter;



    RecyclerView recyclerViewMenu;
    List<MenuModels> menuModels;
    MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        getOffers();

        getAllExclusive();
        getMenuData();
    }

    private void getAllExclusive() {

        recyclerViewExclusive = findViewById(R.id.rec_exc);
        recyclerViewExclusive.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        exclusiveModels = new ArrayList<>();
        exclusiveModels.add(new ExclusiveModels(R.drawable.apple));
        exclusiveModels.add(new ExclusiveModels(R.drawable.banana));
        exclusiveModels.add(new ExclusiveModels(R.drawable.orange));
        exclusiveModels.add(new ExclusiveModels(R.drawable.pineapple));
        exclusiveModels.add(new ExclusiveModels(R.drawable.strawberry));

        exclusiveAdapter=new ExclusiveAdapter(exclusiveModels);
        recyclerViewExclusive.setAdapter(exclusiveAdapter);
    }

    private void getMenuData() {

        recyclerViewMenu = findViewById(R.id.rec_all_res);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerViewMenu.setHasFixedSize(true);

        menuModels = new ArrayList<>();
        menuModels.add(new MenuModels(R.drawable.tomato1));
        menuModels.add(new MenuModels(R.drawable.potato1));
        menuModels.add(new MenuModels(R.drawable.capsicum));
        menuModels.add(new MenuModels(R.drawable.carrot1));
        menuModels.add(new MenuModels(R.drawable.chilli));

        menuAdapter=new MenuAdapter(menuModels);
        recyclerViewMenu.setAdapter(menuAdapter);

    }

    private void getOffers() {

        recyclerViewOffers = findViewById(R.id.rec_offer);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        offersModels = new ArrayList<>();
        offersModels.add(new OffersModels(R.drawable.posterapple));
        offersModels.add(new OffersModels(R.drawable.berry));
        offersModels.add(new OffersModels(R.drawable.imagestraw));
        offersModels.add(new OffersModels(R.drawable.posterpineapple));
        offersModels.add(new OffersModels(R.drawable.posterwatermelon));

        offersAdapter=new OffersAdapter(offersModels);
        recyclerViewOffers.setAdapter(offersAdapter);

    }
}