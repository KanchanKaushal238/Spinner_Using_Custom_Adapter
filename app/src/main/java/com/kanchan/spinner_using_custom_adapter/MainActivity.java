package com.kanchan.spinner_using_custom_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String[] titles = new String[] { "birda",
            "birdb", "birdc", "birdd", "birde", "birdf", "birdg", "birdh"};

    public static final Integer[] images = { R.drawable.birda,
            R.drawable.birdb, R.drawable.birdc, R.drawable.birdd,
            R.drawable.birde,R.drawable.birdf,R.drawable.birdg,R.drawable.birdh};

    Spinner spinner;
    List<RowItem> rowItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < titles.length; i++) {

            RowItem item = new RowItem(titles[i],images[i]);
            rowItems.add(item);
        }

        spinner = (Spinner)findViewById(R.id.spinner);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,
                R.layout.listitems_layout, R.id.title, rowItems);
        spinner.setAdapter(adapter);
    }
    }

