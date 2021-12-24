package com.example.app_healthy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_healthy.databinding.FragmentFifthBinding;


public class FifthFragment extends AppCompatActivity {
    private FragmentFifthBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentFifthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button Menu = findViewById(R.id.button12);
        Menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goMenu= new Intent(getApplication(), FirstFragment.class);
                startActivity(goMenu);
            }
        });

        Button Recette1 = findViewById(R.id.button14);
        Recette1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goRecette1 = new Intent(getApplication(), SixthFragment.class);
                startActivity(goRecette1);
            }
        });
        Button Recette2 = findViewById(R.id.button15);
        Recette2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goRecette2 = new Intent(getApplication(), SeventhFragment.class);
                startActivity(goRecette2);
            }
        });
        Button Recette3 = findViewById(R.id.button17);
        Recette3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goRecette3 = new Intent(getApplication(), EighthFragment.class);
                startActivity(goRecette3);
            }
        });
        Button Recette4 = findViewById(R.id.button18);
        Recette4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goRecette4 = new Intent(getApplication(), NinethFragment.class);
                startActivity(goRecette4);
            }
        });
    }
}