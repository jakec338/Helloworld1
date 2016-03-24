package com.example.jake.helloworld1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.List;

public class Pizza_neo extends AppCompatActivity {

    private List<Product> products = Pz_data.productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_neo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] pzitmems = getResources().getStringArray(R.array.prmenu);
        ProductListAdapter adapter = new ProductListAdapter(
                this, R.layout.list_item, products);
        ListView pzlv = (ListView) findViewById(R.id.pzmenu); // found in the lstview of pizzaneo// content page
        pzlv.setAdapter(adapter);


    }

}
