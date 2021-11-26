package com.example.app_healthy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                Bundle b = new Bundle();
                EditText Edit1 = ((EditText) findViewById(R.id.editTextTextPersonName3));
                EditText Edit2 = ((EditText) findViewById(R.id.editTextTextPersonName4));
                EditText Edit3 = ((EditText) findViewById(R.id.editTextTextPersonName5));
                EditText Edit4 = ((EditText) findViewById(R.id.editTextTextPersonName6));
                String age = Edit1.getText().toString();
                String sexe = Edit2.getText().toString();
                String taille = Edit3.getText().toString();
                String poids = Edit4.getText().toString();
                b.putString("donnee", age);
                b.putString("donnee2", sexe);
                b.putString("donnee3", taille);
                b.putString("donnee4", poids);
                myIntent.putExtras(b);
                startActivity(myIntent);
            }
        });
    }
}