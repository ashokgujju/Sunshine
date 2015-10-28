package com.ashokgujju.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String forecastArray[] = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/46",
                "Weds - Cloudy - 72/63",
                "Thurs - Rainy - 65/51",
                "Fri - Foggy - 70/46",
                "Sat - Sunny - 76/68"
        };
        List<String> weekForcast = new ArrayList<>(Arrays.asList(forecastArray));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForcast);

        ListView listView = (ListView) findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);
    }
}