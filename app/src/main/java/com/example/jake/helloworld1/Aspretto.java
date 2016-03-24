package com.example.jake.helloworld1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.List;

public class Aspretto extends AppCompatActivity {

    private List<Product> products = A_data.productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspretto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] aitmems = getResources().getStringArray(R.array.aspretto_menu);
        ProductListAdapter adapter = new ProductListAdapter(
                this, R.layout.list_item, products);
        ListView alv = (ListView) findViewById(R.id.amenu); // found in the lstview of aspretto// content page
        alv.setAdapter(adapter);
    }

}
