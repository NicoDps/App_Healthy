package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_healthy.databinding.FragmentSixthBinding;

public class SixthFragment extends AppCompatActivity {
    private FragmentSixthBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentSixthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button25);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FifthFragment.class);
                startActivity(myIntent);
            }
        });
    }
}
