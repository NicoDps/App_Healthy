package com.example.app_healthy;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.app_healthy.databinding.FragmentSecondBinding;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class SecondFragment extends AppCompatActivity {
    private static final int REQUETE = 1;
    private FragmentSecondBinding binding;
    String[] sexe = {"Sexe","Homme","Femme"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Spinner Sexe = (Spinner) findViewById(R.id.Sexe);
        ArrayAdapter Selection = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sexe);
        Sexe.setAdapter(Selection);
        loadProfil();
        Button Menu = findViewById(R.id.button2);
        Menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goMenu = new Intent(getApplication(), FirstFragment.class);
                doSave();
                startActivity(goMenu);
            }
        });
        Button Photo = findViewById(R.id.button19);
        Photo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                prendrephoto();
            }
        });
    }

    private void prendrephoto() {
        Intent photo = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(photo, REQUETE);
        TextView Edit7 = ((TextView) findViewById(R.id.textView8));
        Edit7.setText("");
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUETE && resultCode == RESULT_OK) {
            Bundle b = data.getExtras();
            ImageView Photo = findViewById(R.id.imageView2);
            Bitmap imageBitmap = (Bitmap) b.get("data");
            SharedPreferences sharedPreferences= getSharedPreferences("profil", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("photo", encodeTobase64(imageBitmap));
            Photo.setImageBitmap(imageBitmap);
            editor.apply();
        }
    }
    private void loadProfil()  {
        SharedPreferences Profil = getSharedPreferences("profil", Context.MODE_PRIVATE);

        if(Profil != null) {

            String age = Profil.getString("age", "Age");
            String taille = Profil.getString("taille", "Taille (cm)");
            String poids = Profil.getString("poids", "Poids (Kg)");
            String nom = Profil.getString("nom", "Nom");
            String prenom = Profil.getString("prenom", "Prenom");
            String prendPhoto = Profil.getString("prendre photo", "Prenez votre photo ici");

            EditText Age = ((EditText) findViewById(R.id.editTextTextPersonName3));
            EditText Taille = ((EditText) findViewById(R.id.editTextTextPersonName5));
            EditText Poids = ((EditText) findViewById(R.id.editTextTextPersonName6));
            EditText Nom = ((EditText) findViewById(R.id.editTextTextPersonName));
            EditText Prenom = ((EditText) findViewById(R.id.editTextTextPersonName2));
            TextView PrendrePhoto = ((TextView) findViewById(R.id.textView8));
            ImageView Photo = findViewById(R.id.imageView2);
            Spinner Sexe = (Spinner) findViewById(R.id.Sexe);
            int sexe = Profil.getInt("Sexe",0);

            String photo = Profil.getString("photo", "@tools:sample/avatars[0]");
            assert photo != null;
            if(!photo.equals("photo"))
            {
                byte[] b = Base64.decode(photo, Base64.DEFAULT);
                InputStream is = new ByteArrayInputStream(b);
                Bitmap bitmap = BitmapFactory.decodeStream(is);
                Photo.setImageBitmap(bitmap);
            }
            Sexe.setSelection(sexe);
            Age.setText(age);
            Taille.setText(taille);
            Poids.setText(poids);
            Nom.setText(nom);
            Prenom.setText(prenom);
            PrendrePhoto.setText(prendPhoto);
        }
    }

    public void doSave()  {
        SharedPreferences Profil= getSharedPreferences("profil", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = Profil.edit();

        EditText Edit1 = ((EditText) findViewById(R.id.editTextTextPersonName3));
        EditText Edit3 = ((EditText) findViewById(R.id.editTextTextPersonName5));
        EditText Edit4 = ((EditText) findViewById(R.id.editTextTextPersonName6));
        EditText Edit5 = ((EditText) findViewById(R.id.editTextTextPersonName));
        EditText Edit6 = ((EditText) findViewById(R.id.editTextTextPersonName2));
        Spinner Sexe = (Spinner) findViewById(R.id.Sexe);
        TextView Edit7 = ((TextView) findViewById(R.id.textView8));
        int Position = Sexe.getSelectedItemPosition();

        editor.putInt("Sexe", Position);
        editor.putString("SexeChoisi", (String) Sexe.getItemAtPosition(Position));
        editor.putString("prendre photo", Edit7.getText().toString());
        editor.putString("age", Edit1.getText().toString());
        editor.putString("taille", Edit3.getText().toString());
        editor.putString("poids", Edit4.getText().toString());
        editor.putString("nom", Edit5.getText().toString());
        editor.putString("prenom", Edit6.getText().toString());
        editor.apply();

        Toast.makeText(this,"Profil saved!",Toast.LENGTH_LONG).show();
    }
    public static String encodeTobase64(Bitmap image) {
        Bitmap bitmap_image = image;
        ByteArrayOutputStream bytePhoto = new ByteArrayOutputStream();
        bitmap_image.compress(Bitmap.CompressFormat.PNG, 100, bytePhoto);
        byte[] b = bytePhoto.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);

        return imageEncoded;
    }
    public void onBackPressed() {
        doSave();
    }
}