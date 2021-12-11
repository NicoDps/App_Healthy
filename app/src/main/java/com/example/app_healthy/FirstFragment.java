package com.example.app_healthy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



import com.example.app_healthy.databinding.FragmentFirstBinding;

public class FirstFragment extends AppCompatActivity {
    private FragmentFirstBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button Home = findViewById(R.id.button4);
        Button Profile = findViewById(R.id.button5);
        Button Calculate = findViewById(R.id.button6);
        Button Tips = findViewById(R.id.button7);
        Button Recipe = findViewById(R.id.button8);

        Home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), MainActivity.class);
                startActivity(myIntent);
            }
        });
        Profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), SecondFragment.class);
                startActivity(myIntent);
            }
        });
        Calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), ThirdFragment.class);
                startActivity(myIntent);
            }
        });
        Tips.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FourthFragment.class);
                startActivity(myIntent);
            }
        });
        Recipe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FifthFragment.class);
                startActivity(myIntent);
            }
        });
    }
}
