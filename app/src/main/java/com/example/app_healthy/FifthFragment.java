package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_healthy.databinding.FragmentFifthBinding;


public class FifthFragment extends AppCompatActivity {
    private FragmentFifthBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentFifthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button next = findViewById(R.id.button12);
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

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.mangerbouger.fr/Manger-mieux/Recettes/gratin-de-courgette");
        WebView myWebView1 = (WebView) findViewById(R.id.webview1);
        myWebView1.loadUrl("https://www.mangerbouger.fr/Manger-mieux/Recettes/Tartines-de-jambon-cru-tomates-et-basilic");
        WebView myWebView2 = (WebView) findViewById(R.id.webview2);
        myWebView2.loadUrl("https://www.mangerbouger.fr/Manger-mieux/Recettes/Salade-de-riz-complet");
        WebView myWebView3 = (WebView) findViewById(R.id.webview3);
        myWebView3.loadUrl("https://www.mangerbouger.fr/Manger-mieux/Recettes/Spaghettis-aux-tomates-fraiches-et-basilic");

        Button next1 = findViewById(R.id.button14);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), MainActivity.class);
                startActivity(myIntent);
            }
        });
        Button next2 = findViewById(R.id.button15);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                startActivity(myIntent);
            }
        });
        Button next3 = findViewById(R.id.button17);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), SecondFragment.class);
                startActivity(myIntent);
            }
        });
        Button next4 = findViewById(R.id.button18);
        next4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), ThirdFragment.class);
                startActivity(myIntent);
            }
        });
    }
}