package com.example.app_healthy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.example.app_healthy.databinding.FragmentSecondBinding;

import org.w3c.dom.Text;

import java.util.Set;

public class SecondFragment extends AppCompatActivity {
    private FragmentSecondBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent in = getIntent();
        Bundle b = in.getExtras();
        String age = b.getString("donnee");
        String sexe = b.getString("donnee2");
        String taille = b.getString("donnee3");
        String poids = b.getString("donnee4");
        String nom = b.getString("donnee5");
        String prenom = b.getString("donnee6");
        EditText Edit1 = ((EditText) findViewById(R.id.editTextTextPersonName3));
        EditText Edit2 = ((EditText) findViewById(R.id.editTextTextPersonName4));
        EditText Edit3 = ((EditText) findViewById(R.id.editTextTextPersonName5));
        EditText Edit4 = ((EditText) findViewById(R.id.editTextTextPersonName6));
        EditText Edit5 = ((EditText) findViewById(R.id.editTextTextPersonName));
        EditText Edit6 = ((EditText) findViewById(R.id.editTextTextPersonName2));
        Edit1.setText(age);
        Edit2.setText(sexe);
        Edit3.setText(taille);
        Edit4.setText(poids);
        Edit5.setText(nom);
        Edit6.setText(prenom);
        Button next = findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                Bundle b =new Bundle();
                EditText Edit1 = ((EditText) findViewById(R.id.editTextTextPersonName3));
                EditText Edit2 = ((EditText) findViewById(R.id.editTextTextPersonName4));
                EditText Edit3 = ((EditText) findViewById(R.id.editTextTextPersonName5));
                EditText Edit4 = ((EditText) findViewById(R.id.editTextTextPersonName6));
                EditText Edit5 = ((EditText) findViewById(R.id.editTextTextPersonName));
                EditText Edit6 = ((EditText) findViewById(R.id.editTextTextPersonName2));
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