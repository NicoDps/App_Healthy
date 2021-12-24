package com.example.app_healthy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.app_healthy.databinding.FragmentFourthBinding;

public class FourthFragment extends AppCompatActivity {
    private FragmentFourthBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentFourthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button Menu = findViewById(R.id.button10);
        Menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goMenu = new Intent(getApplication(), FirstFragment.class);
                startActivity(goMenu);
            }
        });
        Button lien = findViewById(R.id.button13);
        lien.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String url = "https://www.mangerbouger.fr";
                Intent goLien = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(goLien);
            }
        });
    }
}