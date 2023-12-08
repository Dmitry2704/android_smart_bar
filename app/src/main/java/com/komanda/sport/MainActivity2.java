package com.komanda.sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textvhod;
    EditText email, password;
    Button vhodvprofil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textvhod = findViewById(R.id.textvhod);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        vhodvprofil = findViewById(R.id.vhodvprofil);



    }
    public void vhod(View v){
        Intent intent = new Intent(this, QRandUstroistvo.class);
        startActivity(intent);

    }



}