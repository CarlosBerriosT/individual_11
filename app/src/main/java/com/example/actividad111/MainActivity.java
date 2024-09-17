package com.example.actividad111;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            Fragment radioFragment = new FragmentoRadio();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerRadio, radioFragment)
                    .commit();
        }

        Button buttonLoadImageFragment = findViewById(R.id.buttonLoadImageFragment);
        Button buttonClose = findViewById(R.id.buttonClose);

        buttonLoadImageFragment.setOnClickListener(v -> {

            Fragment imageFragment = new FragmentoImagen();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerImage, imageFragment)
                    .commit();
        });

        buttonClose.setOnClickListener(v -> {

            finish();
        });
    }
}
