package com.example.app_healthy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.app_healthy.databinding.FragmentThirdBinding;

import org.w3c.dom.Text;

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
                Intent in = getIntent();
                Bundle b = in.getExtras();
                String age = b.getString("donnee");
                String sexe = b.getString("donnee2");
                String taille = b.getString("donnee3");
                String poids = b.getString("donnee4");
                Bundle b1 = new Bundle();
                b1.putString("donnee", age);
                b1.putString("donnee2", sexe);
                b1.putString("donnee3", taille);
                b1.putString("donnee4", poids);
                myIntent.putExtras(b1);
                startActivity(myIntent);
            }
        });

        Button Calcul = findViewById(R.id.button);
        Calcul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int calcule = 0;
                Intent in = getIntent();
                Bundle b = in.getExtras();
                String age = b.getString("donnee");
                String sexe = b.getString("donnee2");
                String taille = b.getString("donnee3");
                String poids = b.getString("donnee4");
                TextView t = (TextView) findViewById(R.id.textView11);
                calcule = (int) ((((Integer.parseInt(poids) * 10) + (Integer.parseInt(taille) * 6.25)) - (Integer.parseInt(age) * 5)) + 5);
                t.setText(String.valueOf(calcule)+" Kcal");
            }
        });
    }
}