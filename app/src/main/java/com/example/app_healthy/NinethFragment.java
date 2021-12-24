package com.example.app_healthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.app_healthy.databinding.FragmentNinethBinding;

public class NinethFragment extends AppCompatActivity {
    private FragmentNinethBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentNinethBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button MenuRecette = findViewById(R.id.button25);
        MenuRecette.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goMenuRecette = new Intent(getApplication(), FifthFragment.class);
                startActivity(goMenuRecette);
            }
        });
    }
}
