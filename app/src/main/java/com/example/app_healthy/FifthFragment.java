package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        {
            Button next = findViewById(R.id.button12);
            next.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                    startActivity(myIntent);
                }
            });
        }
    }
}
