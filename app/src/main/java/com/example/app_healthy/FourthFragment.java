package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.example.app_healthy.databinding.FragmentFourthBinding;


public class FourthFragment extends AppCompatActivity {
    private FragmentFourthBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentFourthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button10);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                startActivity(myIntent);
            }
        });
    }
}
