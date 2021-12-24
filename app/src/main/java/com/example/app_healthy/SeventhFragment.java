package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_healthy.databinding.FragmentSeventhBinding;


public class SeventhFragment extends AppCompatActivity {
    private FragmentSeventhBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentSeventhBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button MenuRecette = findViewById(R.id.button16);
        MenuRecette.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goMenuRecette = new Intent(getApplication(), FifthFragment.class);
                startActivity(goMenuRecette);
            }
        });
    }
}
