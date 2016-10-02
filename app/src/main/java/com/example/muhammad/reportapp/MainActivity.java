package com.example.muhammad.reportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textview);

        ReportCard reportCard = new ReportCard(100, 100, 100, 100, 100, "Rameez", 12345);
        reportCard.setChemistryMarks(76);
        reportCard.setMathMarks(70);
        reportCard.setEnglishMarks(80);
        reportCard.setPhysicsMarks(75);
        reportCard.setComputerMarks(90);

        Log.v(LOG_TAG, reportCard.toString());

        textView.setText(reportCard.displayResult());

    }
}
