package com.example.calenderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView yLabel = findViewById(R.id.yLabel);
        TextView mLabel = findViewById(R.id.mLabel);
        TextView dLabel = findViewById(R.id.dLabel);
        TextView eLabel = findViewById(R.id.eLabel);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMMM/d/E",Locale.US);

        String strDate = sdf.format(calendar.getTime());

        String[] arrDate = strDate.split("/",0);

        yLabel.setText(arrDate[0]);
        mLabel.setText(arrDate[1]);
        dLabel.setText(arrDate[2]);
        eLabel.setText(arrDate[3]);

    }
}
