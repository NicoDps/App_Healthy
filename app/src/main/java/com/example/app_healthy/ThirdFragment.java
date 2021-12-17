package com.example.app_healthy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.app_healthy.databinding.FragmentThirdBinding;



public class ThirdFragment extends AppCompatActivity {
    private FragmentThirdBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                startActivity(myIntent);
            }
        });

        Button Calcul = findViewById(R.id.button);
        Calcul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int calcule = 0;
                SharedPreferences sharedPreferences = getSharedPreferences("profil", Context.MODE_PRIVATE);
                String age = sharedPreferences.getString("age", "Age");
                String sexe = sharedPreferences.getString("SexeChoisi", "Sexe");
                String taille = sharedPreferences.getString("taille", "Taille");
                String poids = sharedPreferences.getString("poids", "Poids");

                TextView t = (TextView) findViewById(R.id.textView11);
                if(sexe.equals("Homme") && !age.equals("Age") && !taille.equals("Taille") && !poids.equals("Poids")) {
                    calcule = (int) ((((Integer.parseInt(poids) * 13.75) + (Integer.parseInt(taille) * 5)) - (Integer.parseInt(age) * 6.75)) + 66.47);
                    t.setText(calcule +" Kcal");
                }
                else if(sexe.equals("Femme") && !age.equals("Age") && !taille.equals("Taille") && !poids.equals("Poids")){
                    calcule =(int) ((((Integer.parseInt(poids) * 9.56) + (Integer.parseInt(taille) * 1.84)) - (Integer.parseInt(age) * 4.67)) + 655.1);
                    t.setText(calcule +" Kcal");
                }
                else {
                    t.setText("Remplissez votre profil complétement");
                }
            }
        });
    }
}