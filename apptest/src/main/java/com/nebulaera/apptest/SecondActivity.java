package com.nebulaera.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);
        toolbar = (Toolbar) findViewById(R.id.toolbar_test);
        toolbar.setNavigationIcon(android.R.drawable.arrow_up_float);
    }
}
