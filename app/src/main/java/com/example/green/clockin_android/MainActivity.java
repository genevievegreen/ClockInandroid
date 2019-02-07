package com.example.green.clockin_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //object variables
    private Button buttonClockIn;
    private Button buttonClockOut;
    private TextView textTimeDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTimeDisplay = (TextView)findViewById(R.id.text_display);
        buttonClockIn = (Button)findViewById(R.id.button_ClockIn);
        buttonClockOut = (Button)findViewById(R.id.button_ClockOut);
    }
}
