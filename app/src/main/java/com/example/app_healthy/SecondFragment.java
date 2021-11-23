package com.example.app_healthy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.example.app_healthy.databinding.FragmentSecondBinding;

public class SecondFragment extends AppCompatActivity {
    private FragmentSecondBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
