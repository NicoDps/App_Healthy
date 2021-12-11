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
        Button next = findViewById(R.id.button12);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                startActivity(myIntent);
            }
        });

        Button next1 = findViewById(R.id.button14);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), SixthFragment.class);
                startActivity(myIntent);
            }
        });
        Button next2 = findViewById(R.id.button15);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), SeventhFragment.class);
                startActivity(myIntent);
            }
        });
        Button next3 = findViewById(R.id.button17);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), EighthFragment.class);
                startActivity(myIntent);
            }
        });
        Button next4 = findViewById(R.id.button18);
        next4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), NinethFragment.class);
                startActivity(myIntent);
            }
        });
    }
}