package com.example.android.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button = (Button) findViewById(R.id.upbutton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    }
}
