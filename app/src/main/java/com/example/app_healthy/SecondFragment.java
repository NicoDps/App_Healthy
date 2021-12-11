package com.example.app_healthy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.example.app_healthy.databinding.FragmentSecondBinding;

import org.w3c.dom.Text;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Set;

public class SecondFragment extends AppCompatActivity {
    private static final int REQUETE = 1;
    private FragmentSecondBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadProfil();
        Button next = findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplication(), FirstFragment.class);
                doSave(view);
                startActivity(myIntent);
            }
        });
        Button next1 = findViewById(R.id.button19);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                prendrephoto();
            }
        });
    }

    private void prendrephoto() {
        Intent photo = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(photo, REQUETE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUETE && resultCode == RESULT_OK) {
            Bundle b = data.getExtras();
            ImageView photo = findViewById(R.id.imageView2);
            Bitmap imageBitmap = (Bitmap) b.get("data");
            SharedPreferences sharedPreferences= getSharedPreferences("profil", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("photo", encodeTobase64(imageBitmap));
            photo.setImageBitmap(imageBitmap);
            editor.apply();
        }
    }
    private void loadProfil()  {
        SharedPreferences sharedPreferences= getSharedPreferences("profil", Context.MODE_PRIVATE);

        if(sharedPreferences!= null) {

            String age = sharedPreferences.getString("age", "Age");
            String sexe = sharedPreferences.getString("sexe", "Sexe");
            String taille = sharedPreferences.getString("taille", "Taille");
            String poids = sharedPreferences.getString("poids", "Poids");
            String nom = sharedPreferences.getString("nom", "Nom");
            String prenom = sharedPreferences.getString("prenom", "Prenom");

            EditText Edit1 = ((EditText) findViewById(R.id.editTextTextPersonName3));
            EditText Edit2 = ((EditText) findViewById(R.id.editTextTextPersonName4));
            EditText Edit3 = ((EditText) findViewById(R.id.editTextTextPersonName5));
            EditText Edit4 = ((EditText) findViewById(R.id.editTextTextPersonName6));
            EditText Edit5 = ((EditText) findViewById(R.id.editTextTextPersonName));
            EditText Edit6 = ((EditText) findViewById(R.id.editTextTextPersonName2));
            ImageView Photo = findViewById(R.id.imageView2);

            String photo = sharedPreferences.getString("photo", "");
            assert photo != null;
            if(!photo.equals("photo"))
            {
                byte[] b = Base64.decode(photo, Base64.DEFAULT);
                InputStream is = new ByteArrayInputStream(b);
                Bitmap bitmap = BitmapFactory.decodeStream(is);
                Photo.setImageBitmap(bitmap);
            }
            Edit1.setText(age);
            Edit2.setText(sexe);
            Edit3.setText(taille);
            Edit4.setText(poids);
            Edit5.setText(nom);
            Edit6.setText(prenom);
        }
    }

    public void doSave(View view)  {
        SharedPreferences sharedPreferences= getSharedPreferences("profil", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        EditText Edit1 = ((EditText) findViewById(R.id.editTextTextPersonName3));
        EditText Edit2 = ((EditText) findViewById(R.id.editTextTextPersonName4));
        EditText Edit3 = ((EditText) findViewById(R.id.editTextTextPersonName5));
        EditText Edit4 = ((EditText) findViewById(R.id.editTextTextPersonName6));
        EditText Edit5 = ((EditText) findViewById(R.id.editTextTextPersonName));
        EditText Edit6 = ((EditText) findViewById(R.id.editTextTextPersonName2));

        editor.putString("age", Edit1.getText().toString());
        editor.putString("sexe", Edit2.getText().toString());
        editor.putString("taille", Edit3.getText().toString());
        editor.putString("poids", Edit4.getText().toString());
        editor.putString("nom", Edit5.getText().toString());
        editor.putString("prenom", Edit6.getText().toString());
        editor.apply();

        Toast.makeText(this,"Profil saved!",Toast.LENGTH_LONG).show();
    }
    public static String encodeTobase64(Bitmap image) {
        Bitmap bitmap_image = image;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap_image.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);

        return imageEncoded;
    }
}