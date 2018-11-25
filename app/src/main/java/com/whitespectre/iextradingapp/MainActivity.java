package com.whitespectre.iextradingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.whitespectre.iextradinglib.IEXTradingMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IEXTradingMessage.getMessage(this, "Testing IEXTrading API");

    }
}
