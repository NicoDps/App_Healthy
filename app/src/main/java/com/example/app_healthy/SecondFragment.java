package com.example.app_healthy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.example.app_healthy.databinding.FragmentSecondBinding;

import org.w3c.dom.Text;

public class SecondFragment extends AppCompatActivity {
    private FragmentSecondBinding binding;

    @SuppressLint("ResourceType")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                startActivity(myIntent);
            }
        });
    }
}