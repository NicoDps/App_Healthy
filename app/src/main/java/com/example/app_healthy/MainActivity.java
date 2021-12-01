package com.example.app_healthy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
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


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button11);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                Bundle b =new Bundle();
                EditText Edit1 = ((EditText) findViewById(R.id.editTextTextPersonName16));
                EditText Edit2 = ((EditText) findViewById(R.id.editTextTextPersonName19));
                EditText Edit3 = ((EditText) findViewById(R.id.editTextTextPersonName17));
                EditText Edit4 = ((EditText) findViewById(R.id.editTextTextPersonName18));
                EditText Edit5 = ((EditText) findViewById(R.id.editTextTextPersonName14));
                EditText Edit6 = ((EditText) findViewById(R.id.editTextTextPersonName15));
                String age = Edit1.getText().toString();
                String sexe = Edit2.getText().toString();
                String taille = Edit3.getText().toString();
                String poids = Edit4.getText().toString();
                String nom = Edit5.getText().toString();
                String prenom = Edit6.getText().toString();
                b.putString("donnee", age);
                b.putString("donnee2", sexe);
                b.putString("donnee3", taille);
                b.putString("donnee4", poids);
                b.putString("donnee5", nom);
                b.putString("donnee6", prenom);
                myIntent.putExtras(b);
                startActivity(myIntent);
            }
        });
    }
}