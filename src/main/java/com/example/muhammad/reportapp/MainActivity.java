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

        ReportCard reportCard = new ReportCard(100, 100, 100, 100, 100, "Muhammad", 12345);
        reportCard.setChemistryMarks(76);
        reportCard.setMathMarks(58);
        reportCard.setEnglishMarks(48);
        reportCard.setPhysicsMarks(59);
        reportCard.setComputerMarks(59);

        Log.v(LOG_TAG, reportCard.toString());

        textView.setText(reportCard.displayResult());

    }
}
