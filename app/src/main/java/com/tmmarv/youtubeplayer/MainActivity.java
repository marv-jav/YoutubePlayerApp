package com.tmmarv.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSingle = (Button) findViewById(R.id.btnPlaySingle);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnStandalone = (Button) findViewById(R.id.buttonStandalone);

        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnPlaySingle:
                intent = new Intent(this, YoutubeActivity.class);
                break;
            case R.id.buttonStandalone:
                intent = new Intent(this, StandaloneActivity.class);
                break;
            default:
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}