package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;



import com.example.app_healthy.databinding.FragmentFirstBinding;

public class FirstFragment extends AppCompatActivity {
    private FragmentFirstBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button5);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), SecondFragment.class);
                startActivity(myIntent);
            }
        });
    }
}
