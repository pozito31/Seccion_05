package com.example.seccion_05.activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.seccion_05.R;
import com.example.seccion_05.fragments.DetailsFragment;

public class DetailtsActivity extends AppCompatActivity {

    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailts);

        if (getIntent().getExtras() != null) {
            text = getIntent().getStringExtra("text");
        }

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);
    }
}