package com.example.luism.carofit20.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.luism.carofit20.R;
import com.squareup.picasso.Picasso;

public class InicioActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageViewTittle;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_inicio);
        getSupportActionBar().hide();

        imageView = findViewById(R.id.imageViewBackground);
        imageViewTittle = findViewById(R.id.imageViewTittle);
        button = findViewById(R.id.buttonInicio);

        Picasso.get().load(R.drawable.fondo_de_index).fit().into(imageView);
        Picasso.get().load(R.drawable.logotipo_carofit).fit().into(imageViewTittle);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
