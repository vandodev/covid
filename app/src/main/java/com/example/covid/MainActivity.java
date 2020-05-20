package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;

public class MainActivity extends AppCompatActivity {
        TextView tvCases, tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvAffectedConuntries;
        SimpleArcLoader simpleArcLoader;
        ScrollView scrollCiew;
        PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvTotalDeaths);
        tvAffectedConuntries = findViewById(R.id.tvAffectedCountries);

        simpleArcLoader = findViewById(R.id.loader);
        scrollCiew = findViewById(R.id.scrollStats);
        pieChart = findViewById(R.id.piechart);
    }

    public void goTrackCountries(View view) {
    }
}
