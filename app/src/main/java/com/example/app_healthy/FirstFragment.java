package com.example.app_healthy;

import android.content.Intent;
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
        Intent in = getIntent();
        Bundle b = in.getExtras();
        String nom = b.getString("donnee5");
        String prenom = b.getString("donnee6");
        String sexe = b.getString("donnee2");
        TextView Edit1 = ((TextView) findViewById(R.id.textView2));
        if(sexe.equals("homme")) {
            Edit1.setText(new StringBuilder().append("Bonjour Mr ").append(nom).append(" ").append(prenom).toString());
        }
        else if(sexe.equals("femme")){
            Edit1.setText(new StringBuilder().append("Bonjour Mme ").append(nom).append(" ").append(prenom).toString());
        }


        Home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), TenthFragment.class);
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
        Profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), SecondFragment.class);
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
        Calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), ThirdFragment.class);
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
        Tips.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FourthFragment.class);
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
        Recipe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FifthFragment.class);
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
