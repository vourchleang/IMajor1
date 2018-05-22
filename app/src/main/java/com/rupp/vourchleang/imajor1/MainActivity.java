package com.rupp.vourchleang.imajor1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String[] items;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
      GetInTouch();


    }

    public void GetInTouch() {

        items = new String[]{"Call us", "Email us"};
        listItems = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.activity_list,
                                            R.id.txtitems,listItems);
        listView.setAdapter(adapter);

    }

}
