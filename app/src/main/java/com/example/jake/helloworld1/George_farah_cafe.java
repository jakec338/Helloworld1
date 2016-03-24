package com.example.jake.helloworld1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class George_farah_cafe extends AppCompatActivity {

    private List<Product> products = Gf_data.productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_george_farah_cafe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] pzitmems = getResources().getStringArray(R.array.gf_menu);
        ProductListAdapter adapter = new ProductListAdapter(
                this, R.layout.list_item, products);
        ListView pzlv = (ListView) findViewById(R.id.gmenu); // found in the lstview of pizzaneo// content page
        pzlv.setAdapter(adapter);

    }

}
