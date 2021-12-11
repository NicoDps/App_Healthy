package com.example.app_healthy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.app_healthy.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.app.Activity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final int REQUETE = 1;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button11);
        TextView Edit1 = ((TextView) findViewById(R.id.textView2));
        SharedPreferences sharedPreferences= getSharedPreferences("profil", Context.MODE_PRIVATE);

        String nom = sharedPreferences.getString("nom", "Nom");
        String prenom = sharedPreferences.getString("prenom", "Prenom");
        String sexe = sharedPreferences.getString("sexe", "Sexe");
        if(sexe.equals("homme")) {
            Edit1.setText(new StringBuilder().append("Bonjour Mr ").append(prenom).append(" ").append(nom).toString());
        }
        else if(sexe.equals("femme")){
            Edit1.setText(new StringBuilder().append("Bonjour Mme ").append(prenom).append(" ").append(nom).toString());
        }
        else {
            Edit1.setText("Bonjour et bienvenue");
        }
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);

                startActivity(myIntent);
            }
        });
    }
}