package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.eazegraph.lib.charts.PieChart;

public class MainActivity extends AppCompatActivity {

        PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = findViewById(R.id.piechart);
    }

    public void goTrackCountries(View view) {
    }
}
