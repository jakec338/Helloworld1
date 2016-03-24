package com.example.jake.helloworld1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.List;

public class Gordons_cafe extends AppCompatActivity {

    private List<Product> products = G_data.productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gordons_cafe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] pzitmems = getResources().getStringArray(R.array.gordons_menu);
        ProductListAdapter adapter = new ProductListAdapter(
                this, R.layout.list_item, products);
        ListView pzlv = (ListView) findViewById(R.id.gmenu); // found in the lstview of pizzaneo// content page
        pzlv.setAdapter(adapter);

    }

}
