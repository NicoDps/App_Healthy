package com.example.app_healthy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.example.app_healthy.databinding.ActivityMainBinding;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button Menu = findViewById(R.id.button11);
        TextView Message = ((TextView) findViewById(R.id.textView2));
        SharedPreferences sharedPreferences= getSharedPreferences("profil", Context.MODE_PRIVATE);

        String nom = sharedPreferences.getString("nom", "Nom");
        String prenom = sharedPreferences.getString("prenom", "Prenom");
        String sexe = sharedPreferences.getString("SexeChoisi", "Sexe");

        if(sexe.equals("Homme") && !nom.equals("Nom") && !prenom.equals("Prenom")) {
            Message.setText(new StringBuilder().append("Bonjour Mr ").append(prenom).append(" ").append(nom).toString());
        }
        else if(sexe.equals("Femme") && !nom.equals("Nom") && !prenom.equals("Prenom")){
            Message.setText(new StringBuilder().append("Bonjour Mme ").append(prenom).append(" ").append(nom).toString());
        }
        else {
            Message.setText("Bonjour et bienvenue");
        }
        Menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goMenu = new Intent(getApplication(), FirstFragment.class);
                startActivity(goMenu);
            }
        });
    }
}