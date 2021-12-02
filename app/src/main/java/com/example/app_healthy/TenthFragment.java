package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_healthy.databinding.FragmentTenthBinding;


public class TenthFragment extends AppCompatActivity {

    private FragmentTenthBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentTenthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button11);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                Intent in = getIntent();
                Bundle b = in.getExtras();
                String age = b.getString("donnee");
                String sexe = b.getString("donnee2");
                String taille = b.getString("donnee3");
                String poids = b.getString("donnee4");
                String nom = b.getString("donnee5");
                String prenom = b.getString("donnee6");
                Bundle b1 = new Bundle();
                b1.putString("donnee", age);
                b1.putString("donnee2", sexe);
                b1.putString("donnee3", taille);
                b1.putString("donnee4", poids);
                b1.putString("donnee5", nom);
                b1.putString("donnee6", prenom);
                myIntent.putExtras(b1);
                startActivity(myIntent);
            }
        });
    }
}