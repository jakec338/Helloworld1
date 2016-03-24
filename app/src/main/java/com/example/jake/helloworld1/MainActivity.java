package com.example.jake.helloworld1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        String[] items = getResources().getStringArray(R.array.cafes);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1, items); // therefore adapter knows what data it is using, its layout and id of text view(?)
        ListView lv = (ListView) findViewById(R.id.listView); // listView created when list view dragged onto activity main
        lv.setAdapter(adapter); // adapter object

        AdapterView.OnItemClickListener itemClickListener =     //onclicklistener listens for clicks, onitemclick says how to respond
                new AdapterView.OnItemClickListener(){
           public void onItemClick(AdapterView<?> listView,
                                   View v,
                                   int position,
                                   long id) {
               if (position == 0) {
                   Intent intent = new Intent(MainActivity.this,
                           PrintRoom.class);
                   startActivity(intent);
               }
               if (position == 1){
                   Intent intent = new Intent(MainActivity.this,
                           Pizza_neo.class);
                   startActivity(intent);
               }
               if (position == 2){
                   Intent intent = new Intent(MainActivity.this,
                           Aspretto.class);
                   startActivity(intent);
               }
               if (position == 3){
                   Intent intent = new Intent(MainActivity.this,
                           Gordons_cafe.class);
                   startActivity(intent);
               }
               if (position == 4){
                   Intent intent = new Intent(MainActivity.this,
                           George_farah_cafe.class);
                   startActivity(intent);
               }
           }
                };
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
