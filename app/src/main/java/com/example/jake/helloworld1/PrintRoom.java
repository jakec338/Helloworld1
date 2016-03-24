package com.example.jake.helloworld1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class PrintRoom extends AppCompatActivity {

    private List<Product> products = Pr_data.productList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_room);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] pritmems = getResources().getStringArray(R.array.prmenu);
    //    ArrayAdapter<String> adapter =
    //            new ArrayAdapter<String>(this,
      //                  android.R.layout.simple_list_item_1,
        //                android.R.id.text1,
          //              pritmems);
        ProductListAdapter adapter = new ProductListAdapter(
                this, R.layout.list_item, products);
        ListView prlv = (ListView) findViewById(R.id.prmenu); // foundin the lstview of printroom content page
        prlv.setAdapter(adapter);
    }

}
